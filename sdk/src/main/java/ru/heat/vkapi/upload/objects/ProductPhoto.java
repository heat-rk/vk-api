package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото товара.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class ProductPhoto extends UploadObject {
    private int main_photo;
    private String group_id;
    public ProductPhoto(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка фото для товара
     * @param group_id идентификатор группы
     * @param main_photo является ли фотография обложкой товара (1 — фотография для обложки, 0 — дополнительная фотография)
     * @param file фото
     * @param args дополнительные параметры, которые будут использоваться в методах: photos.getMarketUploadServer
     * @return объект класса ProductPhoto
     */
    public ProductPhoto upload(String group_id, int main_photo, File file, String... args) {
        this.main_photo = main_photo;
        this.group_id = group_id;
        String upload_url = vkApi.photos.getMarketUploadServer(
                "group_id=" + group_id,
                "main_photo=" + main_photo,
                ArrayToString.toStr(args)).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.productPhoto(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса ProductPhoto
     */
    public ProductPhoto save() {
        if (main_photo == 1) {
            response = vkApi.photos.saveMarketPhoto(
                "server=" + response.get("server"),
                    "photo=" + response.get("photo"),
                    "hash=" + response.get("hash"),
                    "crop_data=" + response.get("crop_data"),
                    "crop_hash=" + response.get("crop_hash"),
                    "group_id=" + group_id
            ).get(0);
        } else {
            response = vkApi.photos.saveMarketPhoto(
                    "server=" + response.get("server"),
                    "photo=" + response.get("photo"),
                    "hash=" + response.get("hash"),
                    "group_id=" + group_id
            ).get(0);
        }
        return this;
    }

    /**
     * Создание товара, используя загруженное фото
     * @param args дополнительные параметры, которые будут использоваться в методах: market.add
     * @return объект класса JsonHandler
     */
    public JsonHandler marketAdd(String... args) {
        if (main_photo == 1) {
            return vkApi.market.add(
                    "main_photo_id=" + response.get("id"),
                    "owner_id=-" + group_id,
                    ArrayToString.toStr(args)
            );
        } else {
            return vkApi.market.add(
                    "photo_ids=" + response.get("id"),
                    "owner_id=-" + group_id,
                    ArrayToString.toStr(args)
            );
        }
    }

    /**
     * Редактирование товара, используя загруженное фото
     * @param args дополнительные параметры, которые будут использоваться в методах: market.edit
     * @return объект класса JsonHandler
     */
    public JsonHandler marketEdit(String... args) {
        if (main_photo == 1) {
            return vkApi.market.edit(
                    "main_photo_id=" + response.get("id"),
                    "owner_id=-" + group_id,
                    ArrayToString.toStr(args)
            );
        } else {
            return vkApi.market.edit(
                    "photo_ids=" + response.get("id"),
                    "owner_id=-" + group_id,
                    ArrayToString.toStr(args)
            );
        }
    }
}
