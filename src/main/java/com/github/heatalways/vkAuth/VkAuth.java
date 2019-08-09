package com.github.heatalways.vkAuth;

import com.github.heatalways.utils.URLHandler;
import com.github.heatalways.utils.Request;

import java.io.IOException;

/**
 * Класс авторизации для работы с VkApi.
 * Подробнее на https://vk.com/dev/access_token
 * @author heat"kazyxanovr1@gmail.com"
 */
public class VkAuth implements VkAuthInterface {
    private String access_token;
    private String client_id;
    private String group_id;
    private String client_secret;
    private String redirect_uri;
    private String code;
    private String version = "5.101";
    private String language = "ru";
    private final URLHandler URLHandler = new URLHandler(this);
    private int authorizationType = 0;

    /**
     * Авторизация по секретному ключу приложения.
     * Этот подход необходимо использовать только для доступа к специальным secure-методам
     * @param client_id идентификатор Вашего приложения
     * @param client_secret секретный ключ Вашего приложения
     * @return объект класса VkAuth
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     */
    public VkAuth clientCredentialsFlow(String client_id, String client_secret) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        authorizationType = 1;
        return this;
    }

    /**
     * Авторизация для работы с API от имени пользователя
     * @param client_id идентификатор Вашего приложения
     * @param client_secret секретный ключ Вашего приложения
     * @param redirect_uri URL, который использовался при получении code на первом этапе авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     */
    public VkAuth userAuthorizationCodeFlow(String client_id, String client_secret, String redirect_uri, String code) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.redirect_uri = redirect_uri;
        this.code = code;
        authorizationType = 2;
        return this;
    }

    /**
     * Авторизация для работы с API от имени сообщества
     * @param group_id идентификатор группы, от имени которой будет осуществляться работа с API
     * @param client_id идентификатор Вашего приложения
     * @param client_secret секретный ключ Вашего приложения
     * @param redirect_uri URL, который использовался при получении code на первом этапе авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     */
    public VkAuth groupAuthorizationCodeFlow(String group_id, String client_id, String client_secret, String redirect_uri, String code) {
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.redirect_uri = redirect_uri;
        this.code = code;
        this.group_id = group_id;
        authorizationType = 2;
        return this;
    }

    /**
     * Устанавливает версию API, которую Вы намеренны использовать. Версия по умолчанию: 5.101
     * @param version версия API
     * @return объект класса VkAuth
     */
    public VkAuth setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Получении версии API. Версия по умолчанию: 5.101
     * @return версия API
     */
    @Override
    public String getVersion() {
        return version;
    }

    /**
     * Получении языка API (по умолчанию - 5.101)
     * @return язык API
     */
    @Override
    public String getLanguage() {
        return language;
    }
    public VkAuth setLanguage(String language) {
        this.language = language;
        return this;
    }
    /**
     * Авторизация с помощью специального ключа доступа
     * @param access_token ключ доступа
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     */
    public VkAuth setAccessToken(String access_token) {
        this.access_token = access_token;
        return this;
    }

    /**
     * Установка секретного ключа доступа
     * @param client_secret секретный ключ Вашего приложения
     * @return объект класса VkAuth
     */
    public VkAuth setClientSecret(String client_secret) {
        this.client_secret = client_secret;
        return this;
    }

    /**
     * Получение специального ключа доступа для дальнейшего использования
     * @return специальный ключ доступа
     */
    @Override
    public String getAccessToken() {
        return access_token;
    }

    /**
     * Авторизация
     * @throws IOException ошибка. Возможная причина: использованный код доступа(code)
     */
    public void authorize() throws IOException {
        if (authorizationType == 1) {
            access_token = new Request(this).getAccessToken(client_id, client_secret);
        } else if (authorizationType == 2) {
            access_token = new Request(this).getAccessToken(client_id, client_secret, redirect_uri, code, group_id);
        }
    }

    /**
     * Возвращает объект класса URLHandler, предназначенный для работы с URL
     * @return объект класса URLHandler, предназначенный для работы с URL
     */
    @Override
    public URLHandler getURLHandler() {
        return URLHandler;
    }

    /**
     * Возвращает ID группы, если вы использовали соответствующий меиод авторизации
     * @return ID группы
     */
    public String getGroupId() {
        return group_id;
    }

    /**
     * Возвращет идентификатор Вашего приложения
     * @return идентификатор Вашего приложения
     */
    public String getClientId() {
        return client_id;
    }

    /**
     * Возвращает секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @return секретный ключ Вашего приложения
     */
    @Override
    public String getClientSecret() {
        return client_secret;
    }

    /**
     * Возвращает адрес, на который будет переадресован пользователь после прохождения авторизации
     * @return адрес, на который будет переадресован пользователь после прохождения авторизации
     */
    public String getRedirectUri() {
        return redirect_uri;
    }

    /**
     * Возвращает код для получения ключа доступа
     * @return код для получения ключа доступа
     */
    public String getCode() {
        return code;
    }

}
