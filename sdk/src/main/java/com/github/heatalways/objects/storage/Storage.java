package com.github.heatalways.objects.storage;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Storage.
 * Подробнее на https://vk.com/dev/storage
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Storage {

    private final VkApi vkApi;
    public Storage(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("storage.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getKeys
    public JsonHandler getKeys(String... args) {
        String url = vkApi.getFinalURL().get("storage.getKeys",
                args);
        return new JsonHandler(Request.get(url));
    }


    //set
    public JsonHandler set(String... args) {
        String url = vkApi.getFinalURL().get("storage.set",
                args);
        return new JsonHandler(Request.get(url));
    }
}
