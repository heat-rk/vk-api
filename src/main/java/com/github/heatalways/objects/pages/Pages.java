package com.github.heatalways.objects.pages;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Pages.
 * Подробнее на https://vk.com/dev/pages
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Pages extends MethodObject {
    public final static String clearCache = "clearCache";
    public final static String get = "get";
    public final static String getHistory = "getHistory";
    public final static String getTitles = "getTitles";
    public final static String getVersion = "getVersion";
    public final static String parseWiki = "parseWiki";
    public final static String save = "save";
    public final static String saveAccess = "saveAccess";

    public Pages(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "pages";
    }
}
