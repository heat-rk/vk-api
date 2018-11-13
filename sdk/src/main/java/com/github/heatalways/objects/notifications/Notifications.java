package com.github.heatalways.objects.notifications;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Notifications.
 * Подробнее на https://vk.com/dev/notifications
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Notifications {

    private final VkApi vkApi;
    public Notifications(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("notifications.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //markAsViewed
    public JsonHandler markAsViewed() {
        String url = vkApi.getFinalURL().get("notifications.markAsViewed");
        return new JsonHandler(Request.get(url));
    }
}
