package complextasks.shorturl;

public class ShorteningStrategyBase62 implements ShorteningStrategy {
    private static final String BASE62_CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Метод для декодирования (Short URL -> ID)
    public static long decode(String str) {
        long num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 62 + BASE62_CHARS.indexOf(str.charAt(i));
        }
        return num;
    }

    @Override
    public String shorteningURL(String longURL) {
        return String.valueOf(decode(longURL));
    }
}
