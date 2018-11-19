package com.github.heatalways.objects.streaming;

import com.github.heatalways.VkApi;
import com.github.heatalways.objects.MethodObject;

/**
 * Класс для работы с методами объекта Streaming.
 * Подробнее на https://vk.com/dev/streaming
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Streaming extends MethodObject {
    public final static String getServerUrl = "getServerUrl";
    public final static String getSettings = "getSettings";
    public final static String getStats = "getStats";
    public final static String getStem = "getStem";
    public final static String setSettings = "setSettings";

    public Streaming(VkApi vkApi) {
        super(vkApi);
        object = "streaming";
    }
}
