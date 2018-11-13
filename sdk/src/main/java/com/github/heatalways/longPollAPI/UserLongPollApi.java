package com.github.heatalways.longPollAPI;

import com.github.heatalways.jsonHandler.JsonHandler;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с UserLongPollApi.
 * Метод "onResponse(JsonHandler response)" нужно переопределить для получения данных!
 * Подробнее на https://vk.com/dev/using_longpoll
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class UserLongPollApi {
    private final String key;
    private final String server;
    private String ts;
    private UserMessageHandler userMessageHandler;
    private final int mode;
    private final int wait;
    private final int version;

    /**
     * Создает объект класса UserLongPollApi
     * @param vkApi объект класса VkApi
     * @param need_pts возращать поле pts{1,0}
     * @param group_id идентификатор группы, от имени которой будет осуществляться работа с API
     * @param wait время ожидания ответа
     * @param mode дополнительные опции ответа
     * @param version версия
     */
    public UserLongPollApi(VkApi vkApi, int need_pts, String group_id, int wait, int mode, int version) {
        JsonHandler response = vkApi.messages.getLongPollServer(
                "need_pts" + need_pts,
                "group_id=" + group_id,
                "lp_version=" + version);
        this.key = response.get("key").toString();
        this.server = response.get("server").toString();
        this.ts = response.get("ts").toString();
        this.mode = mode;
        this.wait = wait;
        this.version = version;
        start();
    }
    public UserLongPollApi setUserMessageHandler(UserMessageHandler userMessageHandler) {
        this.userMessageHandler = userMessageHandler;
        return this;
    }
    private void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String url = "https://" + server +
                            "?act=a_check&key=" + key +
                            "&ts=" + ts +
                            "&wait=" + wait +
                            "&mode=" + mode +
                            "&version=" + version;
                    JsonHandler response = Request.getCallBackResponse(url);
                    ts = response.get("ts").toString();
                    userMessageHandler.onResponse(response.get("updates"));
                }
            }
        }).start();
    }
}
