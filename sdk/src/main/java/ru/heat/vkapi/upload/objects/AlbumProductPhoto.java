package ru.heat.vkapi.upload.objects;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.upload.BodyOfRequest;
import ru.heat.vkapi.upload.UploadObject;
import ru.heat.vkapi.utils.ArrayToString;

import java.io.File;

/**
 * Класс для загрузки фото альбома товаров.
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class AlbumProductPhoto extends UploadObject {
    private String group_id;
    public AlbumProductPhoto(VkApi vkApi) {
        super(vkApi);
    }

    /**
     * Загрузка фото на подборку товаров
     * @param group_id идентификатор группы
     * @param file фото
     * @return объект класса AlbumProductPhoto
     */
    public AlbumProductPhoto upload(String group_id, File file) {
        this.group_id = group_id;
        String upload_url = vkApi.photos.getMarketAlbumUploadServer(
                "group_id=" + group_id).get("upload_url").toString();
        response = new JsonHandler(BodyOfRequest.getMarketAlbumPhoto(upload_url, file));
        return this;
    }

    /**
     * Сохранение результата
     * @return объект класса AlbumProductPhoto
     */
    public AlbumProductPhoto save() {
        response = vkApi.photos.saveMarketAlbumPhoto(
            "group_id=" + group_id,
                "photo=" + response.get("photo"),
                "server=" + response.get("server"),
                "hash=" + response.get("hash")
        ).get(0);
        return this;
    }

    /**
     * Создание альбома товаров, используя загруженное фото
     * @param args дополнительные параметры, которые будут использоваться в методах: market.addAlbum
     * @return объект класса JsonHandler
     */
    public JsonHandler addAlbum(String... args) {
        JsonHandler result = vkApi.market.addAlbum(
            "owner_id=-" + group_id,
                "photo_id=" + response.get("id"),
                ArrayToString.toStr(args)
        );
        return result;
    }

    /**
     * Редактирование альбома товаров, используя загруженное фото
     * @param args дополнительные параметры, которые будут использоваться в методах: market.editAlbum
     * @return объект класса JsonHandler
     */
    public JsonHandler editAlbum(String... args) {
        JsonHandler result = vkApi.market.editAlbum(
                "owner_id=-" + group_id,
                "photo_id=" + response.get("id"),
                ArrayToString.toStr(args)
        );
        return result;
    }
}
