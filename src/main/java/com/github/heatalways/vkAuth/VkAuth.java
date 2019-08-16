package com.github.heatalways.vkAuth;

import com.github.heatalways.utils.UrlHandler;
import com.github.heatalways.utils.Request;

import java.io.IOException;

/**
 * Класс авторизации для работы с VkApi.
 * Подробнее на https://vk.com/dev/access_token
 * @author heat"kazyxanovr1@gmail.com"
 */
public class VkAuth implements VkAuthInterface {
    private String userId;
    private String accessToken;
    private String clientId;
    private String groupId;
    private String clientSecret;
    private String redirectUri;
    private String code;

    //direct auth
    private String login;
    private String password;
    private String scope;
    private String[] args;
    private int twoFaSupported;

    private String version = "5.101";
    private String language = "ru";
    private final UrlHandler URLHandler = new UrlHandler(this);
    private int authorizationType = 0;

    /**
     * Авторизация по секретному ключу приложения.
     * Этот подход необходимо использовать только для доступа к специальным secure-методам
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @return объект класса VkAuth
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     * @see VkAuth#directAuthorization(String, String, String, String, String, int, String, String...)
     */
    public VkAuth clientCredentialsFlow(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        authorizationType = 1;
        return this;
    }

    /**
     * Авторизация для работы с API от имени пользователя
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @param redirectUri URL, который использовался при получении code на первом этапе авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     * @see VkAuth#directAuthorization(String, String, String, String, String, int, String, String...)
     */
    public VkAuth userAuthorizationCodeFlow(String clientId, String clientSecret, String redirectUri, String code) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.code = code;
        authorizationType = 2;
        return this;
    }

    /**
     * Авторизация для работы с API от имени сообщества
     * @param groupId идентификатор группы, от имени которой будет осуществляться работа с API
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @param redirectUri URL, который использовался при получении code на первом этапе авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     * @see VkAuth#directAuthorization(String, String, String, String, String, int, String, String...)
     */
    public VkAuth groupAuthorizationCodeFlow(String groupId, String clientId, String clientSecret, String redirectUri, String code) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.code = code;
        this.groupId = groupId;
        authorizationType = 2;
        return this;
    }
    /**
     * Прямая авторизация (ВОЗМОЖНА НЕПРАВИЛЬНАЯ РАБОТА!)
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @param login логин
     * @param password пароль
     * @param scope права доступа, необходимые приложению
     * @param twoFaSupported передайте 1, чтобы включить поддержку двухфакторной аутентификации
     * @param args дополнительные параметры
     * @param code код подтверждения
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#setAccessToken(String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     */
    public VkAuth directAuthorization(String clientId, String clientSecret, String login, String password, String scope, int twoFaSupported, String code, String... args) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.login = login;
        this.password = password;
        this.scope = scope;
        this.twoFaSupported = twoFaSupported;
        this.code = code;
        this.args = args;
        authorizationType = 3;
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
     * @param accessToken ключ доступа
     * @return объект класса VkAuth
     * @see VkAuth#clientCredentialsFlow(String, String)
     * @see VkAuth#userAuthorizationCodeFlow(String, String, String, String)
     * @see VkAuth#groupAuthorizationCodeFlow(String, String, String, String, String)
     */
    @Override
    public VkAuth setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Возвращает ID пользователя
     * @return ID пользователя
     */
    @Override
    public String getUserId() {
        return userId;
    }

    /**
     * Устанавливет ID пользователя
     * @param userId ID пользователя
     */
    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Установка секретного ключа доступа
     * @param client_secret секретный ключ Вашего приложения
     * @return объект класса VkAuth
     */
    public VkAuth setClientSecret(String client_secret) {
        this.clientSecret = client_secret;
        return this;
    }

    /**
     * Получение специального ключа доступа для дальнейшего использования
     * @return специальный ключ доступа
     */
    @Override
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Авторизация
     * @throws IOException ошибка. Возможная причина: использованный код доступа(code)
     */
    public void authorize() throws IOException {
        if (authorizationType == 1) {
            new Request(this).getAccessToken(clientId, clientSecret);
        } else if (authorizationType == 2) {
           new Request(this).getAccessToken(clientId, clientSecret, redirectUri, code, groupId);
        } else if (authorizationType == 3) {
            new Request(this).getAccessToken(clientId, clientSecret, login, password, scope, twoFaSupported, code, args);
        }
    }

    /**
     * Возвращает объект класса URLHandler, предназначенный для работы с URL
     * @return объект класса URLHandler, предназначенный для работы с URL
     */
    @Override
    public UrlHandler getURLHandler() {
        return URLHandler;
    }

    /**
     * Возвращает ID группы, если вы использовали соответствующий меиод авторизации
     * @return ID группы
     */
    @Override
    public String getGroupId() {
        return groupId;
    }

    /**
     * Возвращет идентификатор Вашего приложения
     * @return идентификатор Вашего приложения
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Возвращает секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @return секретный ключ Вашего приложения
     */
    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Возвращает адрес, на который будет переадресован пользователь после прохождения авторизации
     * @return адрес, на который будет переадресован пользователь после прохождения авторизации
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * Возвращает код для получения ключа доступа
     * @return код для получения ключа доступа
     */
    public String getCode() {
        return code;
    }

}
