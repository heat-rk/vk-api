package com.github.heatalways.objects.prettyCards;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта PrettyCards.
 * Подробнее на https://vk.com/dev/prettyCards
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class PrettyCards {

    private final VkApi vkApi;
    public PrettyCards(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //create
    public JsonHandler create(String... args) {
        String url = vkApi.getFinalURL().get("prettyCards.create",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("prettyCards.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("prettyCards.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("prettyCards.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("prettyCards.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUploadURL
    public JsonHandler getUploadURL() {
        String url = vkApi.getFinalURL().get("prettyCards.getUploadURL");
        return new JsonHandler(Request.get(url));
    }
}
