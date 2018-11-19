package com.github.heatalways.objects.wall;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Wall.
 * Подробнее на https://vk.com/dev/wall
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Wall extends MethodObject {
    public final static String closeComments = "closeComments";
    public final static String createComment = "createComment";
    public final static String delete = "delete";
    public final static String deleteComment = "deleteComment";
    public final static String edit = "edit";
    public final static String editAdsStealth = "editAdsStealth";
    public final static String editComment = "editComment";
    public final static String get = "get";
    public final static String getById = "getById";
    public final static String getComments = "getComments";
    public final static String getReposts = "getReposts";
    public final static String openComments = "openComments";
    public final static String pin = "pin";
    public final static String post = "post";
    public final static String postAdsStealth = "postAdsStealth";
    public final static String reportComment = "reportComment";
    public final static String reportPost = "reportPost";
    public final static String repost = "repost";
    public final static String restore = "restore";
    public final static String restoreComment = "restoreComment";
    public final static String search = "search";
    public final static String unpin = "unpin";

    public Wall(VkApi vkApi) {
        super(vkApi);
        object = "wall";
    }
}
