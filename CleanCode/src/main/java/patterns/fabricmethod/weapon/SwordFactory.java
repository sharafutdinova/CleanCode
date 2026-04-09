package patterns.fabricmethod.weapon;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
