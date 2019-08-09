package com.github.heatalways.objects.gifts;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Gifts.
 * Подробнее на https://vk.com/dev/gifts
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Gifts extends MethodObject {
    public final static String get = "get";

    public Gifts(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "gifts";
    }
}
