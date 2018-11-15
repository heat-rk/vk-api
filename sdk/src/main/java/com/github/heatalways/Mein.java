package com.github.heatalways;

import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.longPollAPI.UserLongPollApi;
import com.github.heatalways.longPollAPI.UserMessageHandler;
import com.github.heatalways.streamingAPI.StreamMessageHandler;
import com.github.heatalways.streamingAPI.StreamingApi;
import com.github.heatalways.vkAuth.VkAuth;

import java.io.IOException;

public class Mein {
    public static void main(String[] args) throws IOException {
        VkApi vkApi = new VkApi(new VkAuth().setAccessToken("847da04021513d4bbf6b79a2f12af70e7b40ce64e3c6722f90831dc73da3d45a9653fe768e95b4a2813db"));
        vkApi = new VkApi(new VkAuth().clientCredentialsFlow(
                "6719817",
                "FgEvWQjbSz8AE9RHVCUd"
        ));
        StreamingApi streamingApi = new StreamingApi(vkApi);
        streamingApi.stream.setStreamMessageHandler(new StreamMessageHandler(){
            @Override
            public void onMessage(JsonHandler message) {
                System.out.println(message);
            }
        }).start();
    }
}
