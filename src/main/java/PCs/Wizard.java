package PCs;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Player{

    PlayerTypes playerType;
    ISpell spell;
    IDefend familiar;

    public Wizard(String name, ISpell spell, IDefend familiar) {
        super(name);
        playerType = PlayerTypes.WIZARD;
        this.spell = spell;
        this.familiar = familiar;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getFamiliar() {
        return familiar;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
