# Библиотека VK API для языка Java

Библиотека для работы с API Вконтакте. Все возможности API вы можете найти [здесь](https://vk.com/dev/manuals).

# Зависимости, используемые в библиотеке

* [JSON-SIMPLE](https://github.com/fangyidong/json-simple) версия 1.1.1.
* [Apache HttpClient и Apache HttpMime](http://hc.apache.org/httpcomponents-client-4.5.x/index.html) версия 4.5.3
* [Java-Websocket](https://github.com/TooTallNate/Java-WebSocket) версия 1.3.9

# Начало
## Авторизация
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
	VkAuth vkAuth = new VkAuth().
	            setAccessToken(ACCESS_TOKEN).
	            setClientSecret(CLIENT_SECRET);
```
Подробнее об авторизации вы можете узнать в [официальной документации](https://vk.com/dev/access_token).

## Создание объекта VkApi
```java
	VkApi vkApi = new VkApi(vkAuth);
```

# Методы

Для того, чтобы вызвать метод, вам нужно обратиться к нему
```java
	vkApi.PREFIX.METHOD(PARAMS);
```
* OBJECT - префикс метода (account, users, friends...)
* METHOD - метод
* PARAMS - параметры типа String: "param1=value1","param2=value2"

Пример
```java
	vkApi.users.get("user_ids=1,2,3","fields=connections,sex");
```
Этот метод вернет объект класса JsonHandler
```json
[{"sex":2,"last_name":"Дуров","id":1,"first_name":"Павел"},{"sex":1,"last_name":"Владимирова","id":2,"first_name":"Александра"},{"sex":0,"last_name":"","id":3,"first_name":"DELETED","deactivated":"deleted"}]
```
Полный список методов вы можете найти [здесь](https://vk.com/dev/methods).

# Работа с объектом класса JsonHandler

Пример 1
```java
	JsonHandler users = vkApi.users.get("user_ids=1,2,3","fields=connections,sex");
	JsonHandler first_user = users.get(0);
	String name = first_user.get("first_name").toString();
```
Пример 2
```java
	JsonHandler users = vkApi.users.get("user_ids=1,2,3","fields=connection,sex");
	for (JsonHandler user : users.toArray()) {
		System.out.println(user.get("first_name"));
	}
```
# Long Poll API
## Bots Long Poll API

Шаблон подключения Bots Long Poll API
```java
	BotsLongPollApi botsLongPollApi = new BotsLongPollApi(VK_API, GROUP_ID, WAIT);
	        botsLongPollApi.setBotsMessageHandler(new BotsMessageHandler() {
	            @Override
	            public void METHOD(JsonHandler object) {
	                //some code...
	            }
	        });
```
Вы переопределяете нужные вам методы, на которые будут приходить сообщения в формате JSON.
Более подробную информацию можно найти [здесь](https://vk.com/dev/bots_longpoll).

## User Long Poll API

Шаблон подключения Bots Long Poll API
```java
	UserLongPollApi userLongPollApi = new UserLongPollApi(
	                VK_API,
	                NEED_POINTS,
	                GROUP_ID,
	                WAIT,
	                MODE,
	                VERSION
	        );
	        userLongPollApi.setUserMessageHandler(new UserMessageHandler(){
	            @Override
	            public void onResponse(JsonHandler response) {
	                //some code...
	            }
	        });
```
Вы переопределяете метод "onResponse", на который будут приходить сообщения в формате JSON.
Более подробную информацию можно найти [здесь](https://vk.com/dev/using_longpoll).

# Streaming API
## Создание объекта
```java
	StreamingApi streamingApi = new StreamingApi(VK_API);
```

## Правила

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

Чтение потока
```java
	streamingApi.stream.setMessageHandler(new MessageHandler() {
            @Override
            public void onMessage(JsonHandler message) {
                //some code...
            }
        });
```

Вы переопределяете метод "onMessage", на который будут приходить сообщения в формате JSON.
Более подробную информацию можно найти [здесь](https://vk.com/dev/streaming_api_docs).

# Загрузка файлов

Шаблон загрузки файлов
```java
	vkApi.upload.OBJECT.upload(PARAMS);
```
* OBJECT - объект загрузки (фото в сообщение{photoToMessage}, фото в альбом{photoToAlbum}...)
* PARAMS - параметры (файл, группа...)

Для некоторых видов загрузки необходимо вызвать метод "save" или даже "post/send";

Пример 1
```java
	vkApi.upload.photoToAlbum.upload(
                ALBUM_ID,
                FILES
        ).save();
```

Пример 2
```java
	vkApi.upload.productPhoto.upload(
                GROUP_ID,
                MAIN_PHOTO
                FILE
        ).save().marketAdd(ARGS);
```

Более подробную информацию можно найти [здесь](https://vk.com/dev/upload_files).

