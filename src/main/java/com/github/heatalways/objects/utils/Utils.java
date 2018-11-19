package com.github.heatalways.objects.utils;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Utils.
 * Подробнее на https://vk.com/dev/utils
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Utils extends MethodObject {
    public final static String checkLink = "checkLink";
    public final static String deleteFromLastShortened = "deleteFromLastShortened";
    public final static String getLastShortenedLinks = "getLastShortenedLinks";
    public final static String getLinkStats = "getLinkStats";
    public final static String getServerTime = "getServerTime";
    public final static String getShortLink = "getShortLink";
    public final static String resolveScreenName = "resolveScreenName";

    public Utils(VkApi vkApi) {
        super(vkApi);
        object = "utils";
    }
}
