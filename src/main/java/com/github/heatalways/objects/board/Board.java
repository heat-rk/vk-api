package com.github.heatalways.objects.board;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.VkApi;

/**
 * Класс для работы с методами объекта Board.
 * Подробнее на https://vk.com/dev/board
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Board extends MethodObject {
    public final static String addTopic = "addTopic";
    public final static String closeTopic = "closeTopic";
    public final static String createComment = "createComment";
    public final static String deleteComment = "deleteComment";
    public final static String deleteTopic = "deleteTopic";
    public final static String editComment = "editComment";
    public final static String editTopic = "editTopic";
    public final static String fixTopic = "fixTopic";
    public final static String getComments = "getComments";
    public final static String getTopics = "getTopics";
    public final static String openTopic = "openTopic";
    public final static String restoreComment = "restoreComment";
    public final static String unfixTopic = "unfixTopic";

    public Board(VkApi vkApi) {
        super(vkApi);
        object = "board";
    }
}
