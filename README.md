# Библиотека VK API для языка Java

Библиотека для работы с API Вконтакте. Все возможности API вы можете найти [здесь](https://vk.com/dev/manuals).

# Зависимости, используемые в библиотеке

* [JSON-SIMPLE](https://github.com/fangyidong/json-simple) версия 1.1.1.
* [Apache HttpClient](http://hc.apache.org/httpcomponents-client-4.5.x/index.html) версия 4.5.3
* [Java-Websocket](https://github.com/TooTallNate/Java-WebSocket) версия 1.3.9

# Начало

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

