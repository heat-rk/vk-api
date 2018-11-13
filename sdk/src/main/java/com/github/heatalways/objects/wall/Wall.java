package com.github.heatalways.objects.wall;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Wall.
 * Подробнее на https://vk.com/dev/wall
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Wall {

    private final VkApi vkApi;
    public Wall(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //closeComments
    public JsonHandler closeComments(String... args) {
        String url = vkApi.getFinalURL().get("wall.closeComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("wall.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("wall.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("wall.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("wall.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editAdsStealth
    public JsonHandler editAdsStealth(String... args) {
        String url = vkApi.getFinalURL().get("wall.editAdsStealth",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("wall.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("wall.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("wall.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("wall.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getReposts
    public JsonHandler getReposts(String... args) {
        String url = vkApi.getFinalURL().get("wall.getReposts",
                args);
        return new JsonHandler(Request.get(url));
    }


    //openComments
    public JsonHandler openComments(String... args) {
        String url = vkApi.getFinalURL().get("wall.openComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //pin
    public JsonHandler pin(String... args) {
        String url = vkApi.getFinalURL().get("wall.pin",
                args);
        return new JsonHandler(Request.get(url));
    }


    //post
    public JsonHandler post(String... args) {
        String url = vkApi.getFinalURL().get("wall.post",
                args);
        return new JsonHandler(Request.get(url));
    }


    //postAdsStealth
    public JsonHandler postAdsStealth(String... args) {
        String url = vkApi.getFinalURL().get("wall.postAdsStealth",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reportComment
    public JsonHandler reportComment(String... args) {
        String url = vkApi.getFinalURL().get("wall.reportComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reportPost
    public JsonHandler reportPost(String... args) {
        String url = vkApi.getFinalURL().get("wall.reportPost",
                args);
        return new JsonHandler(Request.get(url));
    }


    //repost
    public JsonHandler repost(String... args) {
        String url = vkApi.getFinalURL().get("wall.repost",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restore
    public JsonHandler restore(String... args) {
        String url = vkApi.getFinalURL().get("wall.restore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("wall.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("wall.search",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unpin
    public JsonHandler unpin(String... args) {
        String url = vkApi.getFinalURL().get("wall.unpin",
                args);
        return new JsonHandler(Request.get(url));
    }
}
