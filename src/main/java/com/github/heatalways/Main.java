package com.github.heatalways;


import com.github.heatalways.vkAuth.VkAuth;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VkApi vkApi = new VkApi(new VkAuth().setAccessToken("563b41b288f60cb0b921aaec532aee78ff620375d1063a62fce239b06356df3aa45b9bc4c7ad54018ff44"));

    }
}
