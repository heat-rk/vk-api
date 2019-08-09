package com.github.heatalways.objects.search;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Search.
 * Подробнее на https://vk.com/dev/search
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Search extends MethodObject {
    public final static String getHints = "getHints";

    public Search(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "search";
    }
}
