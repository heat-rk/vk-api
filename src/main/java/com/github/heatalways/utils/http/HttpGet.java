package com.github.heatalways.utils.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Класс для осуществления HTTP GET запроса.
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class HttpGet {
    public static String get(String url) throws IOException {
        URLConnection urlConnection = new URL(url).openConnection();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
        return scanner.nextLine();
    }
}
