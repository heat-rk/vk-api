package com.github.heatalways.objects.status;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Status.
 * Подробнее на https://vk.com/dev/status
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Status extends MethodObject {
    public final static String get = "get";
    public final static String set = "set";

    public Status(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "status";
    }
}
