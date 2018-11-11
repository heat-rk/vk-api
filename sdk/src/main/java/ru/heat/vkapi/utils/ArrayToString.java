package ru.heat.vkapi.utils;

/**
 * Класс для перевода массива объектов в строку: Array[]{"1","2"} => 1&2.
 * @author heat<kazyxanovr1@gmail.com>
 */
public class ArrayToString {
    /**
     * Перевод массива объектов в строку
     * @param values массив
     * @return строка
     */
    public static String toStr(Object[] values) {
        try {
            String result = "";
            result += values[0];
            for (int i = 1; i < values.length; i++) {
                result += "&" + values[i];
            }
            return result;
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
    }
}
