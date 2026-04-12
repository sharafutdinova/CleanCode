package complextasks.shorturl;

public class ShorteningStrategyBase62 implements ShorteningStrategy {
    @Override
    public String shorteningURL(String longURL) {
        return longURL.substring(0, 10);
    }
}
