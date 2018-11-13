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
 * Класс для загрузки фото в историю.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class StoriesPhoto extends UploadObject {
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
        String upload_url = vkApi.stories.getPhotoUploadServer(args).get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.storiesPhoto(upload_url, file));
    }
}
