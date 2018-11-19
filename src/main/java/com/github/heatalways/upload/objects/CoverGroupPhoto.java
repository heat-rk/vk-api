package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.photos.Photos;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки обложки группы.
 * @author heat"kazyxanovr1@gmail.com"
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
        String upload_url = vkApi.photos.method(Photos.getOwnerCoverPhotoUploadServer).params(
                "group_id=" + group_id,
                ArrayToString.toStr(args)).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.coverGroupPhoto(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса JsonHandler
     */
    public JsonHandler save() {
        return vkApi.photos.method(Photos.saveOwnerCoverPhoto).params(
                "hash=" + response.get("hash"),
                "photo=" + response.get("photo")
        ).execute();
    }
}
