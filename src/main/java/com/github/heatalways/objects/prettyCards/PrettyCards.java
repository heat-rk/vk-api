package com.github.heatalways.objects.prettyCards;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта PrettyCards.
 * Подробнее на https://vk.com/dev/prettyCards
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class PrettyCards extends MethodObject {
    public final static String create = "create";
    public final static String delete = "delete";
    public final static String get = "get";
    public final static String edit = "edit";
    public final static String getById = "getById";
    public final static String getUploadURL = "getUploadURL";

    public PrettyCards(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "prettyCards";
    }
}
