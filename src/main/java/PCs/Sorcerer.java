package PCs;

import behaviours.IDefend;
import behaviours.ISpell;
import behaviours.IWeapon;

public class Sorcerer extends Player{

    PlayerTypes playerType;
    ISpell spell;
    IDefend familiar;

    public Sorcerer(String name, ISpell spell, IDefend familiar) {
        super(name, PlayerTypes.SORCERER);
        this.spell = spell;
        this.familiar = familiar;
    }

    public ISpell getSpell() {
        return spell;
    }


    public IDefend getFamiliar() {
        return familiar;
    }

    public ISpell switchSpell(ISpell spell) {
        ISpell remove = getSpell();
        this.spell = spell;
        return remove;
    }


    public IDefend switchFamiliar(IDefend familiar){
        IDefend remove = getFamiliar();
        this.familiar = familiar;
        return remove;
    }
}
