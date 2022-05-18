package items;

import behaviours.IWeapon;

public class Dagger implements IWeapon {

    int damage;

    public Dagger(){
        this.damage = 1;
    }

    public int attack(){
        return this.damage;
    }

}
