package com.github.heatalways.objects.account;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Account.
 * Подробнее на https://vk.com/dev/account
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Account extends MethodObject {
    public final static String ban = "ban";
    public final static String changePassword = "changePassword";
    public final static String getActiveOffers = "getActiveOffers";
    public final static String getAppPermissions = "getAppPermissions";
    public final static String getBanned = "getBanned";
    public final static String getCounters = "getCounters";
    public final static String getInfo = "getInfo";
    public final static String getProfileInfo = "getProfileInfo";
    public final static String getPushSettings = "getPushSettings";
    public final static String registerDevice = "registerDevice";
    public final static String saveProfileInfo = "saveProfileInfo";
    public final static String setInfo = "setInfo";
    public final static String setNameInMenu = "setNameInMenu";
    public final static String setOffline = "setOffline";
    public final static String setOnline = "setOnline";
    public final static String setPushSettings = "setPushSettings";
    public final static String setSilenceMode = "setSilenceMode";
    public final static String unban = "unban";
    public final static String unregisterDevice = "unregisterDevice";

    public Account(VkApi vkApi) {
        super(vkApi);
        object = "account";
    }
}
