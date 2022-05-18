package items;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    int damage;

    public Sword() {
        this.damage = 3;
    }

    public int attack() {
        return damage;
    }
}
