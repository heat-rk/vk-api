package ru.heat.vkapi.jsonHandler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;

/**
 * Класс для работы с JSON-данными
 * @author heat<kazyxanovr1@gmail.com>
 *
 */
public class JsonHandler {
    private Object object;

    /**
     * Создает объект класса JsonHandler, принимая в качестве параметра объект класса Object
     * @param object объект класса Object
     */
    public JsonHandler(Object object) {
        this.object = object;
    }

    /**
     * Создает объект класса JsonHandler, принимая в качестве параметра строку
     * @param jsonStr строка, имеющая данные в формате JSON
     */
    public JsonHandler(String jsonStr) {
        try {
            JSONParser parser = new JSONParser();
            object = parser.parse(jsonStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Получает элемент объекта JsonHandler по ключу типа String
     * @param key ключ: {"key":"value"}
     * @return объект класса JsonHandler
     */
    public JsonHandler get(String key) {
        return new JsonHandler(((JSONObject) object).get(key));
    }
    /**
     * Получает элемент объекта JsonHandler по ключу типа Integer(для списка)
     * @param key ключ: {"key":"value"}
     * @return объект класса JsonHandler
     */
    public JsonHandler get(int key) {
        return new JsonHandler(((JSONArray) object).get(key));
    }

    /**
     * Получает объект класса Object
     * @return объект класса Object
     */
    public Object getObject() {
        return object;
    }

    /**
     * Получает объект класса JSONObject
     * @link com.googlecode.json-simple#JSONObject
     * @return объект класса JSONObject
     */
    public JSONObject getJSONObject() {
        return (JSONObject) object;
    }
    /**
     * Получает объект класса JSONArray
     * @link com.googlecode.json-simple#JSONArray
     * @return объект класса JSONArray
     */
    public JSONArray getJSONArray() {
        return (JSONArray) object;
    }

    /**
     * Получает массив элементов класса JsonHandler(для списка)
     * @return массив элементов класса JsonHandler
     */
    public JsonHandler[] toArray() {
        JsonHandler[] array = new JsonHandler[((JSONArray) object).size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = new JsonHandler(((JSONArray) object).get(i));
        }
        return array;
    }
    @Override
    public String toString() {
        try {
            return object.toString();
        } catch (NullPointerException e) {
            return null;
        }
    }
}
