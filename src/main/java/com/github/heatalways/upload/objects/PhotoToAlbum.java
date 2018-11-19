package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.photos.Photos;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото в определенный альбом.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class PhotoToAlbum extends UploadObject {
    private String group_id;
    private String album_id;
    public PhotoToAlbum(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка фото в определенный альбом
     * @param album_id идентификатор альбома, в который нужно загрузить фото
     * @param files фото(за один раз можно загрузить не более 5 фото!)
     * @return объект класса PhotoToAlbum
     * @see PhotoToAlbum#upload(String, String, File[])
     */
    public PhotoToAlbum upload(String album_id, File[] files) {
        return upload("", album_id, files);
    }

    /**
     * Загрузка фото в определенный альбом группы
     * @param group_id идентификатор группы
     * @param album_id идентификатор альбома, в который нужно загрузить фото
     * @param files фото(за один раз можно загрузить не более 5 фото!)
     * @return объект класса PhotoToAlbum
     * @see PhotoToAlbum#upload(String, File[])
     */
    public PhotoToAlbum upload(String group_id, String album_id, File[] files) {
        this.group_id = group_id;
        this.album_id = album_id;
        if (files.length > 5) {
            throw new ArrayIndexOutOfBoundsException("length of Array(files) is: " + files.length + ", max length is 5!");
        }
        String upload_url = vkApi.photos.method(Photos.getUploadServer).params(
                "group_id=" + group_id,
                "album_id=" + album_id).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.photoToAlbum(upload_url, files));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.save
     * @return объект класса JsonHandler
     */
    public JsonHandler save(String... args) {
        return vkApi.photos.method(Photos.save).params(
                "server=" + response.get("server"),
                "photos_list=" + response.get("photos_list"),
                "aid=" + response.get("aid"),
                "hash=" + response.get("hash"),
                "group_id=" + group_id,
                "album_id=" + album_id,
                ArrayToString.toStr(args)
        ).execute();
    }
}
