package PCs;

public abstract class Player {

    String name;
    int health;
    int dexterity;
    int strength;
    int intelligence;

    public Player(String name, PlayerTypes type) {

        this.name = name;
        this.health = type.getHealth();
        this.strength = type.getStrength();
        this.intelligence = type.getIntelligence();
        this.dexterity = type.getDexterity();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void takeHit(int wounds){
        this.health -= wounds;
    }
}
