package ru.heat.vkapi.objects.orders;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Orders.
 * Подробнее на https://vk.com/dev/orders
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class Orders {

    private VkApi vkApi;
    public Orders(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //cancelSubscription
    public JsonHandler cancelSubscription(String... args) {
        String url = vkApi.getFinalURL().get("orders.cancelSubscription",
                args);
        return new JsonHandler(Request.get(url));
    }


    //changeState
    public JsonHandler changeState(String... args) {
        String url = vkApi.getFinalURL().get("orders.changeState",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("orders.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAmount
    public JsonHandler getAmount(String... args) {
        String url = vkApi.getFinalURL().get("orders.getAmount",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("orders.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUserSubscriptionById
    public JsonHandler getUserSubscriptionById(String... args) {
        String url = vkApi.getFinalURL().get("orders.getUserSubscriptionById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUserSubscriptions
    public JsonHandler getUserSubscriptions(String... args) {
        String url = vkApi.getFinalURL().get("orders.getUserSubscriptions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateSubscription
    public JsonHandler updateSubscription(String... args) {
        String url = vkApi.getFinalURL().get("orders.updateSubscription",
                args);
        return new JsonHandler(Request.get(url));
    }
}
