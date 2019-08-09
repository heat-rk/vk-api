package com.github.heatalways.upload;

import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import com.github.heatalways.utils.http.HttpPost;

import java.io.*;

/**
 * Класс для создания POST-запросов
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class BodyOfRequest {
    public static String photoToWall(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("photo", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String photoToAlbum(String url, File[] files) {
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
        for (int i = 0; i < files.length; i++) {
            FileBody bin = new FileBody(files[i]);
            multipartEntityBuilder.addPart("file" + (i + 1), bin);
        }
        HttpEntity reqEntity = multipartEntityBuilder.build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String mainPhoto(String url, File file) {
        return mainPhoto(url, file, "");
    }
    public static String mainPhoto(String url, File file, String square_crop) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("photo", bin)
                .addPart("_square_crop", new StringBody(square_crop, ContentType.TEXT_PLAIN))
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String photoToMessage(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("photo", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String chatPhoto(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String productPhoto(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String getMarketAlbumPhoto(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String audio(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
    public static String video(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("video_file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }


    //upload
    public static String document(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }


    //upload
    public static String coverGroupPhoto(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("photo", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }


    //upload
    public static String audioMessage(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }


    //upload
    public static String storiesPhoto(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }


    //upload
    public static String storiesVideo(String url, File file) {
        FileBody bin = new FileBody(file);
        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addPart("video_file", bin)
                .build();
        return HttpPost.getResult(url, reqEntity);
    }
}
