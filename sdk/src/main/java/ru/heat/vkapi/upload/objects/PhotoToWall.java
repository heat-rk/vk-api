package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото на стену.
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class PhotoToWall extends UploadObject {
    private String group_id;
    public PhotoToWall(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка фото на стену
     * @param file фото
     * @return объект класса PhotoToWall
     * @see PhotoToWall#upload(String, File)
     */
    public PhotoToWall upload(File file) {
        return upload("",file);
    }

    /**
     * Загрузка фото на стену группы
     * @param group_id идентификатор группы
     * @param file фото
     * @return объект класса PhotoToWall
     * @see PhotoToWall#upload(File)
     */
    public PhotoToWall upload(String group_id, File file) {
        this.group_id = group_id;
        String upload_url = vkApi.photos.getWallUploadServer("group_id=" + group_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.photoToWall(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.saveWallPhoto
     * @return объект класса PhotoToWall
     */
    public PhotoToWall save(String... args) {
        response = vkApi.photos.saveWallPhoto(
            "group_id=" + group_id,
                "photo=" + response.get("photo"),
                "server=" + response.get("server"),
                "hash=" + response.get("hash"),
                ArrayToString.toStr(args)
        ).get(0);
        return this;
    }

    /**
     * Публикация фото
     * @param args дополнительные параметры, которые будут использоваться в методах: wall.post
     * @return объект класса JsonHandler
     */
    public JsonHandler post(String... args) {
        JsonHandler post = vkApi.wall.post(
            "attachments=photo" + response.get("owner_id") + "_" + response.get("id"),
                "owner_id=-" + group_id,
                ArrayToString.toStr(args)
        );
        return post;
    }
}
