package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки обложки группы.
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class CoverGroupPhoto extends UploadObject {
    public CoverGroupPhoto(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка обложки фото
     * @param group_id идентификатор группы
     * @param file фото
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.getOwnerCoverPhotoUploadServer
     * @return объект класса CoverGroupPhoto
     */
    public CoverGroupPhoto upload(String group_id, File file, String... args) {
        String upload_url = vkApi.photos.getOwnerCoverPhotoUploadServer(
                "group_id=" + group_id,
                ArrayToString.toStr(args)).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.coverGroupPhoto(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса JsonHandler
     */
    public JsonHandler save() {
        JsonHandler save = vkApi.photos.saveOwnerCoverPhoto(
                "hash=" + response.get("hash"),
                "photo=" + response.get("photo")
        );
        return save;
    }
}
