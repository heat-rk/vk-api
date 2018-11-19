package com.github.heatalways.objects.fave;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Fave.
 * Подробнее на https://vk.com/dev/fave
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Fave extends MethodObject {
    public final static String addGroup = "addGroup";
    public final static String addLink = "addLink";
    public final static String addUser = "addUser";
    public final static String getLinks = "getLinks";
    public final static String getMarketItems = "getMarketItems";
    public final static String getPhotos = "getPhotos";
    public final static String getPosts = "getPosts";
    public final static String getUsers = "getUsers";
    public final static String getVideos = "getVideos";
    public final static String removeGroup = "removeGroup";
    public final static String removeLink = "removeLink";
    public final static String removeUser = "removeUser";

    public Fave(VkApi vkApi) {
        super(vkApi);
        object = "fave";
    }
}
