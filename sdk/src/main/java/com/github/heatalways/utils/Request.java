package com.github.heatalways.utils;

import com.github.heatalways.jsonHandler.JsonHandler;
import ru.heat.vkapi.jsonHandler.JsonHandler;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Класс для получение тела GET запроса.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Request {
    private final FinalURL finalURL = new FinalURL();
    private static String getJsonString(String url) throws IOException {
        URLConnection urlConnection = new URL(url).openConnection();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
        return scanner.nextLine();
    }
    public String getServiceKey(String id, String sec) throws IOException {
        String url = finalURL.getTokenUrl(id, sec);
        JsonHandler r = new JsonHandler(getJsonString(url));
        return r.get("access_token").toString();
    }
    public String getServiceKey(String id, String sec, String redirect_uri, String code, String group_id) throws IOException {
        String url = finalURL.getTokenUrl(id, sec, redirect_uri, code);
        JsonHandler r = new JsonHandler(getJsonString(url));
        if (group_id == null) {
            return r.get("access_token").toString();
        } else {
            return r.get("access_token_" + group_id).toString();
        }
    }
    public static Object get(String url) {
        try {
            JsonHandler r = new JsonHandler(getJsonString(url));
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
            return new JsonHandler(getJsonString(url));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
