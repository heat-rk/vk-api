package com.github.heatalways.utils;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.http.HttpGet;

import java.io.IOException;

/**
 * Класс для обработки тела GET запроса к VK API.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Request {
    private final FinalURL finalURL = new FinalURL();
    public String getServiceKey(String id, String sec) throws IOException {
        String url = finalURL.getTokenUrl(id, sec);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        return r.get("access_token").toString();
    }
    public String getServiceKey(String id, String sec, String redirect_uri, String code, String group_id) throws IOException {
        String url = finalURL.getTokenUrl(id, sec, redirect_uri, code);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        if (group_id == null) {
            return r.get("access_token").toString();
        } else {
            return r.get("access_token_" + group_id).toString();
        }
    }
    public static Object get(String url) {
        try {
            JsonHandler r = new JsonHandler(HttpGet.get(url));
            Object response = r.get("response").getObject();
            if (response != null) {
                return response;
            } else {
                throw new NullPointerException(r.get("error").toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static JsonHandler getCallBackResponse(String url) {
        try {
            return new JsonHandler(HttpGet.get(url));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
