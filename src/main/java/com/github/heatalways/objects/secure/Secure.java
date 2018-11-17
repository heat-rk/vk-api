package com.github.heatalways.objects.secure;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Secure.
 * Подробнее на https://vk.com/dev/secure
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Secure {

    private final VkApi vkApi;
    public Secure(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addAppEvent
    public JsonHandler addAppEvent(String... args) {
        String url = vkApi.getFinalURL().get("secure.addAppEvent",
                args);
        return new JsonHandler(Request.get(url));
    }


    //checkToken
    public JsonHandler checkToken(String... args) {
        String url = vkApi.getFinalURL().get("secure.checkToken",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAppBalance
    public JsonHandler getAppBalance(String... args) {
        String url = vkApi.getFinalURL().get("secure.getAppBalance",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSMSHistory
    public JsonHandler getSMSHistory(String... args) {
        String url = vkApi.getFinalURL().get("secure.getSMSHistory",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTransactionsHistory
    public JsonHandler getTransactionsHistory() {
        String url = vkApi.getFinalURL().get("secure.getTransactionsHistory");
        return new JsonHandler(Request.get(url));
    }


    //getUserLevel
    public JsonHandler getUserLevel(String... args) {
        String url = vkApi.getFinalURL().get("secure.getUserLevel",
                args);
        return new JsonHandler(Request.get(url));
    }


    //sendNotification
    public JsonHandler sendNotification(String... args) {
        String url = vkApi.getFinalURL().get("secure.sendNotification",
                args);
        return new JsonHandler(Request.get(url));
    }


    //sendSMSNotification
    public JsonHandler sendSMSNotification(String... args) {
        String url = vkApi.getFinalURL().get("secure.sendSMSNotification",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setCounter
    public JsonHandler setCounter(String... args) {
        String url = vkApi.getFinalURL().get("secure.setCounter",
                args);
        return new JsonHandler(Request.get(url));
    }
}
