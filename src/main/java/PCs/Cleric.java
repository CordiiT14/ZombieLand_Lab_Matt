package PCs;

import behaviours.IHeal;

public class Cleric extends Player {

    PlayerTypes playerType;
    IHeal potion;

    public IHeal getPotion() {
        return potion;
    }

    public Cleric(String name, IHeal potion) {
        super(name, PlayerTypes.CLERIC);
        this.potion = potion;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

    public IHeal switchHealingMethod(IHeal newHeal){
        IHeal remove = getPotion();
        this.potion = newHeal;
        return remove;
    }
}
