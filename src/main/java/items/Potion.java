package items;

import behaviours.IHeal;

public class Potion implements IHeal {

    int healing;

    public Potion() {
        this.healing = 3;
    }

    public int heal(){
        return this.healing;
    }
}
