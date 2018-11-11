package ru.heat.vkapi.objects.account;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Account.
 * Подробнее на https://vk.com/dev/account
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Account {
    private VkApi vkApi;
    public Account(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //ban
    public JsonHandler ban(String... args) {
        String url = vkApi.getFinalURL().get("account.ban",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unban
    public JsonHandler unban(String... args) {
        String url = vkApi.getFinalURL().get("account.unban",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getActiveOffers
    public JsonHandler getActiveOffers(String... args) {
        String url = vkApi.getFinalURL().get("account.getActiveOffers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAppPermissions
    public JsonHandler getAppPermissions(String... args) {
        String url = vkApi.getFinalURL().get("account.getAppPermissions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBanned
    public JsonHandler getBanned(String... args) {
        String url = vkApi.getFinalURL().get("account.getBanned",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCounters
    public JsonHandler getCounters(String... args) {
        String url = vkApi.getFinalURL().get("account.getCounters",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getInfo
    public JsonHandler getInfo(String... args) {
        String url = vkApi.getFinalURL().get("account.getInfo",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getProfileInfo
    public JsonHandler getProfileInfo() {
        String url = vkApi.getFinalURL().get("account.getProfileInfo",
                "");
        return new JsonHandler(Request.get(url));
    }


    //saveProfileInfo
    public JsonHandler saveProfileInfo(String... args) {
        String url = vkApi.getFinalURL().get("account.saveProfileInfo",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setInfo
    public JsonHandler setInfo(String... args) {
        String url = vkApi.getFinalURL().get("account.setInfo",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setNameInMenu
    public JsonHandler setNameInMenu(String... args) {
        String url = vkApi.getFinalURL().get("account.setNameInMenu",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setOffline
    public JsonHandler setOffline() {
        String url = vkApi.getFinalURL().get("account.setOffline",
                "");
        return new JsonHandler(Request.get(url));
    }


    //setOnline
    public JsonHandler setOnline(String... args) {
        String url = vkApi.getFinalURL().get("account.setOnline",
                args);
        return new JsonHandler(Request.get(url));
    }

    //getPushSettings
    public JsonHandler getPushSettings(String... args) {
        String url = vkApi.getFinalURL().get("account.getPushSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //registerDevice
    public JsonHandler registerDevice(String... args) {
        String url = vkApi.getFinalURL().get("account.registerDevice",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setPushSettings
    public JsonHandler setPushSettings(String... args) {
        String url = vkApi.getFinalURL().get("account.setPushSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setSilenceMode
    public JsonHandler setSilenceMode(String... args) {
        String url = vkApi.getFinalURL().get("account.setSilenceMode",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unregisterDevice
    public JsonHandler unregisterDevice(String... args) {
        String url = vkApi.getFinalURL().get("account.unregisterDevice",
                args);
        return new JsonHandler(Request.get(url));
    }
}
