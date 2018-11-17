package com.github.heatalways.objects.market;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Market.
 * Подробнее на https://vk.com/dev/market
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Market {

    private final VkApi vkApi;
    public Market(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("market.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addAlbum
    public JsonHandler addAlbum(String... args) {
        String url = vkApi.getFinalURL().get("market.addAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addToAlbum
    public JsonHandler addToAlbum(String... args) {
        String url = vkApi.getFinalURL().get("market.addToAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("market.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("market.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteAlbum
    public JsonHandler deleteAlbum(String... args) {
        String url = vkApi.getFinalURL().get("market.deleteAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("market.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("market.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editAlbum
    public JsonHandler editAlbum(String... args) {
        String url = vkApi.getFinalURL().get("market.editAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("market.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("market.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbumById
    public JsonHandler getAlbumById(String... args) {
        String url = vkApi.getFinalURL().get("market.getAlbumById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAlbums
    public JsonHandler getAlbums(String... args) {
        String url = vkApi.getFinalURL().get("market.getAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("market.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCategories
    public JsonHandler getCategories(String... args) {
        String url = vkApi.getFinalURL().get("market.getCategories",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("market.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeFromAlbum
    public JsonHandler removeFromAlbum(String... args) {
        String url = vkApi.getFinalURL().get("market.removeFromAlbum",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderAlbums
    public JsonHandler reorderAlbums(String... args) {
        String url = vkApi.getFinalURL().get("market.reorderAlbums",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderItems
    public JsonHandler reorderItems(String... args) {
        String url = vkApi.getFinalURL().get("market.reorderItems",
                args);
        return new JsonHandler(Request.get(url));
    }


    //report
    public JsonHandler report(String... args) {
        String url = vkApi.getFinalURL().get("market.report",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reportComment
    public JsonHandler reportComment(String... args) {
        String url = vkApi.getFinalURL().get("market.reportComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restore
    public JsonHandler restore(String... args) {
        String url = vkApi.getFinalURL().get("market.restore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("market.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("market.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
