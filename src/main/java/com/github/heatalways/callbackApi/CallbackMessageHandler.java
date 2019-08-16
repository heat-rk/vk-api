package com.github.heatalways.callbackApi;

import com.github.heatalways.jsonHandler.JsonHandler;

/**
 * Класс для обработки событий
 * @author heat"kazyxanovr1@gmail.com"
 */
public class CallbackMessageHandler implements MessageHandlerObject {
    public void messageNew(JsonHandler object) {}
    public void messageReply(JsonHandler object) {}
    public void messageEdit(JsonHandler object) {}
    public void messageAllow(JsonHandler object) {}
    public void messageDeny(JsonHandler object) {}
    public void photoNew(JsonHandler object) {}
    public void photoCommentNew(JsonHandler object) {}
    public void photoCommentEdit(JsonHandler object) {}
    public void photoCommentRestore(JsonHandler object) {}
    public void photoCommentDelete(JsonHandler object) {}
    public void audioNew(JsonHandler object) {}
    public void videoNew(JsonHandler object) {}
    public void videoCommentNew(JsonHandler object) {}
    public void videoCommentEdit(JsonHandler object) {}
    public void videoCommentRestore(JsonHandler object) {}
    public void videoCommentDelete(JsonHandler object) {}
    public void wallPostNew(JsonHandler object) {}
    public void wallRepost(JsonHandler object) {}
    public void wallReplyNew(JsonHandler object) {}
    public void wallReplyEdit(JsonHandler object) {}
    public void wallReplyRestore(JsonHandler object) {}
    public void wallReplyDelete(JsonHandler object) {}
    public void boardPostNew(JsonHandler object) {}
    public void boardPostEdit(JsonHandler object) {}
    public void boardPostRestore(JsonHandler object) {}
    public void boardPostDelete(JsonHandler object) {}
    public void marketCommentNew(JsonHandler object) {}
    public void marketCommentEdit(JsonHandler object) {}
    public void marketCommentRestore(JsonHandler object) {}
    public void marketCommentDelete(JsonHandler object) {}
    public void groupLeave(JsonHandler object) {}
    public void groupJoin(JsonHandler object) {}
    public void userBlock(JsonHandler object) {}
    public void userUnblock(JsonHandler object) {}
    public void pollVoteNew(JsonHandler object) {}
    public void groupOfficersEdit(JsonHandler object) {}
    public void groupChangeSettings(JsonHandler object) {}
    public void groupChangePhoto(JsonHandler object) {}
    public void vkpayTransaction(JsonHandler object) {}
}
