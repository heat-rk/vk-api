package ru.heat.vkapi.objects.users;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Users.
 * Подробнее на https://vk.com/dev/users
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Users {

    private final VkApi vkApi;
    public Users(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("users.get",
                args);
        return new JsonHandler(Request.get(url));
    }

    //getFollowers
    public JsonHandler getFollowers(String... args) {
        String url = vkApi.getFinalURL().get("users.getFollowers",
                args);
        return new JsonHandler(Request.get(url));
    }

    //getSubscriptions
    public JsonHandler getSubscribtions(String... args) {
        String url = vkApi.getFinalURL().get("users.getFollowers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //isAppUser
    public JsonHandler isAppUser(String... args) {
        String url = vkApi.getFinalURL().get("users.isAppUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //report
    public JsonHandler report(String... args) {
        String url = vkApi.getFinalURL().get("users.report",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("users.search",
                args);
        return new JsonHandler(Request.get(url));
    }
}
