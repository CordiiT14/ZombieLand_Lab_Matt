package PCs;

public class Wizard extends Player{

    PlayerTypes playerType;

    public Wizard(String name) {
        super(name);
        playerType = PlayerTypes.WIZARD;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
