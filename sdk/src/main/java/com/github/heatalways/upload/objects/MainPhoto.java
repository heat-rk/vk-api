package com.github.heatalways.upload.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;

import java.io.File;

/**
 * Класс для загрузки основного фото.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class MainPhoto extends UploadObject {
    public MainPhoto(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка основной фотографии пользователя
     * @param file фото
     * @return объект класса MainPhoto
     * @see MainPhoto#upload(String, File)
     * @see MainPhoto#upload(File, String)
     * @see MainPhoto#upload(String, File, String)
     */
    public MainPhoto upload(File file) {
        return upload(file, "");
    }

    /**
     * Загрузка основной фотографии пользователя
     * @param file фото
     * @param square_crop квадратная миниатюра фото в формате "x,y,w" (без кавычек), где x и y — координаты верхнего правого угла миниатюры, а w — сторона квадрата
     * @return объект класса MainPhoto
     * @see MainPhoto#upload(String, File)
     * @see MainPhoto#upload(File)
     * @see MainPhoto#upload(String, File, String)
     */
    public MainPhoto upload(File file, String square_crop) {
        return upload("",file, square_crop);
    }

    /**
     * Загрузка основной фотографии группы
     * @param group_id идентификатор группы
     * @param file фото
     * @return объект класса MainPhoto
     * @see MainPhoto#upload(File, String)
     * @see MainPhoto#upload(File)
     * @see MainPhoto#upload(String, File, String)
     */
    public MainPhoto upload(String group_id, File file) {
        return upload(group_id,file, "");
    }

    /**
     * Загрузка основной фотографии группы
     * @param group_id идентификатор группы
     * @param file фото
     * @param square_crop квадратная миниатюра фото в формате "x,y,w" (без кавычек), где x и y — координаты верхнего правого угла миниатюры, а w — сторона квадрата
     * @return объект класса MainPhoto
     * @see MainPhoto#upload(File, String)
     * @see MainPhoto#upload(File)
     * @see MainPhoto#upload(String, File)
     */
    public MainPhoto upload(String group_id, File file, String square_crop) {
        String upload_url = vkApi.photos.getOwnerPhotoUploadServer("owner_id=-" + group_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.mainPhoto(upload_url, file, square_crop));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса JsonHandler
     */
    public JsonHandler save() {
        return vkApi.photos.saveOwnerPhoto(
                "server=" + response.get("server"),
                "hash=" + response.get("hash"),
                "photo=" + response.get("photo")
        );
    }
}
