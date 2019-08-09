package com.github.heatalways;

import com.github.heatalways.objects.account.Account;
import com.github.heatalways.objects.appWidgets.AppWidgets;
import com.github.heatalways.objects.audio.Audio;
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
import com.github.heatalways.vkAuth.VkAuth;

import java.io.IOException;

/**
 * Основной класс для работы с VkApi
 * @author heat"kazyxanovr1@gmail.com"
 */
public class VkApi {
    public final Users users;
    public final Account account;
    public final AppWidgets appWidgets;
    public final Apps apps;
    public final Board board;
    public final DataBase dataBase;
    public final Docs docs;
    public final Fave fave;
    public final Friends friends;
    public final Gifts gifts;
    public final Groups groups;
    public final Leads leads;
    public final Likes likes;
    public final Market market;
    public final Messages messages;
    public final Newsfeed newsfeed;
    public final Notes notes;
    public final Notifications notifications;
    public final Pages pages;
    public final Photos photos;
    public final Polls polls;
    public final Search search;
    public final Secure secure;
    public final Stats stats;
    public final Status status;
    public final Storage storage;
    public final Utils utils;
    public final Audio audio;
    public final Video video;
    public final LeadForms leadForms;
    public final PrettyCards prettyCards;
    public final Stories stories;
    public final Streaming streaming;
    public final Orders orders;
    public final Wall wall;
    public final Widgets widgets;
    public final Upload upload;

    /**
     * Создание объекта класса VkApi, используя объект класса авторизации
     * @param auth объект класса VkAuth
     * @throws IOException ошибка. Возможная причина: использованный код доступа(code)
     * @see VkAuth
     */
    public VkApi(VkAuth auth) throws IOException {
        try {
            users = new Users(auth);
            account = new Account(auth);
            appWidgets = new AppWidgets(auth);
            apps = new Apps(auth);
            board = new Board(auth);
            dataBase = new DataBase(auth);
            docs = new Docs(auth);
            fave = new Fave(auth);
            friends = new Friends(auth);
            gifts = new Gifts(auth);
            groups = new Groups(auth);
            leads = new Leads(auth);
            likes = new Likes(auth);
            market = new Market(auth);
            messages = new Messages(auth);
            newsfeed = new Newsfeed(auth);
            notes = new Notes(auth);
            notifications = new Notifications(auth);
            pages = new Pages(auth);
            photos = new Photos(auth);
            polls = new Polls(auth);
            search = new Search(auth);
            secure = new Secure(auth);
            stats = new Stats(auth);
            status = new Status(auth);
            storage = new Storage(auth);
            utils = new Utils(auth);
            audio = new Audio(auth);
            video = new Video(auth);
            leadForms = new LeadForms(auth);
            prettyCards = new PrettyCards(auth);
            stories = new Stories(auth);
            streaming = new Streaming(auth);
            orders = new Orders(auth);
            wall = new Wall(auth);
            widgets = new Widgets(auth);
            upload = new Upload(this);

            auth.authorize();
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
}
