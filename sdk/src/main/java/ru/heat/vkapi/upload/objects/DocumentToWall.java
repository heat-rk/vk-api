package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки документа на стену.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class DocumentToWall extends UploadObject {
    public DocumentToWall(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка документа на стену пользователя
     * @param file документ
     * @return объект класса DocumentToWall
     * @see DocumentToWall#upload(String, File)
     */
    public DocumentToWall upload(File file) {
        return upload("", file);
    }

    /**
     * Загрузка документа на стену группы
     * @param group_id идентификатор группы
     * @param file документ
     * @return объект класса DocumentToWall
     * @see DocumentToWall#upload(File)
     */
    public DocumentToWall upload(String group_id, File file) {
        String upload_url = vkApi.docs.getWallUploadServer(
                "group_id=" + group_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.document(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: docs.save
     * @return объект класса DocumentToWall
     */
    public DocumentToWall save(String... args) {
        response = vkApi.docs.save(
                "file=" + response.get("file"),
                ArrayToString.toStr(args)
        ).get(0);
        return this;
    }

    /**
     * Публикация на стену
     * @param args дополнительные параметры, которые будут использоваться в методах: wall.post
     * @return объект класса JsonHandler
     */
    public JsonHandler post(String... args) {
        return vkApi.wall.post(
                "owner_id=" + response.get("owner_id"),
                "attachments=doc" + response.get("owner_id") + "_" + response.get("id"),
                ArrayToString.toStr(args)
        );
    }
}
