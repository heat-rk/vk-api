package com.github.heatalways.objects.docs;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Docs.
 * Подробнее на https://vk.com/dev/docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Docs extends MethodObject {
    public final static String add = "add";
    public final static String delete = "delete";
    public final static String edit = "edit";
    public final static String get = "get";
    public final static String getById = "getById";
    public final static String getMessagesUploadServer = "getMessagesUploadServer";
    public final static String getTypes = "getTypes";
    public final static String getUploadServer = "getUploadServer";
    public final static String getWallUploadServer = "getWallUploadServer";
    public final static String save = "save";
    public final static String search = "search";

    public Docs(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "docs";
    }
}
