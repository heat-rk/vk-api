package ru.heat.vkapi.streamingAPI;

import org.java_websocket.drafts.Draft_6455;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.utils.WebSocket;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Класс для работы с потоком StreamingApi.
 * Подробнее на https://vk.com/dev/streaming_api_docs
 * @author heat<kazyxanovr1@gmail.com>
 *
 * @see StreamingApi
 */
public class Stream {
    private StreamingApi streamingApi;
    private WebSocket webSocket;
    private String url;
    private MessageHandler messageHandler;

    /**
     * Создает объект класса Stream
     * @param streamingApi объект класса StreamingApi
     * @see StreamingApi
     */
    public Stream(StreamingApi streamingApi) {
        this.streamingApi = streamingApi;
        url = "wss://" + this.streamingApi.getEndpoint() + "/stream?key=" + this.streamingApi.getKey();
        try {
            webSocket = new WebSocket(new URI(url), new Draft_6455()) {
                @Override
                public void onMessage(String s) {
                    JsonHandler message = new JsonHandler(s);
                    messageHandler.onMessage(message);
                }
            };
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Запуск потока для чтения данных
     * @return объект класса Stream
     */
    private Stream connect() {
        webSocket.connect();
        return this;
    }

    /**
     * Функция, которая устанавливает обработчик входящих сообщений.
     * В параметре следует переопределить метод <onMessage(JsonHandler message)>
     * @param messageHandler объект класса BotsMessageHandler
     * @return объект класса Stream
     * @see MessageHandler
     */
    public Stream setMessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
        connect();
        return this;
    }
}
