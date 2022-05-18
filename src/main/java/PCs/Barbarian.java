package PCs;

import behaviours.IWeapon;

public class Barbarian extends Player{

    PlayerTypes playerType;

    public IWeapon getWeapon() {
        return weapon;
    }

    IWeapon weapon;

    public Barbarian(String name, IWeapon weapon) {
        super(name);
        this.weapon = weapon;
        this.playerType = PlayerTypes.BARBARIAN;

    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

}
