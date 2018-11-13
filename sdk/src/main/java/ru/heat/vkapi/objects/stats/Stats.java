package ru.heat.vkapi.objects.stats;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Stats.
 * Подробнее на https://vk.com/dev/stats
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Stats {

    private final VkApi vkApi;
    public Stats(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("stats.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPostReach
    public JsonHandler getPostReach(String... args) {
        String url = vkApi.getFinalURL().get("stats.getPostReach",
                args);
        return new JsonHandler(Request.get(url));
    }


    //trackVisitor
    public JsonHandler trackVisitor() {
        String url = vkApi.getFinalURL().get("stats.trackVisitor");
        return new JsonHandler(Request.get(url));
    }
}
