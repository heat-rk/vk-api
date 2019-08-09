package com.github.heatalways.objects.users;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Users.
 * Подробнее на https://vk.com/dev/users
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Users extends MethodObject {
    public final static String get = "get";
    public final static String getFollowers = "getFollowers";
    public final static String getSubscriptions = "getSubscriptions";
    public final static String isAppUser = "isAppUser";
    public final static String report = "report";
    public final static String search = "search";

    public Users(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "users";
    }
}
