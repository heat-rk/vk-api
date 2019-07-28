package com.github.heatalways;

import com.github.heatalways.objects.account.Account;
import com.github.heatalways.objects.appWidgets.AppWidgets;
import com.github.heatalways.objects.database.DataBase;
import com.github.heatalways.objects.friends.Friends;
import com.github.heatalways.objects.leadForms.LeadForms;
import com.github.heatalways.objects.messages.Messages;
import com.github.heatalways.objects.newsfeed.Newsfeed;
import com.github.heatalways.objects.notifications.Notifications;
import com.github.heatalways.objects.prettyCards.PrettyCards;
import com.github.heatalways.objects.search.Search;
import com.github.heatalways.objects.secure.Secure;
import com.github.heatalways.objects.status.Status;
import com.github.heatalways.objects.storage.Storage;
import com.github.heatalways.objects.stories.Stories;
import com.github.heatalways.objects.streaming.Streaming;
import com.github.heatalways.objects.widgets.Widgets;
import com.github.heatalways.objects.apps.Apps;
import com.github.heatalways.objects.board.Board;
import com.github.heatalways.objects.docs.Docs;
import com.github.heatalways.objects.fave.Fave;
import com.github.heatalways.objects.gifts.Gifts;
import com.github.heatalways.objects.groups.Groups;
import com.github.heatalways.objects.leads.Leads;
import com.github.heatalways.objects.likes.Likes;
import com.github.heatalways.objects.market.Market;
import com.github.heatalways.objects.notes.Notes;
import com.github.heatalways.objects.orders.Orders;
import com.github.heatalways.objects.pages.Pages;
import com.github.heatalways.objects.photos.Photos;
import com.github.heatalways.objects.polls.Polls;
import com.github.heatalways.objects.stats.Stats;
import com.github.heatalways.objects.users.Users;
import com.github.heatalways.objects.utils.Utils;
import com.github.heatalways.objects.video.Video;
import com.github.heatalways.objects.wall.Wall;
import com.github.heatalways.upload.Upload;
import com.github.heatalways.utils.FinalURL;
import com.github.heatalways.vkAuth.VkAuth;

import java.io.IOException;

/**
 * Основной класс для работы с VkApi
 * @author heat"kazyxanovr1@gmail.com"
 */
public class VkApi {
    private String secret;
    private String access_token;
    private final String lang = "ru";
    public static final String v = "5.101";

    private final FinalURL finalURL;

    public final Users users = new Users(this);
    public final Account account = new Account(this);
    public final AppWidgets appWidgets = new AppWidgets(this);
    public final Apps apps = new Apps(this);
    public final Board board = new Board(this);
    public final DataBase dataBase = new DataBase(this);
    public final Docs docs = new Docs(this);
    public final Fave fave = new Fave(this);
    public final Friends friends = new Friends(this);
    public final Gifts gifts = new Gifts(this);
    public final Groups groups = new Groups(this);
    public final Leads leads = new Leads(this);
    public final Likes likes = new Likes(this);
    public final Market market = new Market(this);
    public final Messages messages = new Messages(this);
    public final Newsfeed newsfeed = new Newsfeed(this);
    public final Notes notes = new Notes(this);
    public final Notifications notifications = new Notifications(this);
    public final Pages pages = new Pages(this);
    public final Photos photos = new Photos(this);
    public final Polls polls = new Polls(this);
    public final Search search = new Search(this);
    public final Secure secure = new Secure(this);
    public final Stats stats = new Stats(this);
    public final Status status = new Status(this);
    public final Storage storage = new Storage(this);
    public final Utils utils = new Utils(this);
    public final Video video = new Video(this);
    public final LeadForms leadForms = new LeadForms(this);
    public final PrettyCards prettyCards = new PrettyCards(this);
    public final Stories stories = new Stories(this);
    public final Streaming streaming = new Streaming(this);
    public final Orders orders = new Orders(this);
    public final Wall wall = new Wall(this);
    public final Widgets widgets = new Widgets(this);
    public final Upload upload = new Upload(this);

    /**
     * Создание объекта класса VkApi, используя объект класса авторизации
     * @param auth объект класса VkAuth
     * @throws IOException ошибка. Возможная причина: использованный код доступа(code)
     * @see VkAuth
     */
    public VkApi(VkAuth auth) throws IOException {
        try {
            finalURL = new FinalURL(this);
            auth.authorize();
            this.access_token = auth.getAccessToken();
            this.secret = auth.getClientSecret();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public String getBaseUrl() {
        String url = "https://api.vk.com/method/!METHOD_NAME?!PARAMETERS&access_token=" + access_token +
                "&client_secret=!SECRET&v=" + v +
                "&lang=" + lang;
        if (secret != null) {
            url = url.replace("!SECRET", secret);
        } else {
            url = url.replace("&client_secret=!SECRET", "");
        }
        return url;
    }
    public FinalURL getFinalURL() {
        return finalURL;
    }
    public String getLanguage() {
        return lang;
    }
}
