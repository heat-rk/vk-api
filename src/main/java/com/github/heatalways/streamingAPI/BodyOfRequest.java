package com.github.heatalways.streamingAPI;

import org.apache.http.entity.StringEntity;
import com.github.heatalways.utils.http.HttpDelete;
import com.github.heatalways.utils.http.HttpPost;

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
