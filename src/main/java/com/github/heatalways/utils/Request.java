package com.github.heatalways.utils;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.http.HttpGet;
import com.github.heatalways.vkAuth.VkAuthInterface;

import java.io.IOException;

/**
 * Класс для обработки тела GET запроса к VK API.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Request {
    private final VkAuthInterface vkAuthInterface;

    /**
     * Создание объекта Request с помощью объекта класса VkAuthInterface
     * @param vkAuthInterface интерфейс класса VkAuth
     */
    public Request(VkAuthInterface vkAuthInterface) {
        this.vkAuthInterface = vkAuthInterface;
    }

    /**
     * Получение сервисного ключа доступа (access token)
     * @param id идентификатор Вашего приложения
     * @param sec секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек, на странице https://vk.com/editapp?id={API_ID}&section=options
     * @return сервисный ключ доступа (access token)
     * @throws IOException ошибка. Указаны неверные данные (параметры) функции
     */
    public String getAccessToken(String id, String sec) throws IOException {
        String url = vkAuthInterface.getURLHandler().getTokenUrl(id, sec);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        return r.get("access_token").toString();
    }

    /**
     * Получение ключа доступа (access token)
     * @param id идентификатор Вашего приложения
     * @param sec секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек, на странице https://vk.com/editapp?id={API_ID}&section=options
     * @param redirect_uri URL, который использовался при получении code на первом этапе авторизации. Должен быть аналогичен переданному при авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @param group_id идентификатор группы, от имени которой будет осуществляться работа с API
     * @return ключ доступа (access token)
     * @throws IOException ошибка. Данные, переданные в качестве параметра не действительны!
     */
    public String getAccessToken(String id, String sec, String redirect_uri, String code, String group_id) throws IOException {
        String url = vkAuthInterface.getURLHandler().getTokenUrl(id, sec, redirect_uri, code);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        if (group_id == null) {
            return r.get("access_token").toString();
        } else {
            return r.get("access_token_" + group_id).toString();
        }
    }

    /**
     * Получение ответа от HttpGet запроса (используется для получения ответа от вызовов методов VK API)
     * @param url URL, пол которому должен осуществиться запрос
     * @return ответ от HttpGet запроса в формате JSON
     */
    public static Object get(String url) {
        JsonHandler r = getCallBackResponse(url);
        Object response = r.get("response").getObject();
        if (response != null) {
            return response;
        } else {
            throw new NullPointerException(r.get("error").toString());
        }
    }
    /**
     * Получение ответа от HttpGet запроса
     * @param url URL, пол которому должен осуществиться запрос
     * @return ответ от HttpGet запроса в формате JSON
     */
    public static JsonHandler getCallBackResponse(String url) {
        try {
            return new JsonHandler(HttpGet.get(url));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
