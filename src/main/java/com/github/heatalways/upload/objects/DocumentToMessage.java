package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.docs.Docs;
import com.github.heatalways.objects.messages.Messages;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки документов в сообщение.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class DocumentToMessage extends UploadObject {
    private String peer_id;

    /**
     * Конструктор, принимающий в качестве параметра объект класса VkApi
     * @param vkApi объект класса VkApi
     */
    public DocumentToMessage(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка документа в сообщение
     * @param peer_id идентификатор назначения
     * @param file документ
     * @return объект класса DocumentToMessage
     */
    public DocumentToMessage upload(String peer_id, File file) {
        this.peer_id = peer_id;
        String upload_url = vkApi.docs.method(Docs.getMessagesUploadServer).params(
                "type=doc",
                "peer_id=" + peer_id).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.document(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: docs.save
     * @return объект класса DocumentToMessage
     */
    public DocumentToMessage save(String... args) {
        response = vkApi.docs.method(Docs.save).params(
                "file=" + response.get("file"),
                ArrayToString.toStr(args)
        ).execute().get(0);
        return this;
    }

    /**
     * Отправление сообщения с загруженным документом
     * @param args дополнительные параметры, которые будут использоваться в методах: messages.send
     * @return объект класса JsonHandler
     */
    public JsonHandler send(String... args) {
        return vkApi.messages.method(Messages.send).params(
            "peer_id=" + peer_id,
                "attachment=doc" + response.get("owner_id") + "_" + response.get("id"),
                ArrayToString.toStr(args)
        ).execute();
    }
}
