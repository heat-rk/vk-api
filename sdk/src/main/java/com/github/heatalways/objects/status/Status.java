package com.github.heatalways.objects.status;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

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
