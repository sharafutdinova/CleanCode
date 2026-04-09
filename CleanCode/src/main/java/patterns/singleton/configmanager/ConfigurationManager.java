package patterns.singleton.configmanager;

public class ConfigurationManager {
    public String connectionString = "Connection to DB";
    public String filePath = "Path to files";
    public String logLevel = "info";

    public static ConfigurationManager configurationManager;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null)
            configurationManager = new ConfigurationManager();
        return configurationManager;
    }
}
