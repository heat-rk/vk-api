package com.github.heatalways.objects.widgets;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Widgets.
 * Подробнее на https://vk.com/dev/widgets
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Widgets extends MethodObject {
    public final static String getComments = "getComments";
    public final static String getPages = "getPages";

    public Widgets(VkApi vkApi) {
        super(vkApi);
    }
}
