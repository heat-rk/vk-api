package ru.heat.vkapi.objects.search;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Search.
 * Подробнее на https://vk.com/dev/search
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class Search {

    private VkApi vkApi;
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
