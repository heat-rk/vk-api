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
 * Класс для загрузки фото в сообщение.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class PhotoToMessage extends UploadObject {
    private String peer_id;
    public PhotoToMessage(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка фото в сообщение
     * @param peer_id идентификатор назначения
     * @param file фото
     * @return объект класса PhotoToMessage
     */
    public PhotoToMessage upload(String peer_id, File file) {
        this.peer_id = peer_id;
        String upload_url = vkApi.photos.getMessagesUploadServer("peer_id=" + peer_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.photoToMessage(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса PhotoToMessage
     */
    public PhotoToMessage save() {
        response = vkApi.photos.saveMessagesPhoto(
                "photo=" + response.get("photo"),
                "server=" + response.get("server"),
                "hash=" + response.get("hash")
        ).get(0);
        return this;
    }
    public JsonHandler post(String... args) {
        return vkApi.messages.send(
            "attachment=photo" + response.get("owner_id") + "_" + response.get("id"),
                "peer_id=" + peer_id,
                ArrayToString.toStr(args)
        );
    }
}
