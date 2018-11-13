package ru.heat.vkapi;

import ru.heat.vkapi.vkAuth.VkAuth;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VkApi vkApi = new VkApi(new VkAuth().setAccessToken("847da04021513d4bbf6b79a2f12af70e7b40ce64e3c6722f90831dc73da3d45a9653fe768e95b4a2813db"));
        vkApi.upload.photoToMessage.upload(
                PEER_ID,
                FILE
        ).save().post("message" + MESSAGE);
    }
}
