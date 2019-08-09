package com.github.heatalways.objects.secure;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Secure.
 * Подробнее на https://vk.com/dev/secure
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Secure extends MethodObject {
    public final static String addAppEvent = "addAppEvent";
    public final static String checkToken = "checkToken";
    public final static String getAppBalance = "getAppBalance";
    public final static String getSMSHistory = "getSMSHistory";
    public final static String getTransactionsHistory = "getTransactionsHistory";
    public final static String getUserLevel = "getUserLevel";
    public final static String sendNotification = "sendNotification";
    public final static String sendSMSNotification = "sendSMSNotification";
    public final static String setCounter = "setCounter";

    public Secure(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "secure";
    }
}
