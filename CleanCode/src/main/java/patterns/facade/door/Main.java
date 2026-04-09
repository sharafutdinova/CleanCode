package patterns.facade.door;

public class Main {
//    Описание
//    В нашей системе есть несколько операций для управления дверью:
//    Открытие двери.
//    Закрытие двери.
//    Блокировка двери.
//    Каждая операция реализована в своём классе. Задача — создать фасад, который будет объединять эти операции и предоставлять простой интерфейс для работы с дверью.

    static void main(String[] args) {
        OpenDoor openDoor = new OpenDoor();
        CloseDoor closeDoor = new CloseDoor();
        BlockDoor blockDoor = new BlockDoor();
        DoorFacade doorFacade = new DoorFacade(openDoor, closeDoor, blockDoor);
        doorFacade.doorOperations();
    }
}
