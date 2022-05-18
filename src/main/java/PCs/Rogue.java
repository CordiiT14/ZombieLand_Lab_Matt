package PCs;

import behaviours.IWeapon;

public class Rogue extends Player{

    PlayerTypes playerType;



    IWeapon weapon;

    public Rogue(String name, IWeapon weapon) {
        super(name, PlayerTypes.ROGUE);
        this.weapon = weapon;

    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public IWeapon switchWeapon(IWeapon weapon) {
        IWeapon remove = getWeapon();
        this.weapon = weapon;
        return remove;
    }
}
