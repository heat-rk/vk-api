package ru.heat.vkapi.utils;

/**
 * Класс для перевода массива объектов в строку.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class ArrayToString {
    /**
     * Перевод массива объектов в строку
     * @param values массив
     * @return строка
     */
    public static String toStr(Object[] values) {
        try {
            StringBuilder str = new StringBuilder();
            str.append(values[0]);
            for (int i = 1; i < values.length; i++) {
                str.append("&" + values[i]);
            }
            return str.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
    }
}
