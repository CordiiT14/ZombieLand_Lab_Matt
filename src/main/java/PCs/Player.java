package PCs;

public abstract class Player {

    String name;
    int health;
    int strength;
    int dexterity;
    int intelligence;

    public Player(String name, int health, int strength, int dexterity, int intelligence) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
