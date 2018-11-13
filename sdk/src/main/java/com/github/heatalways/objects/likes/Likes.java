package com.github.heatalways.objects.likes;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;


/**
 * Класс для работы с методами объекта Likes.
 * Подробнее на https://vk.com/dev/likes
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Likes {

    private final VkApi vkApi;
    public Likes(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("likes.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("likes.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getList
    public JsonHandler getList(String... args) {
        String url = vkApi.getFinalURL().get("likes.getList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //isLiked
    public JsonHandler isLiked(String... args) {
        String url = vkApi.getFinalURL().get("likes.isLiked",
                args);
        return new JsonHandler(Request.get(url));
    }
}
