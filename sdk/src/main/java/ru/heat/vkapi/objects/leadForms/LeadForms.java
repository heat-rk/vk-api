package ru.heat.vkapi.objects.leadForms;

import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта LeadForms.
 * Подробнее на https://vk.com/dev/leadForms
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class LeadForms {

    private final VkApi vkApi;
    public LeadForms(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //create
    public JsonHandler create(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.create",
                args);
        return new JsonHandler(Request.get(url));
    }


    //delete
    public JsonHandler delete(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.delete",
                args);
        return new JsonHandler(Request.get(url));
    }


    //get
    public JsonHandler get(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.get",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLeads
    public JsonHandler getLeads(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.getLeads",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUploadURL
    public JsonHandler getUploadURL() {
        String url = vkApi.getFinalURL().get("leadForms.getUploadURL");
        return new JsonHandler(Request.get(url));
    }


    //list
    public JsonHandler list(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.list",
                args);
        return new JsonHandler(Request.get(url));
    }


    //update
    public JsonHandler update(String... args) {
        String url = vkApi.getFinalURL().get("leadForms.update",
                args);
        return new JsonHandler(Request.get(url));
    }
}
