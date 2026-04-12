package complextasks.shorturl;

//Цель: Разработать библиотеку, которая предоставляет функциональность для сокращения длинных URL и их восстановления.
// Библиотека должна быть гибкой, чтобы в будущем можно было легко добавлять новые методы сокращения.
//
//Паттерны проектирования:
//Singleton: Единственное хранилище всех URL.
//Factory Method: Для создания объектов, отвечающих за различные методы сокращения URL.
//Strategy: Для переключения между способами сокращения URL.
//
//Архитектура библиотеки:
//UrlShortenerService: Класс, отвечающий за логику сокращения и восстановления URL.
//        UrlStorage: Интерфейс для хранения пар "длинный URL - короткий URL", с различными реализациями (например, память, файлы, базы данных).
//ShorteningStrategy: Интерфейс, который определяет метод для сокращения URL. Реализации могут включать Base62, хеширование, UUID и другие.
//ShortenerFactory: Класс, использующий Factory Method для создания объектов ShorteningStrategy.

public class Main {
    static void main(String[] args) {
        //Конфигурация библиотеки с выбранной стратегией сокращения
        UrlShortenerService shortenerService = new UrlShortenerService(new ShortenerFactory(new ShorteningStrategyBase62()));
        UrlStorage urlStorage = MemoryStorage.getInstance();
        shortenerService.setStorageType(urlStorage);

        String shortUrlBase62 = shortenerService.shortenUrl("https://translate.google.ru/?hl=ru&sl=ru&tl=en&text=Test");
        System.out.println(shortUrlBase62);
        String longUrlBase62 = shortenerService.expandUrl(shortUrlBase62);
        System.out.println(longUrlBase62);

        //Для стратегии с типом 2
        shortenerService.setShortenerFactory(new ShortenerFactory(new ShorteningStrategyType2()));
        String shortUrlType2 = shortenerService.shortenUrl("HTTPS://TRANSLATE.GOOGLE.RU/?hl=ru&sl=ru&tl=en&text=Test");
        System.out.println(shortUrlType2);
        String longUrlType2 = shortenerService.expandUrl(shortUrlType2);
        System.out.println(longUrlType2);
    }
}
