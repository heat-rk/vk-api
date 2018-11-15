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
 * Класс для загрузки аудиосообщения.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class AudioMessage extends UploadObject {
    private String peer_id;
    public AudioMessage(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка аудиосообщени
     * @param peer_id идентификатор назначения
     * @param file аудио
     * @return объект класса AudioMessage
     */
    public AudioMessage upload(String peer_id, File file) {
        this.peer_id = peer_id;
        String upload_url = vkApi.docs.getMessagesUploadServer(
                "peer_id=" + peer_id,
                "type=audio_message").get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.audioMessage(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса AudioMessage
     */
    public AudioMessage save() {
        response = vkApi.docs.save(
          "file=" + response.get("file")
        ).get(0);
        return this;
    }

    /**
     * Отправление сообщения с аудиосообщением
     * @param args дополнительные параметры, которые будут использоваться в методах: messages.send
     * @return объект класса JsonHandler
     */
    public JsonHandler send(String... args) {
        return vkApi.messages.send(
            "peer_id=" + peer_id,
                "attachment=audio" + response.get("owner_id") + "_" + response.get("id"),
                ArrayToString.toStr(args)
        );
    }
}
