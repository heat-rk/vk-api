package com.github.heatalways.upload;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;

/**
 * Родительский класс для загрузки какого-либо файла.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class UploadObject {
    protected final VkApi vkApi;
    protected JsonHandler response;

    public UploadObject(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    /**
     * Получение ответа от сервера при загрузки
     * @return объект класса JsonHandler
     */
    public JsonHandler getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return response.toString();
    }
}
