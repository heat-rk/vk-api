package com.github.heatalways.objects.stats;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Stats.
 * Подробнее на https://vk.com/dev/stats
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Stats extends MethodObject {
    public final static String get = "get";
    public final static String getPostReach = "getPostReach";
    public final static String trackVisitor = "trackVisitor";

    public Stats(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "stats";
    }
}
