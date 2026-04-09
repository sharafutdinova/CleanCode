package patterns.absrtactfabric.gui;

public class Main {
    //    Описание
//    Приложение должно работать одинаково на разных платформах (Windows и MacOS), но выглядеть по-разному,
//    соответственно стилям каждой платформы. Мы будем использовать абстрактную фабрику для создания
//    различных графических элементов (например, кнопок, окон и меню), которые будут выглядеть по-разному в зависимости от платформы.
    static void main(String[] args) {
        GUIfactory guIfactory;
        String type = "Windows";
        if ("Windows".equals(type))
            guIfactory = new WindowsFactory();
        else guIfactory = new MacOSFactory();
        guIfactory.createButton().click();
        guIfactory.createMenu().open();
        guIfactory.createWindow().show();
    }
}
