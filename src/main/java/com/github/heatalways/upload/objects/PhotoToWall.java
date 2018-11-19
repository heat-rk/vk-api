package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.photos.Photos;
import com.github.heatalways.objects.wall.Wall;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото на стену.
 * @author heat"kazyxanovr1@gmail.com"
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
        String upload_url = vkApi.photos.method(Photos.getWallUploadServer).params(
                "group_id=" + group_id).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.photoToWall(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.saveWallPhoto
     * @return объект класса PhotoToWall
     */
    public PhotoToWall save(String... args) {
        response = vkApi.photos.method(Photos.saveWallPhoto).params(
            "group_id=" + group_id,
                "photo=" + response.get("photo"),
                "server=" + response.get("server"),
                "hash=" + response.get("hash"),
                ArrayToString.toStr(args)
        ).execute().get(0);
        return this;
    }

    /**
     * Публикация фото
     * @param args дополнительные параметры, которые будут использоваться в методах: wall.post
     * @return объект класса JsonHandler
     */
    public JsonHandler post(String... args) {
        return vkApi.wall.method(Wall.post).params(
            "attachments=photo" + response.get("owner_id") + "_" + response.get("id"),
                "owner_id=-" + group_id,
                ArrayToString.toStr(args)
        ).execute();
    }
}
