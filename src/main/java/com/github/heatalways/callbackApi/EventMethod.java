package com.github.heatalways.callbackApi;

import com.github.heatalways.jsonHandler.JsonHandler;

/**
 * Класс для вызова нужного метода какого-либо события
 * @author heat"kazyxanovr1@gmail.com"
 */
public class EventMethod {
    public static void call(JsonHandler event, CallbackMessageHandler callbackMessageHandler) {
        String type = event.get("type").toString();
        if (type.equals("message_new")) {
            callbackMessageHandler.messageNew(event.get("object"));
        } else if (type.equals("message_reply")) {
            callbackMessageHandler.messageReply(event.get("object"));
        } else if (type.equals("message_edit")) {
            callbackMessageHandler.messageEdit(event.get("object"));
        } else if (type.equals("message_allow")) {
            callbackMessageHandler.messageAllow(event.get("object"));
        } else if (type.equals("message_deny")) {
            callbackMessageHandler.messageDeny(event.get("object"));
        } else if (type.equals("photo_new")) {
            callbackMessageHandler.photoNew(event.get("object"));
        } else if (type.equals("photo_comment_new")) {
            callbackMessageHandler.photoCommentNew(event.get("object"));
        } else if (type.equals("photo_comment_edit")) {
            callbackMessageHandler.photoCommentEdit(event.get("object"));
        } else if (type.equals("photo_comment_restore")) {
            callbackMessageHandler.photoCommentRestore(event.get("object"));
        } else if (type.equals("photo_comment_delete")) {
            callbackMessageHandler.photoCommentDelete(event.get("object"));
        } else if (type.equals("audio_new")) {
            callbackMessageHandler.audioNew(event.get("object"));
        } else if (type.equals("video_new")) {
            callbackMessageHandler.videoNew(event.get("object"));
        } else if (type.equals("video_comment_new")) {
            callbackMessageHandler.videoCommentNew(event.get("object"));
        } else if (type.equals("video_comment_edit")) {
            callbackMessageHandler.videoCommentEdit(event.get("object"));
        } else if (type.equals("video_comment_restore")) {
            callbackMessageHandler.videoCommentRestore(event.get("object"));
        } else if (type.equals("video_comment_delete")) {
            callbackMessageHandler.videoCommentDelete(event.get("object"));
        } else if (type.equals("wall_post_new")) {
            callbackMessageHandler.wallPostNew(event.get("object"));
        } else if (type.equals("wall_repost")) {
            callbackMessageHandler.wallRepost(event.get("object"));
        } else if (type.equals("wall_reply_new")) {
            callbackMessageHandler.wallReplyNew(event.get("object"));
        } else if (type.equals("wall_reply_edit")) {
            callbackMessageHandler.wallReplyEdit(event.get("object"));
        } else if (type.equals("wall_reply_restore")) {
            callbackMessageHandler.wallReplyRestore(event.get("object"));
        } else if (type.equals("wall_reply_delete")) {
            callbackMessageHandler.wallReplyDelete(event.get("object"));
        } else if (type.equals("board_post_new")) {
            callbackMessageHandler.boardPostNew(event.get("object"));
        } else if (type.equals("board_post_edit")) {
            callbackMessageHandler.boardPostEdit(event.get("object"));
        } else if (type.equals("board_post_restore")) {
            callbackMessageHandler.boardPostRestore(event.get("object"));
        } else if (type.equals("board_post_delete")) {
            callbackMessageHandler.boardPostDelete(event.get("object"));
        } else if (type.equals("market_comment_new ")) {
            callbackMessageHandler.marketCommentNew(event.get("object"));
        } else if (type.equals("market_comment_edit")) {
            callbackMessageHandler.marketCommentEdit(event.get("object"));
        } else if (type.equals("market_comment_restore")) {
            callbackMessageHandler.marketCommentRestore(event.get("object"));
        } else if (type.equals("market_comment_delete")) {
            callbackMessageHandler.marketCommentDelete(event.get("object"));
        } else if (type.equals("group_leave")) {
            callbackMessageHandler.groupLeave(event.get("object"));
        } else if (type.equals("group_join")) {
            callbackMessageHandler.groupJoin(event.get("object"));
        } else if (type.equals("user_block")) {
            callbackMessageHandler.userBlock(event.get("object"));
        } else if (type.equals("user_unblock")) {
            callbackMessageHandler.userUnblock(event.get("object"));
        } else if (type.equals("poll_vote_new")) {
            callbackMessageHandler.pollVoteNew(event.get("object"));
        } else if (type.equals("group_officers_edit ")) {
            callbackMessageHandler.groupOfficersEdit(event.get("object"));
        } else if (type.equals("group_change_settings")) {
            callbackMessageHandler.groupChangeSettings(event.get("object"));
        } else if (type.equals("group_change_photo")) {
            callbackMessageHandler.groupChangePhoto(event.get("object"));
        } else if (type.equals("vkpay_transaction")) {
            callbackMessageHandler.vkpayTransaction(event.get("object"));
        }
    }
}
