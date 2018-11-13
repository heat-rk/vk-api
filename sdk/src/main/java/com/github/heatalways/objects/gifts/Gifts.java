package com.github.heatalways.objects.gifts;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Gifts.
 * Подробнее на https://vk.com/dev/gifts
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Gifts {

    private final VkApi vkApi;
    public Gifts(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    
    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("gifts.get",
                args);
        return new JsonHandler(Request.get(url));
    }
}
