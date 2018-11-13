package com.github.heatalways.upload.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;
import ru.heat.vkapi.utils.Request;

import java.io.File;

/**
 * Класс для загрузки видео.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Video extends UploadObject {
    public Video(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка видеозаписи по ссылке
     * @param link ссылка на видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @return объект класса JsonHandler
     * @see Video#upload(File, String...)
     */
    public JsonHandler upload(String link, String... args) {
        String upload_url = vkApi.video.save(
                "link=" + link,
                ArrayToString.toStr(args)).get("upload_url").toString();
        return new JsonHandler(Request.get(upload_url));
    }

    /**
     * Загрузка видеозаписи в группу по ссылке
     * @param link ссылка на видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @param group_id идентификатор группы
     * @return объект класса JsonHandler
     * @see Video#upload(File, String...)
     */
    public JsonHandler upload(String group_id, String link, String... args) {
        String upload_url = vkApi.video.save(
                "link=" + link,
                "group_id=" + group_id,
                ArrayToString.toStr(args)).get("upload_url").toString();
        return new JsonHandler(Request.get(upload_url));
    }

    /**
     * Загрузка видеозаписи
     * @param file видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @return объект класса JsonHandler
     * @see Video#upload(String, String...)
     */
    public JsonHandler upload(File file, String... args) {
        String upload_url = vkApi.video.save(args).get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.video(upload_url, file));
    }

    /**
     * Загрузка видеозаписи в группу
     * @param file видео
     * @param args дополнительные параметры, которые будут использоваться в методах: video.save
     * @param group_id идентификатор группы
     * @return объект класса JsonHandler
     * @see Video#upload(File, String...)
     */
    public JsonHandler upload(String group_id, File file, String... args) {
        String upload_url = vkApi.video.save(
                "group_id=" + group_id,
                ArrayToString.toStr(args)).get("upload_url").toString();
        return new JsonHandler(BodyOfRequest.video(upload_url, file));
    }
}
