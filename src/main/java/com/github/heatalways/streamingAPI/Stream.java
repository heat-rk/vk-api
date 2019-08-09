package com.github.heatalways.streamingAPI;

import org.java_websocket.drafts.Draft_6455;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.WebSocket;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Класс для работы с потоком StreamingApi.
 * Подробнее на https://vk.com/dev/streaming_api_docs
 * @author heat"kazyxanovr1@gmail.com"
 *
 * @see StreamingApi
 */
public class Stream {
    private WebSocket webSocket;
    private StreamMessageHandler streamMessageHandler;

    /**
     * Создает объект класса Stream
     * @param streamingApiInterface объект класса StreamingApiInterface
     * @see StreamingApi
     */
    public Stream(StreamingApiInterface streamingApiInterface) {
        String url = "wss://" + streamingApiInterface.getEndpoint() + "/stream?key=" + streamingApiInterface.getKey();
        try {
            webSocket = new WebSocket(new URI(url), new Draft_6455()) {
                @Override
                public void onMessage(String s) {
                    JsonHandler message = new JsonHandler(s);
                    streamMessageHandler.onMessage(message);
                }
            };
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Запуск потока для чтения данных
     */
    public void start() {
        webSocket.connect();
    }

    /**
     * Функция, которая устанавливает обработчик входящих сообщений.
     * В параметре следует переопределить метод "onMessage(JsonHandler message)"
     * @param streamMessageHandler объект класса StreamMessageHandler
     * @return объект класса Stream
     * @see StreamMessageHandler
     */
    public Stream setStreamMessageHandler(StreamMessageHandler streamMessageHandler) {
        this.streamMessageHandler = streamMessageHandler;
        return this;
    }
}
