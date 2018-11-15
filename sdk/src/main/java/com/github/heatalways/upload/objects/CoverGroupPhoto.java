package com.github.heatalways.upload.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;
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
        return vkApi.photos.saveOwnerCoverPhoto(
                "hash=" + response.get("hash"),
                "photo=" + response.get("photo")
        );
    }
}
