package com.github.heatalways.objects.polls;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Polls.
 * Подробнее на https://vk.com/dev/polls
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Polls extends MethodObject {
    public final static String addVote = "addVote";
    public final static String create = "create";
    public final static String deleteVote = "deleteVote";
    public final static String edit = "edit";
    public final static String getBackgrounds = "getBackgrounds";
    public final static String getById = "getById";
    public final static String getPhotoUploadServer = "getPhotoUploadServer";
    public final static String getVoters = "getVoters";
    public final static String savePhoto = "savePhoto";

    public Polls(VkApi vkApi) {
        super(vkApi);
        object = "polls";
    }
}
