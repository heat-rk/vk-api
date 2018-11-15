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
 * Класс для загрузки документов.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Document extends UploadObject {
    public Document(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка документа
     * @param file документ
     * @return объект класса Document
     * @see Document#upload(String, File)
     */
    public Document upload(File file) {
        return upload("",file);
    }

    /**
     * Загрузка документа в группу
     * @param group_id идентификатор группы
     * @param file документ
     * @return объект класса Document
     * @see Document#upload(File)
     */
    public Document upload(String group_id, File file) {
        String upload_url = vkApi.docs.getUploadServer(
                "group_id=" + group_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.document(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: docs.save
     * @return объект класса JsonHandler
     */
    public JsonHandler save(String... args) {
        return vkApi.docs.save(
            "file=" + response.get("file"),
                ArrayToString.toStr(args)
        );
    }
}
