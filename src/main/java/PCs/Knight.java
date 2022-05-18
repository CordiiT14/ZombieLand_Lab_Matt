package PCs;

public class Knight extends Player{

   PlayerTypes playerTypes;

    public Knight(String name) {
        super(name);
        this.playerTypes = PlayerTypes.KNIGHT;
    }
//
    public PlayerTypes getPlayerType() {
        return playerTypes;
    }


}
