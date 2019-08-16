package com.github.heatalways.callbackApi;

import com.github.heatalways.jsonHandler.JsonHandler;

/**
 * Класс для работы с CallbackAPI
 * Нужный вам метод для дальнейшей работы нужно переопределить!
 * Подробнее на https://vk.com/dev/callback_api
 * @author heat"kazyxanovr1@gmail.com"
 */
public class CallbackApi {
    private CallbackMessageHandler callbackMessageHandler;

    /**
     * Установка обработчика сообщений.
     * @param callbackMessageHandler объект класса обработчика сообщений
     * @return объект класса CallbackAPI
     */
    public CallbackApi setCallbackMessageHandler(CallbackMessageHandler callbackMessageHandler) {
        this.callbackMessageHandler = callbackMessageHandler;
        return this;
    }

    /**
     * Обработка какого-либо события
     * @param event событие
     */
    public void parse(JsonHandler event) {
        EventMethod.call(event, callbackMessageHandler);
    }
}
