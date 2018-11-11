package ru.heat.vkapi.objects.photos;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Photos.
 * Подробнее на https://vk.com/dev/photos
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class Photos {

    private VkApi vkApi;
    public Photos(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //confirmTag
    public JsonHandler confirmTag(String... args) {
        String url = vkApi.getFinalURL().get("photos.confirmTag",
                args);
        return new JsonHandler(Request.get(url));
    }


    //copy
    public JsonHandler copy(String... args) {
        String url = vkApi.getFinalURL().get("photos.copy",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createAlbum
    public JsonHandler createAlbum(String... args) {
        String url = vkApi.getFinalURL().get("photos.createAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("photos.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("photos.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteAlbum
    public JsonHandler deleteAlbum(String... args) {
        String url = vkApi.getFinalURL().get("photos.deleteAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("photos.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("photos.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editAlbum
    public JsonHandler editAlbum(String... args) {
        String url = vkApi.getFinalURL().get("photos.editAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("photos.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("photos.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbums
    public JsonHandler getAlbums(String... args) {
        String url = vkApi.getFinalURL().get("photos.getAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbumsCount
    public JsonHandler getAlbumsCount(String... args) {
        String url = vkApi.getFinalURL().get("photos.getAlbumsCount",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAll
    public JsonHandler getAll(String... args) {
        String url = vkApi.getFinalURL().get("photos.getAll",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAllComments
    public JsonHandler getAllComments(String... args) {
        String url = vkApi.getFinalURL().get("photos.getAllComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("photos.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getChatUploadServer
    public JsonHandler getChatUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getChatUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("photos.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMarketAlbumUploadServer
    public JsonHandler getMarketAlbumUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getMarketAlbumUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMarketUploadServer
    public JsonHandler getMarketUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getMarketUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMessagesUploadServer
    public JsonHandler getMessagesUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getMessagesUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getNewTags
    public JsonHandler getNewTags(String... args) {
        String url = vkApi.getFinalURL().get("photos.getNewTags",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getOwnerCoverPhotoUploadServer
    public JsonHandler getOwnerCoverPhotoUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getOwnerCoverPhotoUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getOwnerPhotoUploadServer
    public JsonHandler getOwnerPhotoUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getOwnerPhotoUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTags
    public JsonHandler getTags(String... args) {
        String url = vkApi.getFinalURL().get("photos.getTags",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUploadServer
    public JsonHandler getUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUserPhotos
    public JsonHandler getUserPhotos(String... args) {
        String url = vkApi.getFinalURL().get("photos.getUserPhotos",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getWallUploadServer
    public JsonHandler getWallUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("photos.getWallUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //makeCover
    public JsonHandler makeCover(String... args) {
        String url = vkApi.getFinalURL().get("photos.makeCover",
                args);
        return new JsonHandler(Request.get(url));
    }


    //move
    public JsonHandler move(String... args) {
        String url = vkApi.getFinalURL().get("photos.move",
                args);
        return new JsonHandler(Request.get(url));
    }


    //putTag
    public JsonHandler putTag(String... args) {
        String url = vkApi.getFinalURL().get("photos.putTag",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeTag
    public JsonHandler removeTag(String... args) {
        String url = vkApi.getFinalURL().get("photos.removeTag",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderAlbums
    public JsonHandler reorderAlbums(String... args) {
        String url = vkApi.getFinalURL().get("photos.reorderAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderPhotos
    public JsonHandler reorderPhotos(String... args) {
        String url = vkApi.getFinalURL().get("photos.reorderPhotos",
                args);
        return new JsonHandler(Request.get(url));
    }


    //report
    public JsonHandler report(String... args) {
        String url = vkApi.getFinalURL().get("photos.report",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reportComment
    public JsonHandler reportComment(String... args) {
        String url = vkApi.getFinalURL().get("photos.reportComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restore
    public JsonHandler restore(String... args) {
        String url = vkApi.getFinalURL().get("photos.restore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("photos.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //save
    public JsonHandler save(String... args) {
        String url = vkApi.getFinalURL().get("photos.save",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveMarketAlbumPhoto
    public JsonHandler saveMarketAlbumPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveMarketAlbumPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveMarketPhoto
    public JsonHandler saveMarketPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveMarketPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveMessagesPhoto
    public JsonHandler saveMessagesPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveMessagesPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveOwnerCoverPhoto
    public JsonHandler saveOwnerCoverPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveOwnerCoverPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveOwnerPhoto
    public JsonHandler saveOwnerPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveOwnerPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveWallPhoto
    public JsonHandler saveWallPhoto(String... args) {
        String url = vkApi.getFinalURL().get("photos.saveWallPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("photos.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
