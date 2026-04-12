package complextasks.shorturl;

//Класс, использующий Factory Method для создания объектов ShorteningStrategy.
public class ShortenerFactory {
    private ShorteningStrategy shorteningStrategy;

    public ShortenerFactory(ShorteningStrategy shorteningStrategy) {
        this.shorteningStrategy = shorteningStrategy;
    }

    public void setShorteningStrategy(ShorteningStrategy shorteningStrategy) {
        this.shorteningStrategy = shorteningStrategy;
    }

    public String getShortUrl(String longUrl) {
        return shorteningStrategy.shorteningURL(longUrl);
    }
}
