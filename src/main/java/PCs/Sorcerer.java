package PCs;

public class Sorcerer extends Player{

    PlayerTypes playerType;

    public Sorcerer(String name) {
        super(name);
        this.playerType = PlayerTypes.SORCERER;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
