package com.github.heatalways.objects.audio;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

public class Audio extends MethodObject {
    public final static String getUploadServer = "getUploadServer";
    public final static String save = "save";

    public Audio(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "audio";
    }
}
