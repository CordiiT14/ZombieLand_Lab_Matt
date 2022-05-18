package items;

import behaviours.ISpell;

public class Fireball implements ISpell {

    int fireDamage;

    public Fireball() {
        this.fireDamage = 5;
    }

    public int spell(){
        return fireDamage;
    }
}
