package complextasks.shorturl;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MemoryStorage implements UrlStorage {
    private static MemoryStorage urlStorage;
    public Map<String, String> urls = new HashMap<>();

    private MemoryStorage() {
    }

    public static MemoryStorage getInstance() {
        if (urlStorage == null) urlStorage = new MemoryStorage();
        return urlStorage;
    }

    @Override
    public void saveURL(String longUrl, String shortUrl) {
        urls.put(longUrl, shortUrl);
    }

    @Override
    public String getShortURL(String longUrl) {
        return urls.get(longUrl);
    }

    @Override
    public String getLongURL(String shortUrl) {
        return urls.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), shortUrl))
                .map(Map.Entry::getKey)
                .findFirst().orElseThrow();
    }
}
