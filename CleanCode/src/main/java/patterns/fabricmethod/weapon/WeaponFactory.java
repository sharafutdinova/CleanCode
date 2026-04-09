package patterns.fabricmethod.weapon;

public abstract class WeaponFactory {
    public abstract Weapon createWeapon();
    public void initAttack(){
        Weapon weapon = createWeapon();
        weapon.attack();
    }
}
