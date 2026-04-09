package patterns.fabricmethod.weapon;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Gun attack");
    }
}
