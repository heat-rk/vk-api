package com.github.heatalways.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс для осуществления HTTP POST запроса.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class HttpPost {
    public static String getResult(String url, HttpEntity reqEntity) {
        return getResult(url, reqEntity, null);
    }
    public static String getResult(String url, HttpEntity reqEntity, String contentType) {
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            org.apache.http.client.methods.HttpPost httppost = new org.apache.http.client.methods.HttpPost(url);
            if (contentType != null) {
                httppost.addHeader("content-type", contentType);
            }
            httppost.setEntity(reqEntity);
            CloseableHttpResponse response = httpclient.execute(httppost);
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                Scanner scanner = new Scanner(resEntity.getContent());
                return scanner.nextLine();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
