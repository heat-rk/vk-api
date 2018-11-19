package com.github.heatalways.objects;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;

/**
 * Родительский класс для реализации методов.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class MethodObject {
    private String method;
    private String[] params;
    protected VkApi vkApi;
    protected String object;
    public MethodObject(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    /**
     * Инициализация названия метода
     * @param method строковое название метода. Следует указать так: CLASS.METHOD(Friends.get)
     * @return объект класса MethodObject
     */
    public MethodObject method(String method) {
        this.method = method;
        return this;
    }

    /**
     * Инициализация параметров метода
     * @param params параметры вида: "param1=value1", "param2=value2"
     * @return объект класса MethodObject
     */
    public MethodObject params(String... params) {
        this.params = params;
        return this;
    }

    /**
     * Получение результата
     * @return объект класса JsonHandler
     */
    public JsonHandler execute() {
        String url = vkApi.getFinalURL().get(object + "." + method,
                params);
        return new JsonHandler(Request.get(url));
    }
}
