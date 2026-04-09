package patterns.builder.character;

public class Main {
    //    Описание
//    В игре игрок создает персонажа, задавая его параметры, такие как здоровье, урон, броня и магия.
//    Паттерн Builder поможет организовать создание персонажа, позволяя задавать его параметры поэтапно
//    и не перегружать конструктор класса Character.
    static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter.Builder()
                .setHealth("Health 90%")
                .setArmor("Armor is 80%")
                .setDamage("Damage is 10%")
                .setMagic("Magic is 80 level")
                .build();
        System.out.println(gameCharacter);
    }
}
