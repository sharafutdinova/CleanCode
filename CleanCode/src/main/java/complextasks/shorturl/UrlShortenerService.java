package complextasks.shorturl;

//Класс, отвечающий за логику сокращения и восстановления URL.
public class UrlShortenerService {
    private ShortenerFactory shortenerFactory;
    private UrlStorage urlStorage;

    public UrlShortenerService(ShortenerFactory shortenerFactory) {
        this.shortenerFactory = shortenerFactory;
    }

    public void setShortenerFactory(ShortenerFactory shortenerFactory) {
        this.shortenerFactory = shortenerFactory;
    }

    public void setStorageType(UrlStorage urlStorage) {
        this.urlStorage = urlStorage;
    }

    public String shortenUrl(String longURL) {
        String shortUrl = shortenerFactory.getShortUrl(longURL);
        urlStorage.saveURL(longURL, shortUrl);
        return shortUrl;
    }

    public String expandUrl(String shortURL) {
        return urlStorage.getLongURL(shortURL);
    }
}
