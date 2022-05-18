package items;

import behaviours.IDefend;

public class WaterWraith implements IDefend {

    int defend;
    int health;

    public WaterWraith() {
        this.defend = 3;
        this.health = 8;
    }

    public int defend() {
        return this.defend;
    }


    public int getHealth() {
        return health;
    }
}
