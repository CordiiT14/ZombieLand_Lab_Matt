package PCs;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Player{

    PlayerTypes playerType;
    ISpell spell;
    IDefend familiar;

    public Wizard(String name, ISpell spell, IDefend familiar) {
        super(name, PlayerTypes.WIZARD);
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
