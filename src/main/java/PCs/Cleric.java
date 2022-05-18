package PCs;

public class Cleric extends Player {

    PlayerTypes playerType;

    public Cleric(String name) {
        super(name);
        this.playerType = PlayerTypes.CLERIC;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
