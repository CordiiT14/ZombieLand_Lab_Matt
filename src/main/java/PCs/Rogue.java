package PCs;

import behaviours.IWeapon;

public class Rogue extends Player{

    PlayerTypes playerType;



    IWeapon weapon;

    public Rogue(String name, IWeapon weapon) {
        super(name);
        this.playerType = PlayerTypes.ROGUE;
        this.weapon = weapon;

    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

    public IWeapon getWeapon() {
        return weapon;
    }
}
