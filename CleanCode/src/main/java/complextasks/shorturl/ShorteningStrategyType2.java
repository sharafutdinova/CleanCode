package complextasks.shorturl;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ShorteningStrategyType2 implements ShorteningStrategy {
    @Override
    public String shorteningURL(String longURL) {
        return URLEncoder.encode(longURL, StandardCharsets.UTF_8);
    }
}
