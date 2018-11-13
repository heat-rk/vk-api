package com.github.heatalways.objects.newsfeed;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Newsfeed.
 * Подробнее на https://vk.com/dev/newsfeed
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Newsfeed {

    private final VkApi vkApi;
    public Newsfeed(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addBan
    public JsonHandler addBan(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.addBan",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteBan
    public JsonHandler deleteBan(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.deleteBan",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteList
    public JsonHandler deleteList(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.deleteList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBanned
    public JsonHandler getBanned(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getBanned",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLists
    public JsonHandler getLists(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getLists",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMentions
    public JsonHandler getMentions(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getMentions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRecommended
    public JsonHandler getRecommended(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getRecommended",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSuggestedSources
    public JsonHandler getSuggestedSources(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.getSuggestedSources",
                args);
        return new JsonHandler(Request.get(url));
    }


    //ignoreItem
    public JsonHandler ignoreItem(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.ignoreItem",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveList
    public JsonHandler saveList(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.saveList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.search",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unignoreItem
    public JsonHandler unignoreItem(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.unignoreItem",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unsubscribe
    public JsonHandler unsubscribe(String... args) {
        String url = vkApi.getFinalURL().get("newsfeed.unsubscribe",
                args);
        return new JsonHandler(Request.get(url));
    }
}
