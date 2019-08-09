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
    /**
     * Добавляет правило в поток
     * @param url URL, по которому SDK обращается к API VK
     * @param json правило в формате JSON
     * @return ответ от сервера (успех/ошибка)
     */
    public static String addRule(String url, String json) {
        try {
            StringEntity stringEntity = new StringEntity(json);
            return HttpPost.getResult(url, stringEntity, "application/json");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Удаляет правило из потока
     * @param url URL, по которому SDK обращается к API VK
     * @param json метка в формате JSON
     * @return ответ от сервера (успех/ошибка)
     */
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
