package PCs;

public class Rogue extends Player{

    PlayerTypes playerType;

    public Rogue(String name) {
        super(name);
        this.playerType = PlayerTypes.ROGUE;

    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
