package com.github.heatalways.objects.groups;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Groups.
 * Подробнее на https://vk.com/dev/groups
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Groups {

    private final VkApi vkApi;
    public Groups(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addCallbackServer
    public JsonHandler addCallbackServer(String... args) {
        String url = vkApi.getFinalURL().get("groups.addCallbackServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //addLink
    public JsonHandler addLink(String... args) {
        String url = vkApi.getFinalURL().get("groups.addLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //approveRequest
    public JsonHandler approveRequest(String... args) {
        String url = vkApi.getFinalURL().get("groups.approveRequest",
                args);
        return new JsonHandler(Request.get(url));
    }


    //ban
    public JsonHandler ban(String... args) {
        String url = vkApi.getFinalURL().get("groups.ban",
                args);
        return new JsonHandler(Request.get(url));
    }


    //create
    public JsonHandler create(String... args) {
        String url = vkApi.getFinalURL().get("groups.create",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteCallbackServer
    public JsonHandler deleteCallbackServer(String... args) {
        String url = vkApi.getFinalURL().get("groups.deleteCallbackServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteLink
    public JsonHandler deleteLink(String... args) {
        String url = vkApi.getFinalURL().get("groups.deleteLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //disableOnline
    public JsonHandler disableOnline(String... args) {
        String url = vkApi.getFinalURL().get("groups.disableOnline",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("groups.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editCallbackServer
    public JsonHandler editCallbackServer(String... args) {
        String url = vkApi.getFinalURL().get("groups.editCallbackServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editLink
    public JsonHandler editLink(String... args) {
        String url = vkApi.getFinalURL().get("groups.editLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editManager
    public JsonHandler editManager(String... args) {
        String url = vkApi.getFinalURL().get("groups.editManager",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editPlace
    public JsonHandler editPlace(String... args) {
        String url = vkApi.getFinalURL().get("groups.editPlace",
                args);
        return new JsonHandler(Request.get(url));
    }


    //enableOnline
    public JsonHandler enableOnline(String... args) {
        String url = vkApi.getFinalURL().get("groups.enableOnline",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("groups.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAddresses
    public JsonHandler getAddresses(String... args) {
        String url = vkApi.getFinalURL().get("groups.getAddresses",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBanned
    public JsonHandler getBanned(String... args) {
        String url = vkApi.getFinalURL().get("groups.getBanned",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("groups.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCallbackConfirmationCode
    public JsonHandler getCallbackConfirmationCode(String... args) {
        String url = vkApi.getFinalURL().get("groups.getCallbackConfirmationCode",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCallbackServers
    public JsonHandler getCallbackServers(String... args) {
        String url = vkApi.getFinalURL().get("groups.getCallbackServers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCallbackSettings
    public JsonHandler getCallbackSettings(String... args) {
        String url = vkApi.getFinalURL().get("groups.getCallbackSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCatalog
    public JsonHandler getCatalog(String... args) {
        String url = vkApi.getFinalURL().get("groups.getCatalog",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCatalogInfo
    public JsonHandler getCatalogInfo(String... args) {
        String url = vkApi.getFinalURL().get("groups.getCatalogInfo",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getInvitedUsers
    public JsonHandler getInvitedUsers(String... args) {
        String url = vkApi.getFinalURL().get("groups.getInvitedUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getInvites
    public JsonHandler getInvites(String... args) {
        String url = vkApi.getFinalURL().get("groups.getInvites",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLongPollServer
    public JsonHandler getLongPollServer(String... args) {
        String url = vkApi.getFinalURL().get("groups.getLongPollServer",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLongPollSettings
    public JsonHandler getLongPollSettings(String... args) {
        String url = vkApi.getFinalURL().get("groups.getLongPollSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getMembers
    public JsonHandler getMembers(String... args) {
        String url = vkApi.getFinalURL().get("groups.getMembers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getOnlineStatus
    public JsonHandler getOnlineStatus(String... args) {
        String url = vkApi.getFinalURL().get("groups.getOnlineStatus",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRequests
    public JsonHandler getRequests(String... args) {
        String url = vkApi.getFinalURL().get("groups.getRequests",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSettings
    public JsonHandler getSettings(String... args) {
        String url = vkApi.getFinalURL().get("groups.getSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTokenPermissions
    public JsonHandler getTokenPermissions(String... args) {
        String url = vkApi.getFinalURL().get("groups.getTokenPermissions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //invite
    public JsonHandler invite(String... args) {
        String url = vkApi.getFinalURL().get("groups.invite",
                args);
        return new JsonHandler(Request.get(url));
    }


    //isMember
    public JsonHandler isMember(String... args) {
        String url = vkApi.getFinalURL().get("groups.isMember",
                args);
        return new JsonHandler(Request.get(url));
    }


    //join
    public JsonHandler join(String... args) {
        String url = vkApi.getFinalURL().get("groups.join",
                args);
        return new JsonHandler(Request.get(url));
    }


    //leave
    public JsonHandler leave(String... args) {
        String url = vkApi.getFinalURL().get("groups.leave",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeUser
    public JsonHandler removeUser(String... args) {
        String url = vkApi.getFinalURL().get("groups.removeUser",
                args);
        return new JsonHandler(Request.get(url));
    }


    //reorderLink
    public JsonHandler reorderLink(String... args) {
        String url = vkApi.getFinalURL().get("groups.reorderLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //search
    public JsonHandler search(String... args) {
        String url = vkApi.getFinalURL().get("groups.search",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setCallbackSettings
    public JsonHandler setCallbackSettings(String... args) {
        String url = vkApi.getFinalURL().get("groups.setCallbackSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //setLongPollSettings
    public JsonHandler setLongPollSettings(String... args) {
        String url = vkApi.getFinalURL().get("groups.setLongPollSettings",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unban
    public JsonHandler unban(String... args) {
        String url = vkApi.getFinalURL().get("groups.unban",
                args);
        return new JsonHandler(Request.get(url));
    }
}
