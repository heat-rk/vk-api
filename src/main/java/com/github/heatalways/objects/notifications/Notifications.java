package com.github.heatalways.objects.notifications;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Notifications.
 * Подробнее на https://vk.com/dev/notifications
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Notifications extends MethodObject {
    public final static String get = "get";
    public final static String markAsViewed = "markAsViewed";
    public final static String sendMessage = "sendMessage";

    public Notifications(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "notifications";
    }
}
