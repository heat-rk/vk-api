package com.github.heatalways.objects.storage;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Storage.
 * Подробнее на https://vk.com/dev/storage
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Storage extends MethodObject {
    public final static String get = "get";
    public final static String set = "set";
    public final static String getKeys = "getKeys";

    public Storage(VkApi vkApi) {
        super(vkApi);
        object = "storage";
    }
}
