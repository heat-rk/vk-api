package com.github.heatalways.objects.streaming;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Streaming.
 * Подробнее на https://vk.com/dev/streaming
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Streaming {

    private final VkApi vkApi;
    public Streaming(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //getServerUrl
    public JsonHandler getServerUrl() {
        String url = vkApi.getFinalURL().get("streaming.getServerUrl");
        return new JsonHandler(Request.get(url));
    }


    //getSettings
    public JsonHandler getSettings() {
        String url = vkApi.getFinalURL().get("streaming.getSettings");
        return new JsonHandler(Request.get(url));
    }


    //getStats
    public JsonHandler getStats(String... args) {
        String url = vkApi.getFinalURL().get("streaming.getStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getStem
    public JsonHandler getStem(String... args) {
        String url = vkApi.getFinalURL().get("streaming.getStem",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setSettings
    public JsonHandler setSettings(String... args) {
        String url = vkApi.getFinalURL().get("streaming.setSettings",
                args);
        return new JsonHandler(Request.get(url));
    }
}
