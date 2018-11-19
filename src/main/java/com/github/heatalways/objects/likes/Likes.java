package com.github.heatalways.objects.likes;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;


/**
 * Класс для работы с методами объекта Likes.
 * Подробнее на https://vk.com/dev/likes
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Likes extends MethodObject {
    public final static String add = "add";
    public final static String delete = "delete";
    public final static String getList = "getList";
    public final static String isLiked = "isLiked";

    public Likes(VkApi vkApi) {
        super(vkApi);
        object = "likes";
    }
}
