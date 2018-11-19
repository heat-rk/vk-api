package com.github.heatalways.upload;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.objects.*;

import java.io.File;

/**
 * Класс для загрузки файлов.
 * Подробнее на https://vk.com/dev/upload_files
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Upload {
    private final PhotoToAlbum photoToAlbum;
    private final PhotoToWall photoToWall;
    private final MainPhoto mainPhoto;
    private final PhotoToMessage photoToMessage;
    private final ChatPhoto chatPhoto;
    private final ProductPhoto productPhoto;
    private final AlbumProductPhoto albumProductPhoto;
    private final VideoUpload video;
    private final DocumentUpload documentUpload;
    private final DocumentToWall documentToWall;
    private final DocumentToMessage documentToMessage;
    private final CoverGroupPhoto coverGroupPhoto;
    private final AudioMessage audioMessage;
    private final StoriesPhoto storiesPhoto;
    private final StoriesVideo storiesVideo;

    public Upload(VkApi vkApi) {
        photoToAlbum = new PhotoToAlbum(vkApi);
        photoToWall = new PhotoToWall(vkApi);
        mainPhoto = new MainPhoto(vkApi);
        photoToMessage = new PhotoToMessage(vkApi);
        chatPhoto = new ChatPhoto(vkApi);
        productPhoto = new ProductPhoto(vkApi);
        albumProductPhoto = new AlbumProductPhoto(vkApi);
        video = new VideoUpload(vkApi);
        documentUpload = new DocumentUpload(vkApi);
        documentToWall = new DocumentToWall(vkApi);
        documentToMessage = new DocumentToMessage(vkApi);
        coverGroupPhoto = new CoverGroupPhoto(vkApi);
        audioMessage = new AudioMessage(vkApi);
        storiesPhoto = new StoriesPhoto(vkApi);
        storiesVideo = new StoriesVideo(vkApi);
    }

    public PhotoToAlbum photoToAlbum(String album_id, File[] files) {
        return photoToAlbum.upload(album_id, files);
    }
    public PhotoToAlbum photoToAlbum(String group_id, String album_id, File[] files) {
        return photoToAlbum.upload(group_id, album_id, files);
    }

    public PhotoToWall photoToWall(File file) {
        return photoToWall.upload(file);
    }
    public PhotoToWall photoToWall(String group_id, File file) {
        return photoToWall.upload(group_id, file);
    }

    public MainPhoto mainPhoto(File file) {
        return mainPhoto.upload(file);
    }
    public MainPhoto mainPhoto(File file, String square_crop) {
        return mainPhoto.upload(file, square_crop);
    }
    public MainPhoto mainPhoto(String group_id, File file) {
        return mainPhoto.upload(group_id, file);
    }
    public MainPhoto mainPhoto(String group_id, File file, String square_crop) {
        return mainPhoto.upload(group_id, file, square_crop);
    }

    public PhotoToMessage photoToMessage(String peer_id, File file) {
        return photoToMessage.upload(peer_id, file);
    }

    public ChatPhoto chatPhoto(String chat_id, File file, String... args) {
        return chatPhoto.upload(chat_id, file, args);
    }

    public ProductPhoto productPhoto(String group_id, int main_photo, File file, String... args) {
        return productPhoto.upload(group_id, main_photo, file, args);
    }

    public AlbumProductPhoto albumProductPhoto(String group_id, File file) {
        return albumProductPhoto.upload(group_id, file);
    }

    public JsonHandler videoUpload(String link, String... args) {
        return video.upload(link, args);
    }
    public JsonHandler videoUpload(String group_id, String link, String... args) {
        return video.upload(group_id, link, args);
    }
    public JsonHandler videoUpload(File file, String... args) {
        return video.upload(file, args);
    }
    public JsonHandler videoUpload(String group_id, File file, String... args) {
        return video.upload(group_id, file, args);
    }

    public DocumentUpload documentUpload(File file) {
        return documentUpload.upload(file);
    }
    public DocumentUpload documentUpload(String group_id, File file) {
        return documentUpload.upload(group_id, file);
    }
    public DocumentToWall documentToWall(File file) {
        return documentToWall.upload(file);
    }
    public DocumentToWall documentToWall(String group_id, File file) {
        return documentToWall.upload(group_id, file);
    }

    public DocumentToMessage documentToMessage(String peer_id, File file) {
        return documentToMessage.upload(peer_id, file);
    }

    public CoverGroupPhoto coverGroupPhoto(String group_id, File file, String... args) {
        return coverGroupPhoto.upload(group_id, file, args);
    }

    public AudioMessage audioMessage(String peer_id, File file) {
        return audioMessage.upload(peer_id, file);
    }

    public JsonHandler storiesPhoto(File file, String... args) {
        return storiesPhoto.upload(file, args);
    }

    public JsonHandler storiesVideo(File video_file, String... args) {
        return storiesVideo.upload(video_file, args);
    }
}
