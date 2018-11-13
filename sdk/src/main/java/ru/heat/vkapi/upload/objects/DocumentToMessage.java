package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки документов в сообщение.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class DocumentToMessage extends UploadObject {
    private String peer_id;
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
        String upload_url = vkApi.docs.getMessagesUploadServer(
                "type=doc",
                "peer_id=" + peer_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.document(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: docs.save
     * @return объект класса DocumentToMessage
     */
    public DocumentToMessage save(String... args) {
        response = vkApi.docs.save(
                "file=" + response.get("file"),
                ArrayToString.toStr(args)
        ).get(0);
        return this;
    }

    /**
     * Отправление сообщения с загруженным документом
     * @param args дополнительные параметры, которые будут использоваться в методах: messages.send
     * @return объект класса JsonHandler
     */
    public JsonHandler send(String... args) {
        return vkApi.messages.send(
            "peer_id=" + peer_id,
                "attachment=doc" + response.get("owner_id") + "_" + response.get("id"),
                ArrayToString.toStr(args)
        );
    }
}
