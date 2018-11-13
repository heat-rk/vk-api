package com.github.heatalways.objects.messages;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Messages.
 * Подробнее на https://vk.com/dev/messages
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Messages {

    private final VkApi vkApi;
    public Messages(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addChatUser
    public JsonHandler addChatUser(String... args) {
        String url = vkApi.getFinalURL().get("messages.addChatUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //allowMessagesFromGroup
    public JsonHandler allowMessagesFromGroup(String... args) {
        String url = vkApi.getFinalURL().get("messages.allowMessagesFromGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createChat
    public JsonHandler createChat(String... args) {
        String url = vkApi.getFinalURL().get("messages.createChat",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("messages.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteChatPhoto
    public JsonHandler deleteChatPhoto(String... args) {
        String url = vkApi.getFinalURL().get("messages.deleteChatPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteConversation
    public JsonHandler deleteConversation(String... args) {
        String url = vkApi.getFinalURL().get("messages.deleteConversation",
                args);
        return new JsonHandler(Request.get(url));
    }


    //denyMessagesFromGroup
    public JsonHandler denyMessagesFromGroup(String... args) {
        String url = vkApi.getFinalURL().get("messages.denyMessagesFromGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("messages.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editChat
    public JsonHandler editChat(String... args) {
        String url = vkApi.getFinalURL().get("messages.editChat",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getByConversationMessageId
    public JsonHandler getByConversationMessageId(String... args) {
        String url = vkApi.getFinalURL().get("messages.getByConversationMessageId",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("messages.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getChat
    public JsonHandler getChat(String... args) {
        String url = vkApi.getFinalURL().get("messages.getChat",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getChatPreview
    public JsonHandler getChatPreview(String... args) {
        String url = vkApi.getFinalURL().get("messages.getChatPreview",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getConversationMembers
    public JsonHandler getConversationMembers(String... args) {
        String url = vkApi.getFinalURL().get("messages.getConversationMembers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getConversations
    public JsonHandler getConversations(String... args) {
        String url = vkApi.getFinalURL().get("messages.getConversations",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getConversationsById
    public JsonHandler getConversationsById(String... args) {
        String url = vkApi.getFinalURL().get("messages.getConversationsById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getHistory
    public JsonHandler getHistory(String... args) {
        String url = vkApi.getFinalURL().get("messages.getHistory",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getHistoryAttachments
    public JsonHandler getHistoryAttachments(String... args) {
        String url = vkApi.getFinalURL().get("messages.getHistoryAttachments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getImportantMessages
    public JsonHandler getImportantMessages(String... args) {
        String url = vkApi.getFinalURL().get("messages.getImportantMessages",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getInviteLink
    public JsonHandler getInviteLink(String... args) {
        String url = vkApi.getFinalURL().get("messages.getInviteLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLastActivity
    public JsonHandler getLastActivity(String... args) {
        String url = vkApi.getFinalURL().get("messages.getLastActivity",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLongPollHistory
    public JsonHandler getLongPollHistory(String... args) {
        String url = vkApi.getFinalURL().get("messages.getLongPollHistory",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLongPollServer
    public JsonHandler getLongPollServer(String... args) {
        String url = vkApi.getFinalURL().get("messages.getLongPollServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //isMessagesFromGroupAllowed
    public JsonHandler isMessagesFromGroupAllowed(String... args) {
        String url = vkApi.getFinalURL().get("messages.isMessagesFromGroupAllowed",
                args);
        return new JsonHandler(Request.get(url));
    }


    //joinChatByInviteLink
    public JsonHandler joinChatByInviteLink(String... args) {
        String url = vkApi.getFinalURL().get("messages.joinChatByInviteLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //markAsAnsweredConversation
    public JsonHandler markAsAnsweredConversation(String... args) {
        String url = vkApi.getFinalURL().get("messages.markAsAnsweredConversation",
                args);
        return new JsonHandler(Request.get(url));
    }


    //markAsImportant
    public JsonHandler markAsImportant(String... args) {
        String url = vkApi.getFinalURL().get("messages.markAsImportant",
                args);
        return new JsonHandler(Request.get(url));
    }


    //markAsImportantConversation
    public JsonHandler markAsImportantConversation(String... args) {
        String url = vkApi.getFinalURL().get("messages.markAsImportantConversation",
                args);
        return new JsonHandler(Request.get(url));
    }


    //markAsRead
    public JsonHandler markAsRead(String... args) {
        String url = vkApi.getFinalURL().get("messages.markAsRead",
                args);
        return new JsonHandler(Request.get(url));
    }


    //pin
    public JsonHandler pin(String... args) {
        String url = vkApi.getFinalURL().get("messages.pin",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeChatUser
    public JsonHandler removeChatUser(String... args) {
        String url = vkApi.getFinalURL().get("messages.removeChatUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restore
    public JsonHandler restore(String... args) {
        String url = vkApi.getFinalURL().get("messages.restore",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("messages.search",
                args);
        return new JsonHandler(Request.get(url));
    }


    //searchConversations
    public JsonHandler searchConversations(String... args) {
        String url = vkApi.getFinalURL().get("messages.searchConversations",
                args);
        return new JsonHandler(Request.get(url));
    }


    //send
    public JsonHandler send(String... args) {
        String url = vkApi.getFinalURL().get("messages.send",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setActivity
    public JsonHandler setActivity(String... args) {
        String url = vkApi.getFinalURL().get("messages.setActivity",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setChatPhoto
    public JsonHandler setChatPhoto(String... args) {
        String url = vkApi.getFinalURL().get("messages.setChatPhoto",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unpin
    public JsonHandler unpin(String... args) {
        String url = vkApi.getFinalURL().get("messages.unpin",
                args);
        return new JsonHandler(Request.get(url));
    }
}
