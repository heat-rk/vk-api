package com.github.heatalways.streamingAPI;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с StreamingApi.
 * Работа со Streaming API выглядит так — Вы добавляете нужные Вам правила и затем получаете данные, которые подходят под эти правила, в едином потоке.
 * Подробнее на https://vk.com/dev/streaming_api_docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class StreamingApi {
    private final String endpoint;
    private final String key;

    public final Rules rules;
    public final Stream stream;

    /**
     * Создает объект класса StreamingApi
     * @param vkApi объект основного класса VkApi
     */
    public StreamingApi(VkApi vkApi) {
        JsonHandler response = vkApi.streaming.getServerUrl();
        endpoint = response.get("endpoint").toString();
        key = response.get("key").toString();
        rules = new Rules(this);
        stream = new Stream(this);
    }

    public String getEndpoint() {
        return endpoint;
    }
    public String getKey() {
        return key;
    }
}
