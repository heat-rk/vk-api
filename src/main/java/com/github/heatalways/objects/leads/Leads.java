package com.github.heatalways.objects.leads;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Leads.
 * Подробнее на https://vk.com/dev/leads
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Leads extends MethodObject {
    public final static String checkUser = "checkUser";
    public final static String complete = "complete";
    public final static String getStats = "getStats";
    public final static String getUsers = "getUsers";
    public final static String metricHit = "metricHit";
    public final static String start = "start";

    public Leads(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "leads";
    }
}
