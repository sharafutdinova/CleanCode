package patterns.fabricmethod.weapon;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Bow attack");
    }
}
