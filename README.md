# Библиотека для работы с VK.COM API

Библиотека для работы с API Вконтакте на языке Java. Все возможности API вы можете найти [здесь](https://vk.com/dev/manuals). Версия API 5.87

# Документация

https://heatalways.github.io/vkapi/

# Зависимости, используемые в библиотеке

* [JSON-SIMPLE](https://github.com/fangyidong/json-simple) версия 1.1.1.
* [Apache HttpClient и Apache HttpMime](http://hc.apache.org/httpcomponents-client-4.5.x/index.html) версия 4.5.3
* [Java-Websocket](https://github.com/TooTallNate/Java-WebSocket) версия 1.3.9

# Maven зависимость
[![Maven Central](https://img.shields.io/badge/Maven%20Central-2.4.6-green.svg)](https://mvnrepository.com/artifact/com.github.heatalways/api)
```xml
        <dependency>
            <groupId>com.github.heatalways</groupId>
            <artifactId>api</artifactId>
            <version>VERSION</version>
        </dependency>
```

# Начало
## Авторизация
https://heatalways.github.io/vkapi/ru/heat/vkapi/vkAuth/VkAuth.html

Для начала вам нужно инициализировать объект класса VkAuth, используя нужный вам способ: 
* [Authorization Code Flow для пользователя](https://vk.com/dev/authcode_flow_user)
```java
        VkAuth vkAuth = new VkAuth().userAuthorizationCodeFlow(
            CLIENT_ID,
            CLIENT_SECRET,
            REDIRECT_URI,
            CODE
        );
```
* [Authorization Code Flow для сообщества](https://vk.com/dev/authcode_flow_group)
```java
        VkAuth vkAuth = new VkAuth().groupAuthorizationCodeFlow(
            GROUP_ID,
            CLIENT_ID,
            CLIENT_SECRET,
            REDIRECT_URI,
            CODE
        );
```
* [Client Credentials Flow](https://vk.com/dev/client_cred_flow) 
```java
        VkAuth vkAuth = new VkAuth().clientCredentialsFlow(
            CLIENT_ID,
            CLIENT_SECRET
        );
```
* Используя уже имеющийся ключ доступа(access token)
```java
        VkAuth vkAuth = new VkAuth().setAccessToken(ACCESS_TOKEN);
```
Также вы можете отдельно указать секретный ключ вашего приложения. Это нужно для того случая, если вы указали сервисный ключ доступа. В данном случае, если не указать секретный ключ, возможны ошибки.
```java
        VkAuth vkAuth = new VkAuth().setAccessToken(ACCESS_TOKEN).setClientSecret(CLIENT_SECRET);
```
Если вам нужно изменить версию API (5.101 по умолчанию) или язык API("ru" по умолчанию), то следует вызвать метод "setVerison(<версия>)" или "setLanguage(<язык>)" соответственно.
```java
        VkAuth vkAuth = new VkAuth().setAccessToken(ACCESS_TOKEN).setVerison("5.101");
```
Подробнее об авторизации вы можете узнать в [официальной документации](https://vk.com/dev/access_token).

## Создание объекта VkApi
https://heatalways.github.io/vkapi/ru/heat/vkapi/VkApi.html

```java
        VkApi vkApi = new VkApi(vkAuth);
```

# Методы

Для того, чтобы вызвать метод, вам нужно обратиться к нему
```java
        vkApi.PREFIX.method(METHOD_NAME).params(PARAMS).execute();
```
* PREFIX - префикс метода (account, users, friends...)
* METHOD_NAME - имя метода: "users.get", Users.get... Допускаются оба варианта
* PARAMS - параметры типа String: "param1=value1","param2=value2"

Пример
```java
        vkApi.users.method(Users.get)
        .params("user_ids=1,2,3","fields=connections,sex").execute();
```
Этот метод вернет объект класса JsonHandler(метод "execute")
```java
[{"sex":2,"last_name":"Дуров","id":1,"first_name":"Павел"},{"sex":1,"last_name":"Владимирова","id":2,"first_name":"Александра"},{"sex":0,"last_name":"","id":3,"first_name":"DELETED","deactivated":"deleted"}]
```
Полный список методов вы можете найти [здесь](https://vk.com/dev/methods).

# Работа с объектом класса JsonHandler
https://heatalways.github.io/vkapi/ru/heat/vkapi/jsonHandler/JsonHandler.html

Пример 1
```java
        JsonHandler users = vkApi.users.method(Users.get)
        .params("user_ids=1,2,3","fields=connections,sex").execute();
        JsonHandler first_user = users.get(0);
        String name = first_user.get("first_name").toString();
```
Пример 2
```java
        JsonHandler users = vkApi.users.method(Users.get)
        .params("user_ids=1,2,3","fields=connections,sex").execute();
        for (JsonHandler user : users.toArray()) {
            System.out.println(user.get("first_name"));
        }
```

# Callback API
https://heatalways.github.io/vkapi/ru/heat/vkapi/callbackApi/CallbackAPI.html

Шаблон подключения Callback API
```java
        CallbackAPI callbackAPI = new CallbackAPI().setCallbackMessageHandler(new CallbackMessageHandler() {
            @Override
            public void METHOD(JsonHandler object) {
                //code...
            }
        });
        callbackAPI.parse(MESSAGE);
```
Вы переопределяете нужные вам методы, на которые будут приходить сообщения в формате JSON.
После чего вызываете медот "parse(MESSAGE)" (MESSAGE - сообщение от сервера), который парсит сообщение от сервера и вызывает нужные методы.
Более подробную информацию можно найти [здесь](https://vk.com/dev/callback_api).

# Long Poll API
## Bots Long Poll API
https://heatalways.github.io/vkapi/ru/heat/vkapi/longPollAPI/BotsLongPollApi.html

Шаблон подключения Bots Long Poll API
```java
        BotsLongPollApi botsLongPollApi = new BotsLongPollApi(
                VK_API, 
                GROUP_ID, 
                WAIT
        );
        botsLongPollApi.setMessageHandler(new BotsMessageHandler() {
            @Override
            public void METHOD(JsonHandler object) {
                //some code...
            }
        });
```
Вы переопределяете нужные вам методы, на которые будут приходить сообщения в формате JSON.
После чего вы можете либо сделать запрос к BotsLongPollApi
```java
        botsLongPollApi.makeRequest();
```
Либо запустить процесс, который будет работать до тех пор, пока вы принудительно не завершите его
```java
        botsLongPollApi.start();
```
Более подробную информацию можно найти [здесь](https://vk.com/dev/bots_longpoll).

## User Long Poll API
https://heatalways.github.io/vkapi/ru/heat/vkapi/longPollAPI/UserLongPollApi.html

Шаблон подключения User Long Poll API
```java
        UserLongPollApi userLongPollApi = new UserLongPollApi(
            VK_API,
            NEED_POINTS,
            GROUP_ID,
            WAIT,
            MODE,
            VERSION
        );
        userLongPollApi.setMessageHandler(new UserMessageHandler(){
            @Override
            public void onResponse(JsonHandler response) {
                //some code...
            }
        });
```
Вы переопределяете метод "onResponse", на который будут приходить сообщения в формате JSON.
После чего вы можете либо сделать запрос к UserLongPollApi
```java
        userLongPollApi.makeRequest();
```
Либо запустить процесс, который будет работать до тех пор, пока вы принудительно не завершите его
```java
        userLongPollApi.start();
```
Более подробную информацию можно найти [здесь](https://vk.com/dev/using_longpoll).

# Streaming API
https://heatalways.github.io/vkapi/ru/heat/vkapi/streamingAPI/StreamingApi.html

## Создание объекта
```java
        StreamingApi streamingApi = new StreamingApi(VK_API);
```

## Правила
https://heatalways.github.io/vkapi/ru/heat/vkapi/streamingAPI/Rules.html

Добавление правила
```java
        streamingApi.rules.add(VALUE, TAG);
```

Удаление правила
```java
        streamingApi.rules.delete(TAG);
```

Получение правил
```java
        streamingApi.rules.get();
```

## Поток
https://heatalways.github.io/vkapi/ru/heat/vkapi/streamingAPI/Stream.html

Чтение потока
```java
        streamingApi.stream.setStreamMessageHandler(new StreamMessageHandler() {
            @Override
            public void onMessage(JsonHandler message) {
                //some code...
            }
        }).start();
```

Вы переопределяете метод "onMessage", на который будут приходить сообщения в формате JSON.
Более подробную информацию можно найти [здесь](https://vk.com/dev/streaming_api_docs).

# Загрузка файлов
https://heatalways.github.io/vkapi/ru/heat/vkapi/upload/Upload.html

Шаблон загрузки файлов
```java
        vkApi.upload.OBJECT(PARAMS);
```
* OBJECT - объект загрузки (фото в сообщение{photoToMessage}, фото в альбом{photoToAlbum}...)
* PARAMS - параметры (файл, группа...)

Для некоторых видов загрузки необходимо вызвать метод "save" или даже "post/send";

Пример 1
```java
        vkApi.upload.photoToAlbum(
            ALBUM_ID,
            FILES
        ).save();
```

Пример 2
```java
        vkApi.upload.productPhoto(
                GROUP_ID,
                MAIN_PHOTO,
                FILE
        ).save().marketAdd(ARGS);
```

Пример 3
```java
        vkApi.upload.photoToMessage(
                PEER_ID,
                FILE
        ).save().post("message" + MESSAGE);
```

Более подробную информацию можно найти [здесь](https://vk.com/dev/upload_files).

