package complextasks.shorturl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryStorage implements UrlStorage {
    private static MemoryStorage urlStorage;
    public Map<String, String> shortUrls = new ConcurrentHashMap<>();
    public Map<String, String> longUrls = new ConcurrentHashMap<>();

    private MemoryStorage() {
    }

    public synchronized static MemoryStorage getInstance() {
        if (urlStorage == null) urlStorage = new MemoryStorage();
        return urlStorage;
    }

    @Override
    public void saveURL(String longUrl, String shortUrl) {
        shortUrls.put(longUrl, shortUrl);
        longUrls.put(shortUrl, longUrl);
    }

    @Override
    public String getShortURL(String longUrl) {
        return shortUrls.get(longUrl);
    }

    @Override
    public String getLongURL(String shortUrl) {
        return longUrls.get(shortUrl);
    }
}
