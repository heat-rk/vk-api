package com.github.heatalways.objects.apps;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Apps.
 * Подробнее на https://vk.com/dev/apps
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Apps extends MethodObject {
    public final static String deleteAppRequests = "deleteAppRequests";
    public final static String get = "get";
    public final static String getFriendsList = "getFriendsList";
    public final static String getLeaderboard = "getLeaderboard";
    public final static String getScopes = "getScopes";
    public final static String getScore = "getScore";
    public final static String sendRequest = "sendRequest";

    public Apps(VkApi vkApi) {
        super(vkApi);
        object = "apps";
    }
}
