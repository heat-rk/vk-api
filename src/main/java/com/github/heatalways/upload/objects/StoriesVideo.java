package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.stories.Stories;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;

import java.io.File;

/**
 * Класс для загрузки видео в историю.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class StoriesVideo extends UploadObject {
    public StoriesVideo(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка видео в историю
     * @param video_file видео
     * @param args дополнительные параметры, которые будут использоваться в методах: stories.getVideoUploadServer
     * @return объект класса JsonHandler
     */
    public JsonHandler upload(File video_file, String... args) {
        String upload_url = vkApi.stories.method(Stories.getVideoUploadServer).params(
                args).execute().get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.storiesVideo(upload_url, video_file));
    }
}
