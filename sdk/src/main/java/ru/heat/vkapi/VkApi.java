package ru.heat.vkapi;

import ru.heat.vkapi.vkAuth.VkAuth;
import ru.heat.vkapi.upload.Upload;
import ru.heat.vkapi.utils.FinalURL;
import ru.heat.vkapi.objects.account.Account;
import ru.heat.vkapi.objects.appWidgets.AppWidgets;
import ru.heat.vkapi.objects.apps.Apps;
import ru.heat.vkapi.objects.board.Board;
import ru.heat.vkapi.objects.database.DataBase;
import ru.heat.vkapi.objects.docs.Docs;
import ru.heat.vkapi.objects.fave.Fave;
import ru.heat.vkapi.objects.friends.Friends;
import ru.heat.vkapi.objects.gifts.Gifts;
import ru.heat.vkapi.objects.groups.Groups;
import ru.heat.vkapi.objects.leadForms.LeadForms;
import ru.heat.vkapi.objects.leads.Leads;
import ru.heat.vkapi.objects.likes.Likes;
import ru.heat.vkapi.objects.market.Market;
import ru.heat.vkapi.objects.messages.Messages;
import ru.heat.vkapi.objects.newsfeed.Newsfeed;
import ru.heat.vkapi.objects.notes.Notes;
import ru.heat.vkapi.objects.notifications.Notifications;
import ru.heat.vkapi.objects.orders.Orders;
import ru.heat.vkapi.objects.pages.Pages;
import ru.heat.vkapi.objects.photos.Photos;
import ru.heat.vkapi.objects.polls.Polls;
import ru.heat.vkapi.objects.prettyCards.PrettyCards;
import ru.heat.vkapi.objects.search.Search;
import ru.heat.vkapi.objects.secure.Secure;
import ru.heat.vkapi.objects.stats.Stats;
import ru.heat.vkapi.objects.status.Status;
import ru.heat.vkapi.objects.storage.Storage;
import ru.heat.vkapi.objects.stories.Stories;
import ru.heat.vkapi.objects.streaming.Streaming;
import ru.heat.vkapi.objects.users.Users;
import ru.heat.vkapi.objects.utils.Utils;
import ru.heat.vkapi.objects.video.Video;
import ru.heat.vkapi.objects.wall.Wall;
import ru.heat.vkapi.objects.widgets.Widgets;

import java.io.IOException;

/**
 * Основной класс для работы с VkApi
 * @author heat"kazyxanovr1@gmail.com"
 *
 */
public class VkApi {
    private String secret;
    private String access_token;
    private String v = "5.87";
    private String lang = "ru";

    private final FinalURL finalURL = new FinalURL(this);

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
            auth.authorize();
            this.access_token = auth.getAccessToken();
            this.secret = auth.getClientSecret();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    /**
     * Устанавливает версию API
     * @param v версия
     * @return объект класса VkApi
     */
    public VkApi setVersion(String v) {
        this.v = v;
        return this;
    }

    /**
     * Устанавливает язык, на котором будут возвращаться различные данные
     * @param lang язык(ru,en)
     * @return объект класса VkApi
     */
    public VkApi setLanguage(String lang) {
        this.lang = lang;
        return this;
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

    public String getVersion() {
        return v;
    }
    public String getLanguage() {
        return lang;
    }
}
