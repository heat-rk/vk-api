package com.github.heatalways.objects.notes;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Notes.
 * Подробнее на https://vk.com/dev/notes
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Notes {

    private final VkApi vkApi;
    public Notes(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //add
    public JsonHandler add(String... args) {
        String url = vkApi.getFinalURL().get("notes.add",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("notes.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("notes.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("notes.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //edit
    public JsonHandler edit(String... args) {
        String url = vkApi.getFinalURL().get("notes.edit",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("notes.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("notes.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getById
    public JsonHandler getById(String... args) {
        String url = vkApi.getFinalURL().get("notes.getById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("notes.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("notes.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }
}
