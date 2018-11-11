package ru.heat.vkapi.utils;

import ru.heat.vkapi.VkApi;

/**
 * Класс для получения URL для дальнешей работы с ним.
 * @author heat<kazyxanovr1@gmail.com>
 */
public class FinalURL {

    private static VkApi vkApi;
    public FinalURL(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    public String get(String method, String... parameters) {
        String url = vkApi.getBaseUrl();
        url = url.replace("!METHOD_NAME", method);
        url = url.replace("!PARAMETERS", ArrayToString.toStr(parameters));
        url = url.replace(" ", "%20");
        return url;
    }
    public static String getTokenUrl(String client_id, String client_secret) {
        String url = "https://oauth.vk.com/access_token?client_id=!ID&client_secret=!SECRET&v=!V&grant_type=client_credentials";
        url = url.replace("!ID", client_id);
        url = url.replace("!SECRET", client_secret);
        url = url.replace("!V", vkApi.getVersion());
        return url;
    }
    public static String getTokenUrl(String client_id, String client_secret, String redirect_uri, String code) {
        String url = "https://oauth.vk.com/access_token?client_id=!ID&client_secret=!SECRET&redirect_uri=!REDIRECT&code=!CODE";
        url = url.replace("!ID", client_id);
        url = url.replace("!SECRET", client_secret);
        url = url.replace("!REDIRECT", redirect_uri);
        url = url.replace("!CODE", code);
        return url;
    }
}
