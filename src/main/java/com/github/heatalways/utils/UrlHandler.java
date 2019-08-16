package com.github.heatalways.utils;

import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для получения URL для дальнешей работы с ним.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class UrlHandler {
    private final VkAuthInterface vkAuthInterface;

    /**
     * Создание объекта класса URLHandler с помощью объекта класса VkAuthInterface
     * @param vkAuthInterface интерфейс класса VkAuth
     */
    public UrlHandler(VkAuthInterface vkAuthInterface) {
        this.vkAuthInterface = vkAuthInterface;
    }
    /**
     * Получение URL, необходимого для дальнейшего вызова какого-либо метода API
     * @param method метод API
     * @param parameters параметры метода API
     * @return URL, необходимый для дальнейшего вызова какого-либо метода API
     */
    public String get(String method, String... parameters) {
        String url = "https://api.vk.com/method/!METHOD_NAME?!PARAMETERS&access_token=!ACCESS_TOKEN&client_secret=!SECRET&v=!VERSION&lang=!LANGUAGE";
        url = url.replace("!METHOD_NAME", method);
        url = url.replace("!PARAMETERS", ArrayToString.toStr(parameters));
        url = url.replace("!ACCESS_TOKEN", vkAuthInterface.getAccessToken());
        url = url.replace("!VERSION", vkAuthInterface.getVersion());
        url = url.replace("!LANGUAGE", vkAuthInterface.getLanguage());
        if (vkAuthInterface.getClientSecret() != null) url = url.replace("!SECRET", vkAuthInterface.getClientSecret());
        else  url = url.replace("&client_secret=!SECRET", "");
        url = url.replace(" ", "%20");
        return url;
    }

    /**
     * Получение URL, предназначенного для дальнейшего получения сервисного ключа доступа (access token) с помощью Client credentials flow
     * @param client_id идентификатор Вашего приложения
     * @param client_secret секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @return URL, предназначенный для дальнейшего получения сервисного ключа доступа (access token) с помощью Client credentials flow
     */
    public String getTokenUrl(String client_id, String client_secret) {
        String url = "https://oauth.vk.com/access_token?client_id=!ID&client_secret=!SECRET&v=!V&grant_type=client_credentials";
        url = url.replace("!ID", client_id);
        url = url.replace("!SECRET", client_secret);
        url = url.replace("!V", vkAuthInterface.getVersion());
        return url;
    }

    /**
     * Получение URL, предназначенного для дальнейшего получения ключа доступа (access token) с помощью Authorization Code Flow
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения. Вы можете найти его в интерфейсе настроек
     * @param redirectUri URL, который использовался при получении code на первом этапе авторизации. Должен быть аналогичен переданному при авторизации
     * @param code временный код, полученный после прохождения авторизации
     * @return URL, предназначенный для дальнейшего получения сервисного ключа доступа (access token) с помощью Authorization Code Flow
     */
    public String getTokenUrl(String clientId, String clientSecret, String redirectUri, String code) {
        String url = "https://oauth.vk.com/access_token?client_id=!ID&client_secret=!SECRET&redirect_uri=!REDIRECT&code=!CODE";
        url = url.replace("!ID", clientId);
        url = url.replace("!SECRET", clientSecret);
        url = url.replace("!REDIRECT", redirectUri);
        url = url.replace("!CODE", code);
        return url;
    }

    /**
     * Получение URL, предназначенного для дальнейшего получения ключа доступа (access token) с помощью прямой авторизации
     * @param clientId идентификатор Вашего приложения
     * @param clientSecret секретный ключ Вашего приложения
     * @param login логин
     * @param password пароль
     * @param scope права доступа, необходимые приложению
     * @param twoFaSupported передайте 1, чтобы включить поддержку двухфакторной аутентификации
     * @param code код подтверждения
     * @param args дополнительные параметры
     * @return URL, предназначенный для дальнейшего получения сервисного ключа доступа (access token) с помощью прямой авторизации
     */
    public String getTokenUrl(String clientId, String clientSecret, String login, String password, String scope, int twoFaSupported, String code, String... args) {
        String url = "https://oauth.vk.com/token?grant_type=password&client_id=!ID&client_secret=!SECRET&username=!LOGIN&password=!PASSWORD&v=!V&2fa_supported=!2FS&scope=!SCOPE&code=!CODE&" + ArrayToString.toStr(args);
        url = url.replace("!ID", clientId);
        url = url.replace("!SECRET", clientSecret);
        url = url.replace("!LOGIN", login);
        url = url.replace("!PASSWORD", password);
        url = url.replace("!PASSWORD", password);
        url = url.replace("!V", vkAuthInterface.getVersion());
        url = url.replace("!2FS", String.valueOf(twoFaSupported));
        url = url.replace("!SCOPE", scope);
        if (code != null) url = url.replace("!CODE", code);
        else url = url.replace("&code=!CODE", "");
        return url;
    }
}
