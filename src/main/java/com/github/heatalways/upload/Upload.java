package com.github.heatalways.upload;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.upload.objects.*;

import java.io.File;

/**
 * Класс для загрузки файлов.
 * Подробнее на https://vk.com/dev/upload_files
 * @author heat"kazyxanovr1@gmail.com"
 */
public class Upload {
    private final PhotoToAlbum photoToAlbum;
    private final PhotoToWall photoToWall;
    private final MainPhoto mainPhoto;
    private final PhotoToMessage photoToMessage;
    private final ChatPhoto chatPhoto;
    private final ProductPhoto productPhoto;
    private final AlbumProductPhoto albumProductPhoto;
    private final AudioUpload audio;
    private final VideoUpload video;
    private final DocumentUpload documentUpload;
    private final DocumentToWall documentToWall;
    private final DocumentToMessage documentToMessage;
    private final CoverGroupPhoto coverGroupPhoto;
    private final AudioMessage audioMessage;
    private final StoriesPhoto storiesPhoto;
    private final StoriesVideo storiesVideo;

    /**
     * Конструктор, принимающий в качестве параметра объект класса VkApi
     * @param vkApi объект класса VkApi
     */
    public Upload(VkApi vkApi) {
        photoToAlbum = new PhotoToAlbum(vkApi);
        photoToWall = new PhotoToWall(vkApi);
        mainPhoto = new MainPhoto(vkApi);
        photoToMessage = new PhotoToMessage(vkApi);
        chatPhoto = new ChatPhoto(vkApi);
        productPhoto = new ProductPhoto(vkApi);
        albumProductPhoto = new AlbumProductPhoto(vkApi);
        audio = new AudioUpload(vkApi);
        video = new VideoUpload(vkApi);
        documentUpload = new DocumentUpload(vkApi);
        documentToWall = new DocumentToWall(vkApi);
        documentToMessage = new DocumentToMessage(vkApi);
        coverGroupPhoto = new CoverGroupPhoto(vkApi);
        audioMessage = new AudioMessage(vkApi);
        storiesPhoto = new StoriesPhoto(vkApi);
        storiesVideo = new StoriesVideo(vkApi);
    }

    /**
     * Загрузка фото в альбом
     * @param album_id идентификатор альбома
     * @param files файлы с изображениями
     * @return объект класса PhotoToAlbum
     * @see Upload#photoToAlbum(String, String, File[])
     */
    public PhotoToAlbum photoToAlbum(String album_id, File[] files) {
        return photoToAlbum.upload(album_id, files);
    }

    /**
     * Загрузка фото в альбом
     * @param group_id идентификатор сообщества, которому принадлежит альбом (если необходимо загрузить фотографию в альбом сообщества)
     * @param album_id идентификатор альбома
     * @param files файлы с изображениями
     * @return объект класса PhotoToAlbum
     * @see Upload#photoToAlbum(String, File[])
     */
    public PhotoToAlbum photoToAlbum(String group_id, String album_id, File[] files) {
        return photoToAlbum.upload(group_id, album_id, files);
    }

    /**
     * Загрузка фотографий на стену
     * @param file файл с изображением
     * @return объект класса PhotoToWall
     * @see Upload#photoToWall(String, File)
     */
    public PhotoToWall photoToWall(File file) {
        return photoToWall.upload(file);
    }

    /**
     * Загрузка фотографий на стену
     * @param group_id идентификатор сообщества, на стену которого нужно загрузить фото (без знака «минус»)
     * @param file файл с изображением
     * @return объект класса PhotoToWall
     * @see Upload#photoToWall(File)
     */
    public PhotoToWall photoToWall(String group_id, File file) {
        return photoToWall.upload(group_id, file);
    }

    /**
     * Загрузка главной фотографии пользователя или сообщества
     * @param file файл с изображением
     * @return объект класса MainPhoto
     * @see Upload#mainPhoto(String, File)
     * @see Upload#mainPhoto(File, String)
     * @see Upload#mainPhoto(String, File, String)
     */
    public MainPhoto mainPhoto(File file) {
        return mainPhoto.upload(file);
    }

    /**
     * Загрузка главной фотографии пользователя или сообщества
     * @param file файл с изображением
     * @param square_crop квадратная миниатюра для фото
     * @return объект класса MainPhoto
     * @see Upload#mainPhoto(String, File)
     * @see Upload#mainPhoto(File)
     * @see Upload#mainPhoto(String, File, String)
     */
    public MainPhoto mainPhoto(File file, String square_crop) {
        return mainPhoto.upload(file, square_crop);
    }

    /**
     * Загрузка главной фотографии пользователя или сообщества
     * @param owner_id идентификатор сообщества или текущего пользователя
     * @param file файл с изображением
     * @return объект класса MainPhoto
     * @see Upload#mainPhoto(File)
     * @see Upload#mainPhoto(File, String)
     * @see Upload#mainPhoto(String, File, String)
     */
    public MainPhoto mainPhoto(String owner_id, File file) {
        return mainPhoto.upload(owner_id, file);
    }

    /**
     * Загрузка главной фотографии пользователя или сообщества
     * @param owner_id идентификатор сообщества или текущего пользователя
     * @param file файл с изображением
     * @param square_crop квадратная миниатюра для фото
     * @return объект класса MainPhoto
     * @see Upload#mainPhoto(File)
     * @see Upload#mainPhoto(File, String)
     * @see Upload#mainPhoto(String, File)
     */
    public MainPhoto mainPhoto(String owner_id, File file, String square_crop) {
        return mainPhoto.upload(owner_id, file, square_crop);
    }

    /**
     * Загрузка фотографии в личное сообщение
     * @param peer_id идентификатор назначения (для загрузки фотографии в сообщениях сообществ)
     * @param file файл с изображением
     * @return объект класса PhotoToMessage
     */
    public PhotoToMessage photoToMessage(String peer_id, File file) {
        return photoToMessage.upload(peer_id, file);
    }

    /**
     * Загрузка главной фотографии для чата
     * @param chat_id идентификатор беседы, для которой нужно загрузить фотографию
     * @param file файл с изображением
     * @param args дополнительные параметры для загрузки фото
     * @return объект класса ChatPhoto
     */
    public ChatPhoto chatPhoto(String chat_id, File file, String... args) {
        return chatPhoto.upload(chat_id, file, args);
    }

    /**
     * Загрузка фотографии для товара
     * @param group_id идентификатор сообщества, для которого необходимо загрузить фотографию товара
     * @param main_photo является ли фотография обложкой товара (1 — фотография для обложки, 0 — дополнительная фотография)
     * @param file файл с изображением
     * @param args дополнительные параметры для загрузки фото
     * @return объект класса ProductPhoto
     */
    public ProductPhoto productPhoto(String group_id, int main_photo, File file, String... args) {
        return productPhoto.upload(group_id, main_photo, file, args);
    }

    /**
     * Загрузка фотографии для подборки товаров
     * @param group_id идентификатор сообщества, для которого необходимо загрузить фотографию подборки товаров
     * @param file файл с изображением
     * @return объект класса AlbumProductPhoto
     */
    public AlbumProductPhoto albumProductPhoto(String group_id, File file) {
        return albumProductPhoto.upload(group_id, file);
    }

    /**
     * Загрузка аудиозаписей
     * @param file файл с аудиозаписью
     * @return объект класса AudioUpload
     */
    public AudioUpload audioUpload(File file) {
        return audio.upload(file);
    }

    /**
     * Загрузка видеозаписей
     * @param link url для встраивания видео с внешнего сайта, например, с Youtube. В этом случае нужно вызвать полученный upload_url, не прикрепляя файл, достаточно просто обратиться по этому адресу
     * @param args дополнительные параметры для загрузки видезаписи
     * @return ответ от сервера в формате JSON
     * @see Upload#videoUpload(File, String...)
     * @see Upload#videoUpload(String, File, String...)
     * @see Upload#videoUpload(String, String, String...)
     */
    public JsonHandler videoUpload(String link, String... args) {
        return video.upload(link, args);
    }

    /**
     * Загрузка видеозаписей
     * @param group_id идентификатор сообщества, в которое будет сохранен видеофайл. По умолчанию файл сохраняется на страницу текущего пользователя
     * @param link url для встраивания видео с внешнего сайта, например, с Youtube. В этом случае нужно вызвать полученный upload_url, не прикрепляя файл, достаточно просто обратиться по этому адресу
     * @param args дополнительные параметры для загрузки видеозаписи
     * @return ответ от сервера в формате JSON
     * @see Upload#videoUpload(File, String...)
     * @see Upload#videoUpload(String, File, String...)
     * @see Upload#videoUpload(String, String...)
     */
    public JsonHandler videoUpload(String group_id, String link, String... args) {
        return video.upload(group_id, link, args);
    }

    /**
     * Загрузка видеозаписей
     * @param file файл с видеозаписью
     * @param args дополнительные параметры для загрузки видеозаписи
     * @return ответ от сервера в формате JSON
     * @see Upload#videoUpload(String, String, String...)
     * @see Upload#videoUpload(String, File, String...)
     * @see Upload#videoUpload(String, String...)
     */
    public JsonHandler videoUpload(File file, String... args) {
        return video.upload(file, args);
    }

    /**
     * Загрузка видеозаписей
     * @param group_id идентификатор сообщества, в которое будет сохранен видеофайл. По умолчанию файл сохраняется на страницу текущего пользователя
     * @param file файл с видеозаписью
     * @param args дополнительные параметры для загрузки видеозаписи
     * @return ответ от сервера в формате JSON
     * @see Upload#videoUpload(String, String, String...)
     * @see Upload#videoUpload(File, String...)
     * @see Upload#videoUpload(String, String...)
     */
    public JsonHandler videoUpload(String group_id, File file, String... args) {
        return video.upload(group_id, file, args);
    }

    /**
     * Загрузка документов
     * @param file файл с документом
     * @return объект класса DocumentUpload
     * @see Upload#documentUpload(String, File)
     */
    public DocumentUpload documentUpload(File file) {
        return documentUpload.upload(file);
    }

    /**
     * Загрузка документов
     * @param group_id идентификатор сообщества (если необходимо загрузить документ в список документов сообщества). Если документ нужно загрузить в список пользователя, метод вызывается без дополнительных параметров
     * @param file файл с документом
     * @return объект класса DocumentUpload
     * @see Upload#documentUpload(File)
     */
    public DocumentUpload documentUpload(String group_id, File file) {
        return documentUpload.upload(group_id, file);
    }

    /**
     * Загрузка документов на стену
     * @param file файл с документом
     * @return объект класса DocumentToWall
     * @see Upload#documentToWall(String, File)
     */
    public DocumentToWall documentToWall(File file) {
        return documentToWall.upload(file);
    }

    /**
     * Загрузка документов на стену
     * @param group_id идентификатор сообщества, в которое нужно загрузить документ
     * @param file файл с документом
     * @return объект класса DocumentToWall
     * @see Upload#documentToWall(File)
     */
    public DocumentToWall documentToWall(String group_id, File file) {
        return documentToWall.upload(group_id, file);
    }

    /**
     * Загрузка документов в сообщение
     * @param peer_id идентификатор назначения
     * @param file файл с документом
     * @return объект класса DocumentToMessage
     */
    public DocumentToMessage documentToMessage(String peer_id, File file) {
        return documentToMessage.upload(peer_id, file);
    }

    /**
     * Загрузка обложки сообщества
     * @param group_id идентификатор сообщества
     * @param file файл с обложкой
     * @param args дополнительные параметры для загрузки обложки
     * @return объект класса CoverGroupPhoto
     */
    public CoverGroupPhoto coverGroupPhoto(String group_id, File file, String... args) {
        return coverGroupPhoto.upload(group_id, file, args);
    }

    /**
     * Загрузка аудиосообщения
     * @param peer_id идентификатор назначения
     * @param file файл с аудиосообщением
     * @return объект класса AudioMessage
     */
    public AudioMessage audioMessage(String peer_id, File file) {
        return audioMessage.upload(peer_id, file);
    }

    /**
     * Загрузка истории (фото)
     * @param file файл с изображением
     * @param args дополнительные параметры для загрузки изображения
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler storiesPhoto(File file, String... args) {
        return storiesPhoto.upload(file, args);
    }

    /**
     * Загрузка истории (видео)
     * @param video_file файл с видеозаписью
     * @param args дополнительные параметры для загрузки изображения
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler storiesVideo(File video_file, String... args) {
        return storiesVideo.upload(video_file, args);
    }
}
