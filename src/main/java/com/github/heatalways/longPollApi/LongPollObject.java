package com.github.heatalways.longPollApi;

import com.github.heatalways.callbackApi.MessageHandlerObject;

/**
 * Родительский класс для реализации работы с LongPoll API.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class LongPollObject {
    protected String key = null;
    protected String server = null;
    protected String ts = null;
    protected int wait = 0;
    protected MessageHandlerObject messageHandlerObject;

    /**
     * Установка обработчика сообщений.
     * @param messageHandlerObject объект класса обработчика сообщений(BotsMessageHandler, UserMessageHandler)
     * @return объект класса LongPollObject
     */
    public LongPollObject setMessageHandler(MessageHandlerObject messageHandlerObject) {
        this.messageHandlerObject = messageHandlerObject;
        return this;
    }

    /**
     * Запуск потока (запросы к серверу на длительной основе)
     */
    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    makeRequest();
                }
            }
        }).start();
    }

    /**
     * Запрос к серверу
     */
    public void makeRequest() {}
}
