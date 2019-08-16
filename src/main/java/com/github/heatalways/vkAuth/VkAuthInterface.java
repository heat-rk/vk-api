package com.github.heatalways.vkAuth;

import com.github.heatalways.utils.URLHandler;

public interface VkAuthInterface {
    URLHandler getURLHandler();
    String getVersion();
    String getClientSecret();
    String getAccessToken();
    VkAuth setAccessToken(String token);
    String getGroupId();
    String getUserId();
    void setUserId(String userId);
    String getLanguage();
}
