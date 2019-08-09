package com.github.heatalways.objects.leadForms;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта LeadForms.
 * Подробнее на https://vk.com/dev/leadForms
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class LeadForms extends MethodObject {
    public final static String create = "create";
    public final static String delete = "delete";
    public final static String get = "get";
    public final static String getLeads = "getLeads";
    public final static String getUploadURL = "getUploadURL";
    public final static String list = "list";
    public final static String update = "update";

    public LeadForms(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "leadForms";
    }
}
