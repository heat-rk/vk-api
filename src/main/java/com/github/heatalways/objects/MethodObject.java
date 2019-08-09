package com.github.heatalways.objects;

import com.github.heatalways.vkAuth.VkAuthInterface;
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
    private final VkAuthInterface vkAuthInterface;
    protected String object;
    protected MethodObject(VkAuthInterface vkAuthInterface) {
        this.vkAuthInterface = vkAuthInterface;
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
     * @return ответ от сервера в формате JSON
     */
    public JsonHandler execute() {
        String url = vkAuthInterface.getURLHandler().get(object + "." + method,
                params);
        return new JsonHandler(Request.get(url));
    }
}
