package PCs;

public class Barbarian extends Player{

    PlayerTypes playerType;

    public Barbarian(String name) {
        super(name);
        this.playerType = PlayerTypes.BARBARIAN;
    }

    public PlayerTypes getPlayerType() {
        return playerType;
    }
}
