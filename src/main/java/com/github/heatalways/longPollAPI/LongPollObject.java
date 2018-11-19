package com.github.heatalways.longPollAPI;

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
     * Запуск потока
     */
    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    bodyOfThread();
                }
            }
        }).start();
    }

    /**
     * Инициализация тела потока
     */
    protected void bodyOfThread() {}
}
