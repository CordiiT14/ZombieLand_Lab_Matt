package items;

import behaviours.IHeal;

public class LayOnHands implements IHeal {

    int heal;

    public LayOnHands(){
        this.heal = 4;
    }

    public int heal(){
        return this.heal;
    }
}
