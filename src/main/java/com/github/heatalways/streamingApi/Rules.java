package com.github.heatalways.streamingApi;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с правилами StreamingApi.
 * Подробнее на https://vk.com/dev/streaming_api_docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 * @see StreamingApi
 */
public class Rules {
    private final String url;

    /**
     * Создает объект класса Rules
     * @param streamingApiInterface объект класса StreamingApiInterface
     * @see StreamingApi
     */
    public Rules(StreamingApiInterface streamingApiInterface) {
        url = "https://" + streamingApiInterface.getEndpoint() + "/rules?key=" + streamingApiInterface.getKey();
    }

    /**
     * Получает правила
     * @return объект класса JsonHandler
     */
    public JsonHandler get() {
        return Request.getCallBackResponse(url);
    }

    /**
     * Добавляет новое правило
     * @param value строковое представление правила
     * @param tag метка правила
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler add(String value, String tag) {
        String json = "{\"rule\":{\"value\":\"" + value + "\",\"tag\":\"" + tag + "\"}}";
        return new JsonHandler(BodyOfRequest.addRule(url, json));
    }

    /**
     * Удаляет правило по метке
     * @param tag метка правила
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler delete(String tag) {
        String json = "{\"tag\":\"" + tag + "\"}";
        return new JsonHandler(BodyOfRequest.deleteRule(url, json));
    }
}
