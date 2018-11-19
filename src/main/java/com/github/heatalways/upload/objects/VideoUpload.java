package com.github.heatalways.upload.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.objects.video.Video;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;
import com.github.heatalways.utils.Request;

import java.io.File;

/**
 * Класс для загрузки видео.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class VideoUpload extends UploadObject {
    public VideoUpload(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка видеозаписи по ссылке
     * @param link ссылка на видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @return объект класса JsonHandler
     * @see VideoUpload#upload(File, String...)
     */
    public JsonHandler upload(String link, String... args) {
        String upload_url = vkApi.video.method(Video.save).params(
                "link=" + link,
                ArrayToString.toStr(args)).execute().get("upload_url").toString();
        return new JsonHandler(Request.get(upload_url));
    }

    /**
     * Загрузка видеозаписи в группу по ссылке
     * @param link ссылка на видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @param group_id идентификатор группы
     * @return объект класса JsonHandler
     * @see VideoUpload#upload(File, String...)
     */
    public JsonHandler upload(String group_id, String link, String... args) {
        String upload_url = vkApi.video.method(Video.save).params(
                "link=" + link,
                "group_id=" + group_id,
                ArrayToString.toStr(args)).execute().get("upload_url").toString();
        return new JsonHandler(Request.get(upload_url));
    }

    /**
     * Загрузка видеозаписи
     * @param file видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @return объект класса JsonHandler
     * @see VideoUpload#upload(String, String...)
     */
    public JsonHandler upload(File file, String... args) {
        String upload_url = vkApi.video.method(Video.save).params(
                args).execute().get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.video(upload_url, file));
    }

    /**
     * Загрузка видеозаписи в группу
     * @param file видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @param group_id идентификатор группы
     * @return объект класса JsonHandler
     * @see VideoUpload#upload(File, String...)
     */
    public JsonHandler upload(String group_id, File file, String... args) {
        String upload_url = vkApi.video.method(Video.save).params(
                "group_id=" + group_id,
                ArrayToString.toStr(args)).execute().get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.video(upload_url, file));
    }
}
