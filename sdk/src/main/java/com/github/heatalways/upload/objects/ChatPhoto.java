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
 * Класс для загрузки фото чата.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class ChatPhoto extends UploadObject {
    public ChatPhoto(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка главной фотографии чата
     * @param chat_id идентификатор беседы, для которой нужно загрузить фотографию
     * @param file фото
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.getChatUploadServer
     * @return объект класса ChatPhoto
     */
    public ChatPhoto upload(String chat_id, File file, String... args) {
        String upload_url = vkApi.photos.getChatUploadServer(
                "chat_id=" + chat_id,
                ArrayToString.toStr(args)).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.chatPhoto(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса JsonHandler
     */
    public JsonHandler save() {
        return vkApi.messages.setChatPhoto(
            "file=" + response.get("response")
        );
    }
}
