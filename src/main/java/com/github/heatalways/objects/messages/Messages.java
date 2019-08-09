package com.github.heatalways.objects.messages;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Messages.
 * Подробнее на https://vk.com/dev/messages
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Messages extends MethodObject {
    public final static String addChatUser = "addChatUser";
    public final static String allowMessagesFromGroup = "allowMessagesFromGroup";
    public final static String createChat = "createChat";
    public final static String delete = "delete";
    public final static String deleteChatPhoto = "deleteChatPhoto";
    public final static String deleteConversation = "deleteConversation";
    public final static String denyMessagesFromGroup = "denyMessagesFromGroup";
    public final static String edit = "edit";
    public final static String editChat = "editChat";
    public final static String getByConversationMessageId = "getByConversationMessageId";
    public final static String getById = "getById";
    public final static String getChat = "getChat";
    public final static String getChatPreview = "getChatPreview";
    public final static String getConversationMembers = "getConversationMembers";
    public final static String getConversations = "getConversations";
    public final static String getConversationsById = "getConversationsById";
    public final static String getHistory = "getHistory";
    public final static String getHistoryAttachments = "getHistoryAttachments";
    public final static String getImportantMessages = "getImportantMessages";
    public final static String getInviteLink = "getInviteLink";
    public final static String getLastActivity = "getLastActivity";
    public final static String getLongPollHistory = "getLongPollHistory";
    public final static String getLongPollServer = "getLongPollServer";
    public final static String isMessagesFromGroupAllowed = "isMessagesFromGroupAllowed";
    public final static String joinChatByInviteLink = "joinChatByInviteLink";
    public final static String markAsAnsweredConversation = "markAsAnsweredConversation";
    public final static String markAsImportant = "markAsImportant";
    public final static String markAsImportantConversation = "markAsImportantConversation";
    public final static String markAsRead = "markAsRead";
    public final static String pin = "pin";
    public final static String removeChatUser = "removeChatUser";
    public final static String restore = "restore";
    public final static String search = "search";
    public final static String searchConversations = "searchConversations";
    public final static String send = "send";
    public final static String setActivity = "setActivity";
    public final static String setChatPhoto = "setChatPhoto";
    public final static String unpin = "unpin";

    public Messages(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "messages";
    }
}
