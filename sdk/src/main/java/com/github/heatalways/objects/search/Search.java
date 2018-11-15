package com.github.heatalways.objects.search;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.VkApi;
import com.github.heatalways.utils.Request;

/**
 * Класс для работы с методами объекта Search.
 * Подробнее на https://vk.com/dev/search
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Search {

    private final VkApi vkApi;
    public Search(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //getHints
    public JsonHandler getHints(String... args) {
        String url = vkApi.getFinalURL().get("search.getHints",
                args);
        return new JsonHandler(Request.get(url));
    }
}
