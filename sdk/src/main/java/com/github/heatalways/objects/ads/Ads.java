package com.github.heatalways.objects.ads;

import com.github.heatalways.VkApi;
import com.github.heatalways.jsonHandler.JsonHandler;
import com.github.heatalways.utils.Request;
import ru.heat.vkapi.VkApi;
import ru.heat.vkapi.jsonHandler.JsonHandler;
import ru.heat.vkapi.utils.Request;

/**
 * Класс для работы с методами объекта Ads.
 * Подробнее на https://vk.com/dev/ads
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class Ads {
    private final VkApi vkApi;
    public Ads(VkApi vkApi) {
        this.vkApi = vkApi;
    }

    //addOfficeUsers
    public JsonHandler addOfficeUsers(String... args) {
        String url = vkApi.getFinalURL().get("ads.addOfficeUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //checkLink
    public JsonHandler checkLink(String... args) {
        String url = vkApi.getFinalURL().get("ads.checkLink",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createAds
    public JsonHandler createAds(String... args) {
        String url = vkApi.getFinalURL().get("ads.createAds",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createCampaigns
    public JsonHandler createCampaigns(String... args) {
        String url = vkApi.getFinalURL().get("ads.createCampaigns",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createClients
    public JsonHandler createClients(String... args) {
        String url = vkApi.getFinalURL().get("ads.createClients",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createLookalikeRequest
    public JsonHandler createLookalikeRequest(String... args) {
        String url = vkApi.getFinalURL().get("ads.createLookalikeRequest",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createTargetGroup
    public JsonHandler createTargetGroup(String... args) {
        String url = vkApi.getFinalURL().get("ads.createTargetGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //createTargetPixel
    public JsonHandler createTargetPixel(String... args) {
        String url = vkApi.getFinalURL().get("ads.createTargetPixel",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteAds
    public JsonHandler deleteAds(String... args) {
        String url = vkApi.getFinalURL().get("ads.deleteAds",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteCampaigns
    public JsonHandler deleteCampaigns(String... args) {
        String url = vkApi.getFinalURL().get("ads.deleteCampaigns",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteClients
    public JsonHandler deleteClients(String... args) {
        String url = vkApi.getFinalURL().get("ads.deleteClients",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteTargetGroup
    public JsonHandler deleteTargetGroup(String... args) {
        String url = vkApi.getFinalURL().get("ads.deleteTargetGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //deleteTargetPixel
    public JsonHandler deleteTargetPixel(String... args) {
        String url = vkApi.getFinalURL().get("ads.deleteTargetPixel",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAccounts
    public JsonHandler getAccounts() {
        String url = vkApi.getFinalURL().get("ads.getAccounts");
        return new JsonHandler(Request.get(url));
    }


    //getAds
    public JsonHandler getAds(String... args) {
        String url = vkApi.getFinalURL().get("ads.getAds",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAdsLayout
    public JsonHandler getAdsLayout(String... args) {
        String url = vkApi.getFinalURL().get("ads.getAdsLayout",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getAdsTargeting
    public JsonHandler getAdsTargeting(String... args) {
        String url = vkApi.getFinalURL().get("ads.getAdsTargeting",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getBudget
    public JsonHandler getBudget(String... args) {
        String url = vkApi.getFinalURL().get("ads.getBudget",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCampaigns
    public JsonHandler getCampaigns(String... args) {
        String url = vkApi.getFinalURL().get("ads.getCampaigns",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getCategories
    public JsonHandler getCategories(String... args) {
        String url = vkApi.getFinalURL().get("ads.getCategories",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getClients
    public JsonHandler getClients(String... args) {
        String url = vkApi.getFinalURL().get("ads.getClients",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getDemographics
    public JsonHandler getDemographics(String... args) {
        String url = vkApi.getFinalURL().get("ads.getDemographics",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getFloodStats
    public JsonHandler getFloodStats(String... args) {
        String url = vkApi.getFinalURL().get("ads.getFloodStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getLookalikeRequests
    public JsonHandler getLookalikeRequests(String... args) {
        String url = vkApi.getFinalURL().get("ads.getLookalikeRequests",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getOfficeUsers
    public JsonHandler getOfficeUsers(String... args) {
        String url = vkApi.getFinalURL().get("ads.getOfficeUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getPostsReach
    public JsonHandler getPostsReach(String... args) {
        String url = vkApi.getFinalURL().get("ads.getPostsReach",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getRejectionReason
    public JsonHandler getRejectionReason(String... args) {
        String url = vkApi.getFinalURL().get("ads.getRejectionReason",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getStatistics
    public JsonHandler getStatistics(String... args) {
        String url = vkApi.getFinalURL().get("ads.getStatistics",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getSuggestions
    public JsonHandler getSuggestions(String... args) {
        String url = vkApi.getFinalURL().get("ads.getSuggestions",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTargetGroups
    public JsonHandler getTargetGroups(String... args) {
        String url = vkApi.getFinalURL().get("ads.getTargetGroups",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTargetPixels
    public JsonHandler getTargetPixels(String... args) {
        String url = vkApi.getFinalURL().get("ads.getTargetPixels",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getTargetingStats
    public JsonHandler getTargetingStats(String... args) {
        String url = vkApi.getFinalURL().get("ads.getTargetingStats",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getUploadURL
    public JsonHandler getUploadURL(String... args) {
        String url = vkApi.getFinalURL().get("ads.getUploadURL",
                args);
        return new JsonHandler(Request.get(url));
    }


    //getVideoUploadURL
    public JsonHandler getVideoUploadURL(String... args) {
        String url = vkApi.getFinalURL().get("ads.getVideoUploadURL",
                args);
        return new JsonHandler(Request.get(url));
    }


    //importTargetContacts
    public JsonHandler importTargetContacts(String... args) {
        String url = vkApi.getFinalURL().get("ads.importTargetContacts",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeOfficeUsers
    public JsonHandler removeOfficeUsers(String... args) {
        String url = vkApi.getFinalURL().get("ads.removeOfficeUsers",
                args);
        return new JsonHandler(Request.get(url));
    }


    //removeTargetContacts
    public JsonHandler removeTargetContacts(String... args) {
        String url = vkApi.getFinalURL().get("ads.removeTargetContacts",
                args);
        return new JsonHandler(Request.get(url));
    }


    //saveLookalikeRequestResult
    public JsonHandler saveLookalikeRequestResult(String... args) {
        String url = vkApi.getFinalURL().get("ads.saveLookalikeRequestResult",
                args);
        return new JsonHandler(Request.get(url));
    }


    //shareTargetGroup
    public JsonHandler shareTargetGroup(String... args) {
        String url = vkApi.getFinalURL().get("ads.shareTargetGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateAds
    public JsonHandler updateAds(String... args) {
        String url = vkApi.getFinalURL().get("ads.updateAds",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateCampaigns
    public JsonHandler updateCampaigns(String... args) {
        String url = vkApi.getFinalURL().get("ads.updateCampaigns",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateClients
    public JsonHandler updateClients(String... args) {
        String url = vkApi.getFinalURL().get("ads.updateClients",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateTargetGroup
    public JsonHandler updateTargetGroup(String... args) {
        String url = vkApi.getFinalURL().get("ads.updateTargetGroup",
                args);
        return new JsonHandler(Request.get(url));
    }


    //updateTargetPixel
    public JsonHandler updateTargetPixel(String... args) {
        String url = vkApi.getFinalURL().get("ads.updateTargetPixel",
                args);
        return new JsonHandler(Request.get(url));
    }
}
