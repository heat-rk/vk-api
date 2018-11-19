package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.messages.Messages;
import com.github.heatalways.objects.photos.Photos;
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
        String upload_url = vkApi.photos.method(Photos.getMessagesUploadServer).params(
                "peer_id=" + peer_id).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.photoToMessage(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса PhotoToMessage
     */
    public PhotoToMessage save() {
        response = vkApi.photos.method(Photos.saveMessagesPhoto).params(
                "photo=" + response.get("photo"),
                "server=" + response.get("server"),
                "hash=" + response.get("hash")
        ).execute().get(0);
        return this;
    }
    public JsonHandler post(String... args) {
        return vkApi.messages.method(Messages.send).params(
            "attachment=photo" + response.get("owner_id") + "_" + response.get("id"),
                "peer_id=" + peer_id,
                ArrayToString.toStr(args)
        ).execute();
    }
}
