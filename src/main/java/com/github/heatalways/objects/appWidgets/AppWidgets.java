package com.github.heatalways.objects.appWidgets;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта AppWidgets.
 * Подробнее на https://vk.com/dev/appWidgets
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class AppWidgets {

    private final VkApi vkApi;
    public AppWidgets(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //getAppImageUploadServer
    public JsonHandler getAppImageUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.getAppImageUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAppImages
    public JsonHandler getAppImages(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.getAppImages",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getGroupImageUploadServer
    public JsonHandler getGroupImageUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.getGroupImageUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getGroupImages
    public JsonHandler getGroupImages(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.getGroupImages",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getImagesById
    public JsonHandler getImagesById(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.getImagesById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveAppImage
    public JsonHandler saveAppImage(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.saveAppImage",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveGroupImage
    public JsonHandler saveGroupImage(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.saveGroupImage",
                args);
        return new JsonHandler(Request.get(url));
    }


    //update
    public JsonHandler update(String... args) {
        String url = vkApi.getFinalURL().get("appWidgets.update",
                args);
        return new JsonHandler(Request.get(url));
    }
}
