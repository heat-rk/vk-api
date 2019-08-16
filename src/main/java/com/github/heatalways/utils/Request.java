package com.github.heatalways.utils;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.http.HttpGet;
import com.github.heatalways.vkAuth.VkAuthInterface;

import java.io.IOException;

/**
 * Класс для обработки тела GET запроса к VK API.
 * @author heat"kazyxanovr1@gmail.com"
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
     * @param sec секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @throws IOException ошибка. Указаны неверные данные (параметры) функции
     */
    public void getAccessToken(String id, String sec) throws IOException {
        String url = vkAuthInterface.getURLHandler().getTokenUrl(id, sec);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        vkAuthInterface.setAccessToken(r.get("access_token").toString());
    }

    /**
     * Получение ключа доступа (access token)
     * @param id идентификатор Вашего приложения
     * @param sec секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @param redirectUri URL, который использовался при получении code на первом этапе авторизации. Должен быть аналогичен переданному при авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @param groupId идентификатор группы, от имени которой будет осуществляться работа с API
     * @throws IOException ошибка. Данные, переданные в качестве параметра не действительны!
     */
    public void getAccessToken(String id, String sec, String redirectUri, String code, String groupId) throws IOException {
        String url = vkAuthInterface.getURLHandler().getTokenUrl(id, sec, redirectUri, code);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        if (groupId == null) {
            vkAuthInterface.setAccessToken(r.get("access_token").toString());
            vkAuthInterface.setUserId(r.get("user_id").toString());
        } else {
            vkAuthInterface.setAccessToken(r.get("access_token_" + groupId).toString());
        }
    }

    /**
     * Получение ключа доступа (access token)
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @param login логин
     * @param password пароль
     * @param scope права доступа, необходимые приложению
     * @param twoFaSupported передайте 1, чтобы включить поддержку двухфакторной аутентификации
     * @param code код подтверждения
     * @param args дополнительные параметры
     * @throws IOException ошибка. Данные, переданные в качестве параметра не действительны!
     */
    public void getAccessToken(String clientId, String clientSecret, String login, String password, String scope, int twoFaSupported, String code, String... args) throws IOException {
        String url = vkAuthInterface.getURLHandler().getTokenUrl(clientId, clientSecret, login, password, scope, twoFaSupported, code, args);
        JsonHandler r = new JsonHandler(HttpGet.get(url));
        vkAuthInterface.setAccessToken(r.get("access_token").toString());
        vkAuthInterface.setUserId(r.get("user_id").toString());
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
