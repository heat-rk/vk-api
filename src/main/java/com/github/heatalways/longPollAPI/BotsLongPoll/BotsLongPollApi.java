package com.github.heatalways.longPollAPI.BotsLongPoll;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.longPollAPI.LongPollObject;
import com.github.heatalways.objects.groups.Groups;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с BotsLongPollApi.
 * Нужный вам метод для дальнейшей работы нужно переопределить!
 * Подробнее на https://vk.com/dev/bots_longpoll
 * @author heat"kazyxanovr1@gmail.com"
 *
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
        JsonHandler response = vkApi.groups.method(Groups.getLongPollServer).params(
                "group_id=" + group_id).execute();
        server = response.get("server").toString();
        key = response.get("key").toString();
        ts = response.get("ts").toString();
    }

    @Override
    protected void bodyOfThread() {
        String url = server +
                "?act=a_check&key=" + key +
                "&ts=" + ts +
                "&wait=" + wait;
        JsonHandler response = Request.getCallBackResponse(url);
        ts = response.get("ts").toString();
        check(response.get("updates"));
    }

    private void check(JsonHandler updates) {
        if (updates.toArray().length > 0) {
            for (JsonHandler event : updates.toArray()) {
                if (event.get("type").toString().equals("message_new")) {
                    ((BotsMessageHandler) messageHandlerObject).message_new(event.get("object"));
                } else if (event.get("type").toString().equals("message_reply")) {
                    ((BotsMessageHandler) messageHandlerObject).message_reply(event.get("object"));
                } else if (event.get("type").toString().equals("message_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).message_edit(event.get("object"));
                } else if (event.get("type").toString().equals("message_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).message_edit(event.get("object"));
                } else if (event.get("type").toString().equals("message_allow")) {
                    ((BotsMessageHandler) messageHandlerObject).message_allow(event.get("object"));
                } else if (event.get("type").toString().equals("message_deny")) {
                    ((BotsMessageHandler) messageHandlerObject).message_deny(event.get("object"));
                } else if (event.get("type").toString().equals("photo_new")) {
                    ((BotsMessageHandler) messageHandlerObject).photo_new(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_new")) {
                    ((BotsMessageHandler) messageHandlerObject).photo_comment_new(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).photo_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_restore")) {
                    ((BotsMessageHandler) messageHandlerObject).photo_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_delete")) {
                    ((BotsMessageHandler) messageHandlerObject).photo_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("audio_new")) {
                    ((BotsMessageHandler) messageHandlerObject).audio_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_new")) {
                    ((BotsMessageHandler) messageHandlerObject).video_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_new")) {
                    ((BotsMessageHandler) messageHandlerObject).video_comment_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).video_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_restore")) {
                    ((BotsMessageHandler) messageHandlerObject).video_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_delete")) {
                    ((BotsMessageHandler) messageHandlerObject).video_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("wall_post_new")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_post_new(event.get("object"));
                } else if (event.get("type").toString().equals("wall_repost")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_repost(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_new")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_reply_new(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_reply_edit(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_restore")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_reply_restore(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_delete")) {
                    ((BotsMessageHandler) messageHandlerObject).wall_reply_delete(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_new")) {
                    ((BotsMessageHandler) messageHandlerObject).board_post_new(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).board_post_edit(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_restore")) {
                    ((BotsMessageHandler) messageHandlerObject).board_post_restore(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_delete")) {
                    ((BotsMessageHandler) messageHandlerObject).board_post_delete(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_new ")) {
                    ((BotsMessageHandler) messageHandlerObject).market_comment_new (event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_edit")) {
                    ((BotsMessageHandler) messageHandlerObject).market_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_restore")) {
                    ((BotsMessageHandler) messageHandlerObject).market_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_delete")) {
                    ((BotsMessageHandler) messageHandlerObject).market_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("group_leave")) {
                    ((BotsMessageHandler) messageHandlerObject).group_leave(event.get("object"));
                } else if (event.get("type").toString().equals("group_join")) {
                    ((BotsMessageHandler) messageHandlerObject).group_join(event.get("object"));
                } else if (event.get("type").toString().equals("user_block")) {
                    ((BotsMessageHandler) messageHandlerObject).user_block(event.get("object"));
                } else if (event.get("type").toString().equals("user_unblock")) {
                    ((BotsMessageHandler) messageHandlerObject).user_unblock(event.get("object"));
                } else if (event.get("type").toString().equals("poll_vote_new")) {
                    ((BotsMessageHandler) messageHandlerObject).poll_vote_new(event.get("object"));
                } else if (event.get("type").toString().equals("group_officers_edit ")) {
                    ((BotsMessageHandler) messageHandlerObject).group_officers_edit (event.get("object"));
                } else if (event.get("type").toString().equals("group_change_settings")) {
                    ((BotsMessageHandler) messageHandlerObject).group_change_settings(event.get("object"));
                } else if (event.get("type").toString().equals("group_change_photo")) {
                    ((BotsMessageHandler) messageHandlerObject).group_change_photo(event.get("object"));
                } else if (event.get("type").toString().equals("vkpay_transaction")) {
                    ((BotsMessageHandler) messageHandlerObject).vkpay_transaction(event.get("object"));
                }
            }
        }

    }
}
