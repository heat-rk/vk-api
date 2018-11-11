package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;

import java.io.File;

/**
 * Класс для загрузки видео в историю.
 * @author heat<kazyxanovr1@gmail.com>
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
        String upload_url = vkApi.stories.getVideoUploadServer(
                args).get("upload_url").toString();
        JsonHandler response = new JsonHandler(BodyOfRequest.storiesVideo(upload_url, video_file));
        return response;
    }
}
