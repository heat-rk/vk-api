package com.github.heatalways.utils.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.Scanner;

/**
 * Класс для осуществления HTTP DELETE запроса.
 * @author heat"kazyxanovr1@gmail.com"
 */
public class HttpDelete {
    public static String getResult(String url, HttpEntity reqEntity, String contentType) {
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            MyDelete httpDelete = new MyDelete(url);
            if (contentType != null) {
                httpDelete.addHeader("content-type", contentType);
            }
            httpDelete.setEntity(reqEntity);
            CloseableHttpResponse response = httpclient.execute(httpDelete);
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

class MyDelete extends HttpPost {
    public MyDelete(String url){
        super(url);
    }
    @Override
    public String getMethod() {
        return "DELETE";
    }
}
