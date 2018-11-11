package ru.heat.vkapi.objects.apps;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Apps.
 * Подробнее на https://vk.com/dev/apps
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class Apps {

    private VkApi vkApi;
    public Apps(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //deleteAppRequests
    public JsonHandler deleteAppRequests() {
        String url = vkApi.getFinalURL().get("apps.deleteAppRequests",
                "");
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("apps.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCatalog
    public JsonHandler getCatalog(String... args) {
        String url = vkApi.getFinalURL().get("apps.getCatalog",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getFriendsList
    public JsonHandler getFriendsList(String... args) {
        String url = vkApi.getFinalURL().get("apps.getFriendsList",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLeaderboard
    public JsonHandler getLeaderboard(String... args) {
        String url = vkApi.getFinalURL().get("apps.getLeaderboard",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getScopes
    public JsonHandler getScopes() {
        String url = vkApi.getFinalURL().get("apps.getScopes",
                "");
        return new JsonHandler(Request.get(url));
    }


    //getScore
    public JsonHandler getScore(String... args) {
        String url = vkApi.getFinalURL().get("apps.getScore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //sendRequest
    public JsonHandler sendRequest(String... args) {
        String url = vkApi.getFinalURL().get("apps.sendRequest",
                args);
        return new JsonHandler(Request.get(url));
    }
}
