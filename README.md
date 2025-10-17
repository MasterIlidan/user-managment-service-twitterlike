# Репозиторий UserManagementService веб-приложения Twitterlike.

<p align="center">
	<img src="logo.jpg" width="886" height="480" alt="Twitterlike Logo" />
</p>

# Что такое Twitterlike?

Twitterlike - twitter-подобное веб-приложение. Проект, который я разрабатываю,
чтобы на практике поработать с популярными технологиями.
Это веб приложение с микросервисной архитектурой.

# За что отвечает сервис UserManagementService?

Сервис отвечает за регистрацию и авторизацию и работу с другими данными пользователей

# Другие репозитории Twitterlike:

[MessageService](https://github.com/MasterIlidan/message-service-twitterlike) - сервис сообщений

[SubscriptionService](https://github.com/MasterIlidan/subscription-service-twitterlike) - сервис подписок

[TwitterlikeFrontend](https://github.com/MasterIlidan/twitterlike-front) - фронтенд приложения

# TODO проекта

- [ ] внедрить Apache Kafka для обработки событий
    - [ ] NotificationService для уведомления пользователя о новом сообщений или посте у пользователя
      на которого он подписан
- [ ] единая точка входа API Gateway
- [ ] уйти от REST при Service-Service коммуникации к gRPC
- [x] настроить Jenkins для сборки и деплоя проекта
- [ ] запускать фронт не в IDE :)
- [ ] лента постов, рекомендации, подписки
    - [x] подписки (SubscriptionService)
    - [ ] рекомендации
    - [ ] лента
