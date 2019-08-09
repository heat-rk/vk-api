package com.github.heatalways.upload.objects;

import com.github.heatalways.objects.docs.Docs;
import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.BodyOfRequest;
import com.github.heatalways.upload.UploadObject;
import com.github.heatalways.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки документов.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class DocumentUpload extends UploadObject {

    /**
     * Конструктор, принимающий в качестве параметра объект класса VkApi
     * @param vkApi объект класса VkApi
     */
    public DocumentUpload(VkApi vkApi) {
        super(vkApi);
    }
    /**
     * Загрузка документа
     * @param file документ
     * @return объект класса DocumentUpload
     * @see DocumentUpload#upload(String, File)
     */
    public DocumentUpload upload(File file) {
        return upload("",file);
    }

    /**
     * Загрузка документа в группу
     * @param group_id идентификатор группы
     * @param file документ
     * @return объект класса DocumentUpload
     * @see DocumentUpload#upload(File)
     */
    public DocumentUpload upload(String group_id, File file) {
        String upload_url = vkApi.docs.method(Docs.getUploadServer).params(
                "group_id=" + group_id).execute().get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.document(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @param args дополнительные параметры, которые будут использоваться в методах: docs.save
     * @return объект класса JsonHandler
     */
    public JsonHandler save(String... args) {
        return vkApi.docs.method(Docs.save).params(
            "file=" + response.get("file"),
                ArrayToString.toStr(args)
        ).execute();
    }
}
