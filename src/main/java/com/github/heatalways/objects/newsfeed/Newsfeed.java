package com.github.heatalways.objects.newsfeed;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Newsfeed.
 * Подробнее на https://vk.com/dev/newsfeed
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Newsfeed extends MethodObject {
    public final static String addBan = "addBan";
    public final static String deleteBan = "deleteBan";
    public final static String deleteList = "deleteList";
    public final static String get = "get";
    public final static String getBanned = "getBanned";
    public final static String getComments = "getComments";
    public final static String getDiscoverForContestant = "getDiscoverForContestant";
    public final static String getLists = "getLists";
    public final static String getMentions = "getMentions";
    public final static String getRecommended = "getRecommended";
    public final static String getSuggestedSources = "getSuggestedSources";
    public final static String ignoreItem = "ignoreItem";
    public final static String saveList = "saveList";
    public final static String search = "search";
    public final static String unignoreItem = "unignoreItem";
    public final static String unsubscribe = "unsubscribe";

    public Newsfeed(VkApi vkApi) {
        super(vkApi);
        object = "newsfeed";
    }
}
