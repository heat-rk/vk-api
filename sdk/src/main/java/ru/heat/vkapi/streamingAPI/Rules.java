package ru.heat.vkapi.streamingAPI;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.utils.Request;

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
     * @param streamingApi объект класса StreamingApi
     * @see StreamingApi
     */
    public Rules(StreamingApi streamingApi) {
        url = "https://" + streamingApi.getEndpoint() + "/rules?key=" + streamingApi.getKey();
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
     * @return объект класса JsonHandler(ответ от сервера)
     */
    public JsonHandler add(String value, String tag) {
        String json = "{\"rule\":{\"value\":\"" + value + "\",\"tag\":\"" + tag + "\"}}";
        return new JsonHandler(BodyOfRequest.addRule(url, json));
    }

    /**
     * Удаляет правило по метке
     * @param tag метка правила
     * @return объект класса JsonHandler(ответ от сервера)
     */
    public JsonHandler delete(String tag) {
        String json = "{\"tag\":\"" + tag + "\"}";
        return new JsonHandler(BodyOfRequest.deleteRule(url, json));
    }
}
