package com.github.heatalways.objects.ads;

import com.github.heatalways.objects.MethodObject;
import com.github.heatalways.vkAuth.VkAuthInterface;

/**
 * Класс для работы с методами объекта Ads.
 * Подробнее на https://vk.com/dev/ads
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Ads extends MethodObject {
    public final static String addOfficeUsers = "addOfficeUsers";
    public final static String checkLink = "checkLink";
    public final static String createAds = "createAds";
    public final static String createCampaigns = "createCampaigns";
    public final static String createClients = "createClients";
    public final static String createLookalikeRequest = "createLookalikeRequest";
    public final static String createTargetGroup = "createTargetGroup";
    public final static String createTargetPixel = "createTargetPixel";
    public final static String deleteAds = "deleteAds";
    public final static String deleteCampaigns = "deleteCampaigns";
    public final static String deleteClients = "deleteClients";
    public final static String deleteTargetGroup = "deleteTargetGroup";
    public final static String deleteTargetPixel = "deleteTargetPixel";
    public final static String getAccounts = "getAccounts";
    public final static String getAds = "getAds";
    public final static String getAdsLayout = "getAdsLayout";
    public final static String getAdsTargeting = "getAdsTargeting";
    public final static String getBudget = "getBudget";
    public final static String getCampaigns = "getCampaigns";
    public final static String getCategories = "getCategories";
    public final static String getClients = "getClients";
    public final static String getDemographics = "getDemographics";
    public final static String getFloodStats = "getFloodStats";
    public final static String getLookalikeRequests = "getLookalikeRequests";
    public final static String getOfficeUsers = "getOfficeUsers";
    public final static String getPostsReach = "getPostsReach";
    public final static String getRejectionReason = "getRejectionReason";
    public final static String getStatistics = "getStatistics";
    public final static String getSuggestions = "getSuggestions";
    public final static String getTargetGroups = "getTargetGroups";
    public final static String getTargetPixels = "getTargetPixels";
    public final static String getTargetingStats = "getTargetingStats";
    public final static String getUploadURL = "getUploadURL";
    public final static String getVideoUploadURL = "getVideoUploadURL";
    public final static String importTargetContacts = "importTargetContacts";
    public final static String removeOfficeUsers = "removeOfficeUsers";
    public final static String removeTargetContacts = "removeTargetContacts";
    public final static String saveLookalikeRequestResult = "saveLookalikeRequestResult";
    public final static String shareTargetGroup = "shareTargetGroup";
    public final static String updateAds = "updateAds";
    public final static String updateCampaigns = "updateCampaigns";
    public final static String updateClients = "updateClients";
    public final static String updateTargetGroup = "updateTargetGroup";
    public final static String updateTargetPixel = "updateTargetPixel";


    public Ads(VkAuthInterface vkAuthInterface) {
        super(vkAuthInterface);
        object = "ads";
    }
}
