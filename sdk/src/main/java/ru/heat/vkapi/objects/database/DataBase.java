package ru.heat.vkapi.objects.database;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта DataBase.
 * Подробнее на https://vk.com/dev/database
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class DataBase {

    private VkApi vkApi;
    public DataBase(VkApi vkApi) {
        this.vkApi = vkApi;
    }
    
    //getChairs
    public JsonHandler getChairs(String... args) {
        String url = vkApi.getFinalURL().get("database.getChairs",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCities
    public JsonHandler getCities(String... args) {
        String url = vkApi.getFinalURL().get("database.getCities",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCitiesById
    public JsonHandler getCitiesById(String... args) {
        String url = vkApi.getFinalURL().get("database.getCitiesById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCountries
    public JsonHandler getCountries(String... args) {
        String url = vkApi.getFinalURL().get("database.getCountries",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCountriesById
    public JsonHandler getCountriesById(String... args) {
        String url = vkApi.getFinalURL().get("database.getCountriesById",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getFaculties
    public JsonHandler getFaculties(String... args) {
        String url = vkApi.getFinalURL().get("database.getFaculties",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRegions
    public JsonHandler getRegions(String... args) {
        String url = vkApi.getFinalURL().get("database.getRegions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSchoolClasses
    public JsonHandler getSchoolClasses(String... args) {
        String url = vkApi.getFinalURL().get("database.getSchoolClasses",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSchools
    public JsonHandler getSchools(String... args) {
        String url = vkApi.getFinalURL().get("database.getSchools",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUniversities
    public JsonHandler getUniversities(String... args) {
        String url = vkApi.getFinalURL().get("database.getUniversities",
                args);
        return new JsonHandler(Request.get(url));
    }
}
