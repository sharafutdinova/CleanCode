package patterns.singleton.logger;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    public List<String> logs = new ArrayList<>();
    public static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null)
            logger = new Logger();
        return logger;
    }

    public void printLogs() {
        System.out.println(logs);
    }
}
