package ru.heat.vkapi.streamingAPI;

import org.apache.http.entity.StringEntity;
import ru.heat.vkapi.utils.HttpDelete;
import ru.heat.vkapi.utils.HttpPost;

import java.io.UnsupportedEncodingException;

/**
 * Класс для создания POST-запросов
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class BodyOfRequest {
    //addRule
    public static String addRule(String url, String json) {
        try {
            StringEntity stringEntity = new StringEntity(json);
            return HttpPost.getResult(url, stringEntity, "application/json");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }


    //deleteRule
    public static String deleteRule(String url, String json) {
        try {
            StringEntity stringEntity = new StringEntity(json);
            return HttpDelete.getResult(url, stringEntity, "application/json");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
