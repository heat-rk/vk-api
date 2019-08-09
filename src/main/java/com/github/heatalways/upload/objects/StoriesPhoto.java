package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.stories.Stories;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;

import java.io.File;

/**
 * Класс для загрузки фото в историю.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class StoriesPhoto extends UploadObject {
    /**
     * Конструктор, принимающий в качестве параметра объект класса VkApi
     * @param vkApi объект класса VkApi
     */
    public StoriesPhoto(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка фото в историю
     * @param file фото
     * @param args дополнительные параметры, которые будут использоваться в методах: stories.getPhotoUploadServer
     * @return объект класса JsonHandler
     */
    public JsonHandler upload(File file, String... args) {
        String upload_url = vkApi.stories.method(Stories.getPhotoUploadServer)
                .params(args).execute().get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.storiesPhoto(upload_url, file));
    }
}
