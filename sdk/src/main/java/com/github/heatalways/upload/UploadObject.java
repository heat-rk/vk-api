package com.github.heatalways.upload;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;

public class UploadObject {
    public final VkApi vkApi;
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
