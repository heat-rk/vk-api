package ru.heat.vkapi.upload;

import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;

public class UploadObject {
    public VkApi vkApi;
    public JsonHandler response;

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
