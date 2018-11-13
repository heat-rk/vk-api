package ru.heat.vkapi.objects.board;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Board.
 * Подробнее на https://vk.com/dev/board
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Board {

    private final VkApi vkApi;
    public Board(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addTopic
    public JsonHandler addTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.addTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //closeTopic
    public JsonHandler closeTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.closeTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createComment
    public JsonHandler createComment(String... args) {
        String url = vkApi.getFinalURL().get("board.createComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteComment
    public JsonHandler deleteComment(String... args) {
        String url = vkApi.getFinalURL().get("board.deleteComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteTopic
    public JsonHandler deleteTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.deleteTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editComment
    public JsonHandler editComment(String... args) {
        String url = vkApi.getFinalURL().get("board.editComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //editTopic
    public JsonHandler editTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.editTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //fixTopic
    public JsonHandler fixTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.fixTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getComments
    public JsonHandler getComments(String... args) {
        String url = vkApi.getFinalURL().get("board.getComments",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTopics
    public JsonHandler getTopics(String... args) {
        String url = vkApi.getFinalURL().get("board.getTopics",
                args);
        return new JsonHandler(Request.get(url));
    }


    //openTopic
    public JsonHandler openTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.openTopic",
                args);
        return new JsonHandler(Request.get(url));
    }


    //restoreComment
    public JsonHandler restoreComment(String... args) {
        String url = vkApi.getFinalURL().get("board.restoreComment",
                args);
        return new JsonHandler(Request.get(url));
    }


    //unfixTopic
    public JsonHandler unfixTopic(String... args) {
        String url = vkApi.getFinalURL().get("board.unfixTopic",
                args);
        return new JsonHandler(Request.get(url));
    }
}
