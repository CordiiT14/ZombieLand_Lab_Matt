package items;

import behaviours.IDefend;

public class Imp implements IDefend {

    int defend;
    int health;

    public Imp() {
        this.defend = 1;
        this.health = 3;
    }


    public int getHealth() {
        return health;
    }

    public int defend() {
        return this.defend;
    }
}
