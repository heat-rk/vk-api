# Библиотека VK API для языка Java

Библиотека для работы с API Вконтакте. Все возможности API вы можете найти [здесь](https://vk.com/dev/manuals).

# Зависимости, используемые в библиотеке

* [JSON-SIMPLE](https://github.com/fangyidong/json-simple) версия 1.1.1.
* [Apache HttpClient](http://hc.apache.org/httpcomponents-client-4.5.x/index.html) версия 4.5.3
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
	vkApi.users.get("user_ids=1,2,3","fields=connection,sex");
```
Этот метод вернет объект класса JsonHandler:
	[{"sex":2,"last_name":"Дуров","id":1,"first_name":"Павел"},{"sex":1,"last_name":"Владимирова","id":2,"first_name":"Александра"},{"sex":0,"last_name":"","id":3,"first_name":"DELETED","deactivated":"deleted"}]

## Работа с объектом класса JsonHandler

Пример 1
```java
	JsonHandler users = vkApi.users.get("user_ids=1,2,3","fields=connection,sex");
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

