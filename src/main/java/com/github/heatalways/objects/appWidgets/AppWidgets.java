package com.github.heatalways.objects.appWidgets;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта AppWidgets.
 * Подробнее на https://vk.com/dev/appWidgets
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class AppWidgets extends MethodObject {
    public final static String getAppImageUploadServer = "getAppImageUploadServer";
    public final static String getAppImages = "getAppImages";
    public final static String getGroupImageUploadServer = "getGroupImageUploadServer";
    public final static String getGroupImages = "getGroupImages";
    public final static String getImagesById = "getImagesById";
    public final static String saveAppImage = "saveAppImage";
    public final static String saveGroupImage = "saveGroupImage";
    public final static String update = "update";

    public AppWidgets(VkApi vkApi) {
        super(vkApi);
        object = "appWidgets";
    }
}
