package com.github.heatalways.objects.database;

import com.github.heatalways.vkAuth.VkAuthInterface;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта DataBase.
 * Подробнее на https://vk.com/dev/database
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class DataBase extends MethodObject {
    public final static String getChairs = "getChairs";
    public final static String getCities = "getCities";
    public final static String getCitiesById = "getCitiesById";
    public final static String getCountries = "getCountries";
    public final static String getCountriesById = "getCountriesById";
    public final static String getFaculties = "getFaculties";
    public final static String getRegions = "getRegions";
    public final static String getSchoolClasses = "getSchoolClasses";
    public final static String getSchools = "getSchools";
    public final static String getUniversities = "getUniversities";

    public DataBase(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "database";
    }
}
