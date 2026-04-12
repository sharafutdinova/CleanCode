package complextasks.shorturl;

public class ShorteningStrategyType2 implements ShorteningStrategy {
    @Override
    public String shorteningURL(String longURL) {
        return longURL.split("//")[1];
    }
}
