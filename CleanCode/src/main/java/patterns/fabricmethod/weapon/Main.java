package patterns.fabricmethod.weapon;

public class Main {
    //    Описание
//    В этой задаче нам нужно создать систему для создания различных видов оружия в игре (например, мечи, луки и пистолеты).
//    Все оружие будет иметь общий интерфейс, но конкретные реализации оружия будут различаться.
//    Мы будем использовать фабричный метод, чтобы централизованно создавать объекты оружия.
    static void main(String[] args) {
        WeaponFactory weaponFactory;
        String weaponType = "Gun";
        if ("Bow".equals(weaponType)) {
            weaponFactory = new BowFactory();
        } else if ("Sword".equals(weaponType)) {
            weaponFactory = new SwordFactory();
        } else weaponFactory = new GunFactory();
        weaponFactory.initAttack();
    }
}
