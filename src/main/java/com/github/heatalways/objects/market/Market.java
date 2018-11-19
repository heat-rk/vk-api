package com.github.heatalways.objects.market;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Market.
 * Подробнее на https://vk.com/dev/market
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Market extends MethodObject {
    public final static String add = "add";
    public final static String addAlbum = "addAlbum";
    public final static String addToAlbum = "addToAlbum";
    public final static String createComment = "createComment";
    public final static String delete = "delete";
    public final static String deleteAlbum = "deleteAlbum";
    public final static String deleteComment = "deleteComment";
    public final static String edit = "edit";
    public final static String editAlbum = "editAlbum";
    public final static String editComment = "editComment";
    public final static String get = "get";
    public final static String getAlbumById = "getAlbumById";
    public final static String getAlbums = "getAlbums";
    public final static String getById = "getById";
    public final static String getCategories = "getCategories";
    public final static String getComments = "getComments";
    public final static String removeFromAlbum = "removeFromAlbum";
    public final static String reorderAlbums = "reorderAlbums";
    public final static String reorderItems = "reorderItems";
    public final static String report = "report";
    public final static String reportComment = "reportComment";
    public final static String restore = "restore";
    public final static String restoreComment = "restoreComment";
    public final static String search = "search";

    public Market(VkApi vkApi) {
        super(vkApi);
        object = "market";
    }
}
