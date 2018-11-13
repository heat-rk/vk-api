package ru.heat.vkapi.objects.stories;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Stories.
 * Подробнее на https://vk.com/dev/stories
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Stories {

    private final VkApi vkApi;
    public Stories(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //banOwner
    public JsonHandler banOwner(String... args) {
        String url = vkApi.getFinalURL().get("stories.banOwner",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("stories.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("stories.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBanned
    public JsonHandler getBanned(String... args) {
        String url = vkApi.getFinalURL().get("stories.getBanned",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("stories.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPhotoUploadServer
    public JsonHandler getPhotoUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("stories.getPhotoUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getReplies
    public JsonHandler getReplies(String... args) {
        String url = vkApi.getFinalURL().get("stories.getReplies",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getStats
    public JsonHandler getStats(String... args) {
        String url = vkApi.getFinalURL().get("stories.getStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getVideoUploadServer
    public JsonHandler getVideoUploadServer(String... args) {
        String url = vkApi.getFinalURL().get("stories.getVideoUploadServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getViewers
    public JsonHandler getViewers(String... args) {
        String url = vkApi.getFinalURL().get("stories.getViewers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //hideAllReplies
    public JsonHandler hideAllReplies(String... args) {
        String url = vkApi.getFinalURL().get("stories.hideAllReplies",
                args);
        return new JsonHandler(Request.get(url));
    }


    //hideReply
    public JsonHandler hideReply(String... args) {
        String url = vkApi.getFinalURL().get("stories.hideReply",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unbanOwner
    public JsonHandler unbanOwner(String... args) {
        String url = vkApi.getFinalURL().get("stories.unbanOwner",
                args);
        return new JsonHandler(Request.get(url));
    }
}
