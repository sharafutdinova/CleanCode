package complextasks.shorturl;

//Интерфейс для хранения пар "длинный URL - короткий URL", с различными реализациями (например, память, файлы, базы данных).
public interface UrlStorage {
    void saveURL(String longUrl, String shortUrl);

    String getShortURL(String longUrl);

    String getLongURL(String shortUrl);
}
