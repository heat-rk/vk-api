package com.github.heatalways.upload;

import com.github.heatalways.VkApi;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.upload.objects.*;

/**
 * Класс для загрузки файлов.
 * Подробнее на https://vk.com/dev/upload_files
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Upload {
    public final PhotoToAlbum photoToAlbum;
    public final PhotoToWall photoToWall;
    public final MainPhoto mainPhoto;
    public final PhotoToMessage photoToMessage;
    public final ChatPhoto chatPhoto;
    public final ProductPhoto productPhoto;
    public final AlbumProductPhoto albumProductPhoto;
    public final Video video;
    public final Document document;
    public final DocumentToWall documentToWall;
    public final DocumentToMessage documentToMessage;
    public final CoverGroupPhoto coverGroupPhoto;
    public final AudioMessage audioMessage;
    public final StoriesPhoto storiesPhoto;
    public final StoriesVideo storiesVideo;

    public Upload(VkApi vkApi) {
        photoToAlbum = new PhotoToAlbum(vkApi);
        photoToWall = new PhotoToWall(vkApi);
        mainPhoto = new MainPhoto(vkApi);
        photoToMessage = new PhotoToMessage(vkApi);
        chatPhoto = new ChatPhoto(vkApi);
        productPhoto = new ProductPhoto(vkApi);
        albumProductPhoto = new AlbumProductPhoto(vkApi);
        video = new Video(vkApi);
        document = new Document(vkApi);
        documentToWall = new DocumentToWall(vkApi);
        documentToMessage = new DocumentToMessage(vkApi);
        coverGroupPhoto = new CoverGroupPhoto(vkApi);
        audioMessage = new AudioMessage(vkApi);
        storiesPhoto = new StoriesPhoto(vkApi);
        storiesVideo = new StoriesVideo(vkApi);
    }
}
