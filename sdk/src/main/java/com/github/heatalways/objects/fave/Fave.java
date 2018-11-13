package com.github.heatalways.objects.fave;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Fave.
 * Подробнее на https://vk.com/dev/fave
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Fave {

    private final VkApi vkApi;
    public Fave(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    
    //addGroup
    public JsonHandler addGroup(String... args) {
        String url = vkApi.getFinalURL().get("fave.addGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addLink
    public JsonHandler addLink(String... args) {
        String url = vkApi.getFinalURL().get("fave.addLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addUser
    public JsonHandler addUser(String... args) {
        String url = vkApi.getFinalURL().get("fave.addUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLinks
    public JsonHandler getLinks(String... args) {
        String url = vkApi.getFinalURL().get("fave.getLinks",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMarketItems
    public JsonHandler getMarketItems(String... args) {
        String url = vkApi.getFinalURL().get("fave.getMarketItems",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPhotos
    public JsonHandler getPhotos(String... args) {
        String url = vkApi.getFinalURL().get("fave.getPhotos",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUsers
    public JsonHandler getUsers(String... args) {
        String url = vkApi.getFinalURL().get("fave.getUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPosts
    public JsonHandler getPosts(String... args) {
        String url = vkApi.getFinalURL().get("fave.getPosts",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getVideos
    public JsonHandler getVideos(String... args) {
        String url = vkApi.getFinalURL().get("fave.getVideos",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeGroup
    public JsonHandler removeGroup(String... args) {
        String url = vkApi.getFinalURL().get("fave.removeGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeLink
    public JsonHandler removeLink(String... args) {
        String url = vkApi.getFinalURL().get("fave.removeLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeUser
    public JsonHandler removeUser(String... args) {
        String url = vkApi.getFinalURL().get("fave.removeUser",
                args);
        return new JsonHandler(Request.get(url));
    }
}
