package com.github.heatalways.objects.video;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Video.
 * Подробнее на https://vk.com/dev/video
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Video {

    private final VkApi vkApi;
    public Video(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("video.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addAlbum
    public JsonHandler addAlbum(String... args) {
        String url = vkApi.getFinalURL().get("video.addAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addToAlbum
    public JsonHandler addToAlbum(String... args) {
        String url = vkApi.getFinalURL().get("video.addToAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("video.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("video.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteAlbum
    public JsonHandler deleteAlbum(String... args) {
        String url = vkApi.getFinalURL().get("video.deleteAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("video.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("video.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editAlbum
    public JsonHandler editAlbum(String... args) {
        String url = vkApi.getFinalURL().get("video.editAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("video.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("video.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbumById
    public JsonHandler getAlbumById(String... args) {
        String url = vkApi.getFinalURL().get("video.getAlbumById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbums
    public JsonHandler getAlbums(String... args) {
        String url = vkApi.getFinalURL().get("video.getAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbumsByVideo
    public JsonHandler getAlbumsByVideo(String... args) {
        String url = vkApi.getFinalURL().get("video.getAlbumsByVideo",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCatalog
    public JsonHandler getCatalog(String... args) {
        String url = vkApi.getFinalURL().get("video.getCatalog",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCatalogSection
    public JsonHandler getCatalogSection(String... args) {
        String url = vkApi.getFinalURL().get("video.getCatalogSection",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("video.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //hideCatalogSection
    public JsonHandler hideCatalogSection(String... args) {
        String url = vkApi.getFinalURL().get("video.hideCatalogSection",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeFromAlbum
    public JsonHandler removeFromAlbum(String... args) {
        String url = vkApi.getFinalURL().get("video.removeFromAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderAlbums
    public JsonHandler reorderAlbums(String... args) {
        String url = vkApi.getFinalURL().get("video.reorderAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderVideos
    public JsonHandler reorderVideos(String... args) {
        String url = vkApi.getFinalURL().get("video.reorderVideos",
                args);
        return new JsonHandler(Request.get(url));
    }


    //report
    public JsonHandler report(String... args) {
        String url = vkApi.getFinalURL().get("video.report",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reportComment
    public JsonHandler reportComment(String... args) {
        String url = vkApi.getFinalURL().get("video.reportComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restore
    public JsonHandler restore(String... args) {
        String url = vkApi.getFinalURL().get("video.restore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("video.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //save
    public JsonHandler save(String... args) {
        String url = vkApi.getFinalURL().get("video.save",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("video.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
