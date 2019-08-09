package com.github.heatalways.vkAuth;

import com.github.heatalways.utils.URLHandler;

public interface VkAuthInterface {
    URLHandler getURLHandler();
    String getVersion();
    String getClientSecret();
    String getAccessToken();
    String getLanguage();
}
