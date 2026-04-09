package patterns.singleton.configmanager;

public class Main {
    //    Описание
//    В приложении необходимо создать класс ConfigurationManager, который будет управлять настройками приложения, такими как:
//    Параметры подключения к базе данных (например, URL базы данных, имя пользователя, пароль).
//    Путь к папке для хранения файлов.
//    Настройки логирования (например, уровень логирования, путь к лог-файлу).
//    Класс ConfigurationManager должен быть реализован по паттерну Singleton, чтобы в приложении был только один экземпляр этого класса,
//    который будет предоставлять доступ к конфигурационным данным.
    static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        configurationManager.filePath = "New file path";
        ConfigurationManager configurationManager_2 = ConfigurationManager.getInstance();
        System.out.println(configurationManager_2.filePath);//New file path
    }
}
