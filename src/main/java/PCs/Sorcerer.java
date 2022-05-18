package PCs;

import behaviours.ISpell;

public class Sorcerer extends Player{

    PlayerTypes playerType;
    ISpell spell;

    public Sorcerer(String name, ISpell spell) {
        super(name);
        this.playerType = PlayerTypes.SORCERER;
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
