package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото чата.
 * @author heat<kazyxanovr1@gmail.com>
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
        JsonHandler save = vkApi.messages.setChatPhoto(
            "file=" + response.get("response")
        );
        return save;
    }
}
