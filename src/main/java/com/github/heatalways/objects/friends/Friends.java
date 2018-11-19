package com.github.heatalways.objects.friends;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Friends.
 * Подробнее на https://vk.com/dev/friends
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Friends extends MethodObject {
    public final static String add = "add";
    public final static String addList = "addList";
    public final static String areFriends = "areFriends";
    public final static String delete = "delete";
    public final static String deleteAllRequests = "deleteAllRequests";
    public final static String deleteList = "deleteList";
    public final static String edit = "edit";
    public final static String editList = "editList";
    public final static String get = "get";
    public final static String getAppUsers = "getAppUsers";
    public final static String getByPhones = "getByPhones";
    public final static String getLists = "getLists";
    public final static String getMutual = "getMutual";
    public final static String getOnline = "getOnline";
    public final static String getRecent = "getRecent";
    public final static String getRequests = "getRequests";
    public final static String getSuggestions = "getSuggestions";
    public final static String search = "search";

    public Friends(VkApi vkApi) {
        super(vkApi);
        object = "friends";
    }
}
