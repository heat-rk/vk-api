package com.github.heatalways.objects.photos;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Photos.
 * Подробнее на https://vk.com/dev/photos
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Photos extends MethodObject {
    public final static String confirmTag = "confirmTag";
    public final static String copy = "copy";
    public final static String createAlbum = "createAlbum";
    public final static String createComment = "createComment";
    public final static String delete = "delete";
    public final static String deleteAlbum = "deleteAlbum";
    public final static String deleteComment = "deleteComment";
    public final static String edit = "edit";
    public final static String editAlbum = "editAlbum";
    public final static String editComment = "editComment";
    public final static String get = "get";
    public final static String getAlbums = "getAlbums";
    public final static String getAlbumsCount = "getAlbumsCount";
    public final static String getAll = "getAll";
    public final static String getAllComments = "getAllComments";
    public final static String getById = "getById";
    public final static String getChatUploadServer = "getChatUploadServer";
    public final static String getComments = "getComments";
    public final static String getMarketAlbumUploadServer = "getMarketAlbumUploadServer";
    public final static String getMarketUploadServer = "getMarketUploadServer";
    public final static String getMessagesUploadServer = "getMessagesUploadServer";
    public final static String getNewTags = "getNewTags";
    public final static String getOwnerCoverPhotoUploadServer = "getOwnerCoverPhotoUploadServer";
    public final static String getOwnerPhotoUploadServer = "getOwnerPhotoUploadServer";
    public final static String getTags = "getTags";
    public final static String getUploadServer = "getUploadServer";
    public final static String getUserPhotos = "getUserPhotos";
    public final static String getWallUploadServer = "getWallUploadServer";
    public final static String makeCover = "makeCover";
    public final static String move = "move";
    public final static String putTag = "putTag";
    public final static String removeTag = "removeTag";
    public final static String reorderAlbums = "reorderAlbums";
    public final static String reorderPhotos = "reorderPhotos";
    public final static String report = "report";
    public final static String reportComment = "reportComment";
    public final static String restore = "restore";
    public final static String restoreComment = "restoreComment";
    public final static String save = "save";
    public final static String saveMarketAlbumPhoto = "saveMarketAlbumPhoto";
    public final static String saveMarketPhoto = "saveMarketPhoto";
    public final static String saveMessagesPhoto = "saveMessagesPhoto";
    public final static String saveOwnerCoverPhoto = "saveOwnerCoverPhoto";
    public final static String saveOwnerPhoto = "saveOwnerPhoto";
    public final static String saveWallPhoto = "saveWallPhoto";
    public final static String search = "search";


    public Photos(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "photos";
    }
}
