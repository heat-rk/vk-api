package com.github.heatalways.longPollAPI;

import com.github.heatalways.jsonHandler.JsonHandler;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с BotsLongPollApi.
 * Нужный вам метод для дальнейшей работы нужно переопределить!
 * Подробнее на https://vk.com/dev/bots_longpoll
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class BotsLongPollApi {
    private final String key;
    private final String server;
    private String ts;
    private BotsMessageHandler botsMessageHandler;
    private final int wait;

    /**
     * Создает объект класса BotsLongPollApi
     * @param vkApi объект класса VkApi
     * @param group_id идентификатор группы, от имени которой будет осуществляться работа с API
     * @param wait время ожидания ответа
     */
    public BotsLongPollApi(VkApi vkApi, String group_id, int wait) {
        this.wait = wait;
        JsonHandler response = vkApi.groups.getLongPollServer("group_id=" + group_id);
        server = response.get("server").toString();
        key = response.get("key").toString();
        ts = response.get("ts").toString();
        start();
    }
    private void check(JsonHandler updates) {
        if (updates.toArray().length > 0) {
            for (JsonHandler event : updates.toArray()) {
                if (event.get("type").toString().equals("message_new")) {
                    botsMessageHandler.message_new(event.get("object"));
                } else if (event.get("type").toString().equals("message_reply")) {
                    botsMessageHandler.message_reply(event.get("object"));
                } else if (event.get("type").toString().equals("message_edit")) {
                    botsMessageHandler.message_edit(event.get("object"));
                } else if (event.get("type").toString().equals("message_edit")) {
                    botsMessageHandler.message_edit(event.get("object"));
                } else if (event.get("type").toString().equals("message_allow")) {
                    botsMessageHandler.message_allow(event.get("object"));
                } else if (event.get("type").toString().equals("message_deny")) {
                    botsMessageHandler.message_deny(event.get("object"));
                } else if (event.get("type").toString().equals("photo_new")) {
                    botsMessageHandler.photo_new(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_new")) {
                    botsMessageHandler.photo_comment_new(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_edit")) {
                    botsMessageHandler.photo_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_restore")) {
                    botsMessageHandler.photo_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("photo_comment_delete")) {
                    botsMessageHandler.photo_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("audio_new")) {
                    botsMessageHandler.audio_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_new")) {
                    botsMessageHandler.video_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_new")) {
                    botsMessageHandler.video_comment_new(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_edit")) {
                    botsMessageHandler.video_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_restore")) {
                    botsMessageHandler.video_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("video_comment_delete")) {
                    botsMessageHandler.video_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("wall_post_new")) {
                    botsMessageHandler.wall_post_new(event.get("object"));
                } else if (event.get("type").toString().equals("wall_repost")) {
                    botsMessageHandler.wall_repost(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_new")) {
                    botsMessageHandler.wall_reply_new(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_edit")) {
                    botsMessageHandler.wall_reply_edit(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_restore")) {
                    botsMessageHandler.wall_reply_restore(event.get("object"));
                } else if (event.get("type").toString().equals("wall_reply_delete")) {
                    botsMessageHandler.wall_reply_delete(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_new")) {
                    botsMessageHandler.board_post_new(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_edit")) {
                    botsMessageHandler.board_post_edit(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_restore")) {
                    botsMessageHandler.board_post_restore(event.get("object"));
                } else if (event.get("type").toString().equals("board_post_delete")) {
                    botsMessageHandler.board_post_delete(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_new ")) {
                    botsMessageHandler.market_comment_new (event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_edit")) {
                    botsMessageHandler.market_comment_edit(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_restore")) {
                    botsMessageHandler.market_comment_restore(event.get("object"));
                } else if (event.get("type").toString().equals("market_comment_delete")) {
                    botsMessageHandler.market_comment_delete(event.get("object"));
                } else if (event.get("type").toString().equals("group_leave")) {
                    botsMessageHandler.group_leave(event.get("object"));
                } else if (event.get("type").toString().equals("group_join")) {
                    botsMessageHandler.group_join(event.get("object"));
                } else if (event.get("type").toString().equals("user_block")) {
                    botsMessageHandler.user_block(event.get("object"));
                } else if (event.get("type").toString().equals("user_unblock")) {
                    botsMessageHandler.user_unblock(event.get("object"));
                } else if (event.get("type").toString().equals("poll_vote_new")) {
                    botsMessageHandler.poll_vote_new(event.get("object"));
                } else if (event.get("type").toString().equals("group_officers_edit ")) {
                    botsMessageHandler.group_officers_edit (event.get("object"));
                } else if (event.get("type").toString().equals("group_change_settings")) {
                    botsMessageHandler.group_change_settings(event.get("object"));
                } else if (event.get("type").toString().equals("group_change_photo")) {
                    botsMessageHandler.group_change_photo(event.get("object"));
                } else if (event.get("type").toString().equals("vkpay_transaction")) {
                    botsMessageHandler.vkpay_transaction(event.get("object"));
                }
            }
        }
    }
    public BotsLongPollApi setBotsMessageHandler(BotsMessageHandler botsMessageHandler) {
        this.botsMessageHandler = botsMessageHandler;
        return this;
    }
    private void start() {
        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    String url = server +
                            "?act=a_check&key=" + key +
                            "&ts=" + ts +
                            "&wait=" + wait;
                    JsonHandler response = Request.getCallBackResponse(url);
                    ts = response.get("ts").toString();
                    check(response.get("updates"));
                }
            }
        }).start();
    }
}
