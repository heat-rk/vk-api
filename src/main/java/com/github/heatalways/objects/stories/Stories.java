package com.github.heatalways.objects.stories;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Stories.
 * Подробнее на https://vk.com/dev/stories
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Stories extends MethodObject {
    public final static String banOwner = "banOwner";
    public final static String delete = "delete";
    public final static String get = "get";
    public final static String getBanned = "getBanned";
    public final static String getById = "getById";
    public final static String getPhotoUploadServer = "getPhotoUploadServer";
    public final static String getReplies = "getReplies";
    public final static String getStats = "getStats";
    public final static String getVideoUploadServer = "getVideoUploadServer";
    public final static String getViewers = "getViewers";
    public final static String hideAllReplies = "hideAllReplies";
    public final static String hideReply = "hideReply";
    public final static String unbanOwner = "unbanOwner";

    public Stories(VkApi vkApi) {
        super(vkApi);
        object = "stories";
    }
}
