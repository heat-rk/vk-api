package com.github.heatalways.objects.notifications;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

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
