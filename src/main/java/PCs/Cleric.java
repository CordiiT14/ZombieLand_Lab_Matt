package PCs;

import behaviours.IHeal;

public class Cleric extends Player {

    PlayerTypes playerType;
    IHeal potion;

    public IHeal getPotion() {
        return potion;
    }

    public Cleric(String name, IHeal potion) {
        super(name);
        this.playerType = PlayerTypes.CLERIC;
        this.potion = potion;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
