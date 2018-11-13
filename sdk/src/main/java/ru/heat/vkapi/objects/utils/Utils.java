package ru.heat.vkapi.objects.utils;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Utils.
 * Подробнее на https://vk.com/dev/utils
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Utils {

    private final VkApi vkApi;
    public Utils(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //checkLink
    public JsonHandler checkLink(String... args) {
        String url = vkApi.getFinalURL().get("utils.checkLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteFromLastShortened
    public JsonHandler deleteFromLastShortened(String... args) {
        String url = vkApi.getFinalURL().get("utils.deleteFromLastShortened",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLastShortenedLinks
    public JsonHandler getLastShortenedLinks(String... args) {
        String url = vkApi.getFinalURL().get("utils.getLastShortenedLinks",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLinkStats
    public JsonHandler getLinkStats(String... args) {
        String url = vkApi.getFinalURL().get("utils.getLinkStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getServerTime
    public JsonHandler getServerTime() {
        String url = vkApi.getFinalURL().get("utils.getServerTime");
        return new JsonHandler(Request.get(url));
    }


    //getShortLink
    public JsonHandler getShortLink(String... args) {
        String url = vkApi.getFinalURL().get("utils.getShortLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //resolveScreenName
    public JsonHandler resolveScreenName(String... args) {
        String url = vkApi.getFinalURL().get("utils.resolveScreenName",
                args);
        return new JsonHandler(Request.get(url));
    }
}
