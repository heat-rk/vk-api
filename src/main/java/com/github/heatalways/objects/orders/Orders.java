package com.github.heatalways.objects.orders;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Orders.
 * Подробнее на https://vk.com/dev/orders
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Orders extends MethodObject {
    public final static String cancelSubscription = "cancelSubscription";
    public final static String changeState = "changeState";
    public final static String get = "get";
    public final static String getAmount = "getAmount";
    public final static String getById = "getById";
    public final static String getUserSubscriptionById = "getUserSubscriptionById";
    public final static String getUserSubscriptions = "getUserSubscriptions";
    public final static String updateSubscription = "updateSubscription";

    public Orders(VkApi vkApi) {
        super(vkApi);
        object = "orders";
    }
}
