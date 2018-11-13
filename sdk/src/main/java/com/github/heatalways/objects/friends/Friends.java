package com.github.heatalways.objects.friends;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Friends.
 * Подробнее на https://vk.com/dev/friends
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Friends {

    private final VkApi vkApi;
    public Friends(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    
    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("friends.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addList
    public JsonHandler addList(String... args) {
        String url = vkApi.getFinalURL().get("friends.addList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //areFriends
    public JsonHandler areFriends(String... args) {
        String url = vkApi.getFinalURL().get("friends.areFriends",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("friends.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteAllRequests
    public JsonHandler deleteAllRequests() {
        String url = vkApi.getFinalURL().get("friends.deleteAllRequests");
        return new JsonHandler(Request.get(url));
    }


    //deleteList
    public JsonHandler deleteList(String... args) {
        String url = vkApi.getFinalURL().get("friends.deleteList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("friends.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editList
    public JsonHandler editList(String... args) {
        String url = vkApi.getFinalURL().get("friends.editList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("friends.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAppUsers
    public JsonHandler getAppUsers() {
        String url = vkApi.getFinalURL().get("friends.getAppUsers");
        return new JsonHandler(Request.get(url));
    }


    //getByPhones
    public JsonHandler getByPhones(String... args) {
        String url = vkApi.getFinalURL().get("friends.getByPhones",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLists
    public JsonHandler getLists(String... args) {
        String url = vkApi.getFinalURL().get("friends.getLists",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMutual
    public JsonHandler getMutual(String... args) {
        String url = vkApi.getFinalURL().get("friends.getMutual",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getOnline
    public JsonHandler getOnline(String... args) {
        String url = vkApi.getFinalURL().get("friends.getOnline",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRecent
    public JsonHandler getRecent(String... args) {
        String url = vkApi.getFinalURL().get("friends.getRecent",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRequests
    public JsonHandler getRequests(String... args) {
        String url = vkApi.getFinalURL().get("friends.getRequests",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSuggestions
    public JsonHandler getSuggestions(String... args) {
        String url = vkApi.getFinalURL().get("friends.getSuggestions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("friends.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
