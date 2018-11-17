package com.github.heatalways.objects.status;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Status.
 * Подробнее на https://vk.com/dev/status
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Status {

    private final VkApi vkApi;
    public Status(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("status.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //set
    public JsonHandler set(String... args) {
        String url = vkApi.getFinalURL().get("status.set",
                args);
        return new JsonHandler(Request.get(url));
    }
}
