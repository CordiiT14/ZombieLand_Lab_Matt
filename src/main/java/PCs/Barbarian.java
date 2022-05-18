package PCs;

import behaviours.IWeapon;

public class Barbarian extends Player{

    PlayerTypes playerType;

    public IWeapon getWeapon() {
        return weapon;
    }

    IWeapon weapon;

    public Barbarian(String name, IWeapon weapon) {
        super(name, PlayerTypes.BARBARIAN);
        this.weapon = weapon;


    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }

    public IWeapon switchWeapon(IWeapon weapon) {
        IWeapon remove = getWeapon();
        this.weapon = weapon;
        return remove;
    }
}
