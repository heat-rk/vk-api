package com.github.heatalways.longPollApi.botsLongPoll;

import com.github.heatalways.callbackApi.CallbackMessageHandler;
import com.github.heatalways.callbackApi.EventMethod;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.longPollApi.LongPollObject;
import com.github.heatalways.objects.groups.Groups;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с BotsLongPollApi.
 * Нужный вам метод для дальнейшей работы нужно переопределить!
 * Подробнее на https://vk.com/dev/bots_longpoll
 * @author heat"kazyxanovr1@gmail.com"
 */
public class BotsLongPollApi extends LongPollObject {
    /**
     * Создает объект класса BotsLongPollApi
     * @param vkApi объект класса VkApi
     * @param group_id идентификатор группы, от имени которой будет осуществляться работа с API
     * @param wait время ожидания ответа
     */
    public BotsLongPollApi(VkApi vkApi, String group_id, int wait) {
        this.wait = wait;
        JsonHandler response = vkApi.groups.method(Groups.getLongPollServer)
                .params("group_id=" + group_id).execute();
        server = response.get("server").toString();
        key = response.get("key").toString();
        ts = response.get("ts").toString();
    }

    @Override
    public void makeRequest() {
        String url = server +
                "?act=a_check&key=" + key +
                "&ts=" + ts +
                "&wait=" + wait;
        JsonHandler response = Request.getCallBackResponse(url);
        ts = response.get("ts").toString();
        check(response.get("updates"));
    }

    /**
     * Проверяет, к какому событию относится ответ
     * @param updates ответ от сервера
     */
    private void check(JsonHandler updates) {
        if (updates.toArray().length > 0) {
            for (JsonHandler event : updates.toArray()) {
                EventMethod.call(event, (CallbackMessageHandler) messageHandlerObject);
            }
        }

    }
}
