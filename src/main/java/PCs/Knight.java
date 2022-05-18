package PCs;

import behaviours.IWeapon;

public class Knight extends Player{

   PlayerTypes playerTypes;
   IWeapon weapon;

    public Knight(String name, IWeapon weapon) {
        super(name);
        this.playerTypes = PlayerTypes.KNIGHT;
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    //
    public PlayerTypes getPlayerType() {
        return playerTypes;
    }


}
