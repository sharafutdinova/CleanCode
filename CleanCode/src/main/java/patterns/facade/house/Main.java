package patterns.facade.house;

public class Main {
    //    Описание
//    В системе "Умный дом" есть несколько устройств, которые управляют:
//    Светом (включить/выключить).
//    Кондиционером (включить/выключить).
//    Системой безопасности (включить/выключить).
//    Клиенту нужно предоставить единый интерфейс для управления (включение/выключение) всеми этими устройствами, скрыв детали реализации каждого из них.
//    Используем фасад, который объединит все эти операции в один интерфейс.
    static void main(String[] args) {
        HouseFacade houseFacade = new HouseFacade(new Light(), new AirConditioner(), new SecuritySystem());
        houseFacade.turnOnAll();
        houseFacade.turnOffAll();
    }
}
