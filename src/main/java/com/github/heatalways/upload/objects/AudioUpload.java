package com.github.heatalways.upload.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.objects.audio.Audio;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки аудио
 * @author heat"kazyxanovr1@gmail.com"
 */
public class AudioUpload extends UploadObject {
    /**
     * Конструктор, принимающий в качестве параметра объект класса VkApi
     * @param vkApi объект класса VkApi
     */
    public AudioUpload(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка mp3-файла в формате multipart/form-data
     * @param file mp3-файл в формате multipart/form-data
     * @return объект класса AudioUpload
     */
    public AudioUpload upload(File file) {
        String uploadUrl = vkApi.audio.method(Audio.getUploadServer).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.audio(uploadUrl, file));
        return this;
    }

    /**
     * Сохранение аудиозаписи
     * @param args дополнительные параметры сохранения аудиозаписи
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler save(String... args) {
        return vkApi.audio.method(Audio.save).params(
                "server=" + response.get("server"),
                "audio=" + response.get("audio"),
                "hash=" + response.get("hash"),
                ArrayToString.toStr(args)
        ).execute();
    }
}
