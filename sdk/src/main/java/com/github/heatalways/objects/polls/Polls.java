package com.github.heatalways.objects.polls;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Polls.
 * Подробнее на https://vk.com/dev/polls
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Polls {

    private final VkApi vkApi;
    public Polls(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addVote
    public JsonHandler addVote(String... args) {
        String url = vkApi.getFinalURL().get("polls.addVote",
                args);
        return new JsonHandler(Request.get(url));
    }


    //create
    public JsonHandler create(String... args) {
        String url = vkApi.getFinalURL().get("polls.create",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("polls.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteVote
    public JsonHandler deleteVote(String... args) {
        String url = vkApi.getFinalURL().get("polls.deleteVote",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBackgrounds
    public JsonHandler getBackgrounds() {
        String url = vkApi.getFinalURL().get("polls.getBackgrounds");
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("polls.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPhotoUploadServer
    public JsonHandler getPhotoUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("polls.getPhotoUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getVoters
    public JsonHandler getVoters(String... args) {
        String url = vkApi.getFinalURL().get("polls.getVoters",
                args);
        return new JsonHandler(Request.get(url));
    }


    //savePhoto
    public JsonHandler savePhoto(String... args) {
        String url = vkApi.getFinalURL().get("polls.savePhoto",
                args);
        return new JsonHandler(Request.get(url));
    }
}
