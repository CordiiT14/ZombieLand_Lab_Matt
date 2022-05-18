package PCs;

import behaviours.IWeapon;

public class Knight extends Player{

   PlayerTypes playerTypes;
   IWeapon weapon;

    public Knight(String name, IWeapon weapon) {
        super(name, PlayerTypes.KNIGHT);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public PlayerTypes getPlayerType() {
        return playerTypes;
    }

    public IWeapon switchWeapon(IWeapon weapon){
        IWeapon remove = getWeapon();
        this.weapon = weapon;
        return remove;
    }
}
