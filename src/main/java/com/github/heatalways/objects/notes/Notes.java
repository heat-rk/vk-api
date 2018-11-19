package com.github.heatalways.objects.notes;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Notes.
 * Подробнее на https://vk.com/dev/notes
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Notes extends MethodObject {
    public final static String add = "add";
    public final static String createComment = "createComment";
    public final static String delete = "delete";
    public final static String deleteComment = "deleteComment";
    public final static String edit = "edit";
    public final static String editComment = "editComment";
    public final static String get = "get";
    public final static String getById = "getById";
    public final static String getComments = "getComments";
    public final static String restoreComment = "restoreComment";

    public Notes(VkApi vkApi) {
        super(vkApi);
        object = "notes";
    }
}
