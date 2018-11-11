package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;

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
        JsonHandler post = vkApi.messages.send(
            "attachment=photo" + response.get("owner_id") + "_" + response.get("id"),
                "peer_id=" + peer_id
        );
        return post;
    }
}
