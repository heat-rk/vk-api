package com.github.heatalways.streamingAPI;

import com.github.heatalways.jsonHandler.JsonHandler;

/**
 * Обработчик входящих сообщений StreamingApi
 * @author heat"kazyxanovr1@gmail.com"
 *
 * @see StreamingApi
 */
public class MessageHandler {
    /**
     * Метод, который следует переопределить
     * @param message входящее сообщение
     */
    public void onMessage(JsonHandler message) {}
}
