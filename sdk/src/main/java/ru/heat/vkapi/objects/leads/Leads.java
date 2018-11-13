package ru.heat.vkapi.objects.leads;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Leads.
 * Подробнее на https://vk.com/dev/leads
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Leads {

    private final VkApi vkApi;
    public Leads(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //checkUser
    public JsonHandler checkUser(String... args) {
        String url = vkApi.getFinalURL().get("leads.checkUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //complete
    public JsonHandler complete(String... args) {
        String url = vkApi.getFinalURL().get("leads.complete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getStats
    public JsonHandler getStats(String... args) {
        String url = vkApi.getFinalURL().get("leads.getStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUsers
    public JsonHandler getUsers(String... args) {
        String url = vkApi.getFinalURL().get("leads.getUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //metricHit
    public JsonHandler metricHit(String... args) {
        String url = vkApi.getFinalURL().get("leads.metricHit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //start
    public JsonHandler start(String... args) {
        String url = vkApi.getFinalURL().get("leads.start",
                args);
        return new JsonHandler(Request.get(url));
    }
}
