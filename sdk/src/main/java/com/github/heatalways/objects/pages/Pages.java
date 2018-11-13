package com.github.heatalways.objects.pages;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Pages.
 * Подробнее на https://vk.com/dev/pages
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Pages {

    private final VkApi vkApi;
    public Pages(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //clearCache
    public JsonHandler clearCache(String... args) {
        String url = vkApi.getFinalURL().get("pages.clearCache",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("pages.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getHistory
    public JsonHandler getHistory(String... args) {
        String url = vkApi.getFinalURL().get("pages.getHistory",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTitles
    public JsonHandler getTitles(String... args) {
        String url = vkApi.getFinalURL().get("pages.getTitles",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getVersion
    public JsonHandler getVersion(String... args) {
        String url = vkApi.getFinalURL().get("pages.getVersion",
                args);
        return new JsonHandler(Request.get(url));
    }


    //parseWiki
    public JsonHandler parseWiki(String... args) {
        String url = vkApi.getFinalURL().get("pages.parseWiki",
                args);
        return new JsonHandler(Request.get(url));
    }


    //save
    public JsonHandler save(String... args) {
        String url = vkApi.getFinalURL().get("pages.save",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveAccess
    public JsonHandler saveAccess(String... args) {
        String url = vkApi.getFinalURL().get("pages.saveAccess",
                args);
        return new JsonHandler(Request.get(url));
    }
}
