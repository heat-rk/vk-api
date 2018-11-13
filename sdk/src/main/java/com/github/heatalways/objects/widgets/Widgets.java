package com.github.heatalways.objects.widgets;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Widgets.
 * Подробнее на https://vk.com/dev/widgets
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Widgets {

    private final VkApi vkApi;
    public Widgets(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("widgets.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPages
    public JsonHandler getPages(String... args) {
        String url = vkApi.getFinalURL().get("widgets.getPages",
                args);
        return new JsonHandler(Request.get(url));
    }
}
