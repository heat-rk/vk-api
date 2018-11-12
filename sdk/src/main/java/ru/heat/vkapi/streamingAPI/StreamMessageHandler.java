package ru.heat.vkapi.streamingAPI;

import ru.heat.vkapi.jsonHandler.JsonHandler;

/**
 * Обработчик входящих сообщений StreamingApi
 * @author heat"kazyxanovr1@gmail.com"
 *
 * @see StreamingApi
 */
public class StreamMessageHandler {
    /**
     * Метод, который следует переопределить
     * @param message входящее сообщение
     */
    public void onMessage(JsonHandler message) {}
}
