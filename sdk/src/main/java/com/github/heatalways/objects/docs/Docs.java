package com.github.heatalways.objects.docs;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Docs.
 * Подробнее на https://vk.com/dev/docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Docs {

    private final VkApi vkApi;
    public Docs(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    
    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("docs.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("docs.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("docs.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("docs.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("docs.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMessagesUploadServer
    public JsonHandler getMessagesUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("docs.getMessagesUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTypes
    public JsonHandler getTypes(String... args) {
        String url = vkApi.getFinalURL().get("docs.getTypes",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUploadServer
    public JsonHandler getUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("docs.getUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getWallUploadServer
    public JsonHandler getWallUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("docs.getWallUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //save
    public JsonHandler save(String... args) {
        String url = vkApi.getFinalURL().get("docs.save",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("docs.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
