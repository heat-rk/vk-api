package com.github.heatalways.streamingApi;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.objects.streaming.Streaming;

/**
 * Класс для работы с StreamingApi.
 * Работа со Streaming API выглядит так — Вы добавляете нужные Вам правила и затем получаете данные, которые подходят под эти правила, в едином потоке.
 * Подробнее на https://vk.com/dev/streaming_api_docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class StreamingApi implements StreamingApiInterface {
    private final String endpoint;
    private final String key;

    public final Rules rules;
    public final Stream stream;

    /**
     * Создает объект класса StreamingApi
     * @param vkApi объект основного класса VkApi
     */
    public StreamingApi(VkApi vkApi) {
        JsonHandler response = vkApi.streaming.method(Streaming.getServerUrl).execute();
        endpoint = response.get("endpoint").toString();
        key = response.get("key").toString();
        rules = new Rules(this);
        stream = new Stream(this);
    }

    /**
     * Возвращает хост для подключения к серверу
     * @return хост для подключения к серверу
     */
    @Override
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Возвращает ключ доступа. Ключ бессрочный и прекращает действовать только после получения нового ключа
     * @return ключ доступа. Ключ бессрочный и прекращает действовать только после получения нового ключа
     */
    @Override
    public String getKey() {
        return key;
    }
}
