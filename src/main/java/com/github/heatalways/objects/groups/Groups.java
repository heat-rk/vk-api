package com.github.heatalways.objects.groups;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Groups.
 * Подробнее на https://vk.com/dev/groups
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Groups extends MethodObject {
    public final static String addCallbackServer = "addCallbackServer";
    public final static String addLink = "addLink";
    public final static String approveRequest = "approveRequest";
    public final static String ban = "ban";
    public final static String create = "create";
    public final static String deleteCallbackServer = "deleteCallbackServer";
    public final static String deleteLink = "deleteLink";
    public final static String disableOnline = "disableOnline";
    public final static String edit = "edit";
    public final static String editCallbackServer = "editCallbackServer";
    public final static String editLink = "editLink";
    public final static String editManager = "editManager";
    public final static String editPlace = "editPlace";
    public final static String enableOnline = "enableOnline";
    public final static String get = "get";
    public final static String getAddresses = "getAddresses";
    public final static String getBanned = "getBanned";
    public final static String getById = "getById";
    public final static String getCallbackConfirmationCode = "getCallbackConfirmationCode";
    public final static String getCallbackServers = "getCallbackServers";
    public final static String getCallbackSettings = "getCallbackSettings";
    public final static String getCatalog = "getCatalog";
    public final static String getCatalogInfo = "getCatalogInfo";
    public final static String getInvitedUsers = "getInvitedUsers";
    public final static String getInvites = "getInvites";
    public final static String getLongPollServer = "getLongPollServer";
    public final static String getLongPollSettings = "getLongPollSettings";
    public final static String getMembers = "getMembers";
    public final static String getOnlineStatus = "getOnlineStatus";
    public final static String getRequests = "getRequests";
    public final static String getSettings = "getSettings";
    public final static String getTokenPermissions = "getTokenPermissions";
    public final static String invite = "invite";
    public final static String isMember = "isMember";
    public final static String join = "join";
    public final static String leave = "leave";
    public final static String removeUser = "removeUser";
    public final static String reorderLink = "reorderLink";
    public final static String search = "search";
    public final static String setCallbackSettings = "setCallbackSettings";
    public final static String setLongPollSettings = "setLongPollSettings";
    public final static String unban = "unban";

    public Groups(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "groups";
    }
}
