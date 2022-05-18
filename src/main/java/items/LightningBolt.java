package items;

import behaviours.ISpell;

public class LightningBolt implements ISpell {

    int elecDamage;

    public LightningBolt() {
        this.elecDamage = 4;
    }

    public int spell(){
        return elecDamage;
    }
}
