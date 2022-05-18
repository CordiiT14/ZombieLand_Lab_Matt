package PCs;

public enum PlayerTypes {
    ROGUE(8, 2, 4, 2),
    KNIGHT(10, 3, 3, 2),
    BARBARIAN(12, 4, 2, 1),
    WIZARD(6, 1, 2, 4),
    SORCERER(7, 2, 2, 3),
    CLERIC(9, 3, 2, 3);

    private final int health;
    private final int strength;
    private final int dexterity;
    private final int intelligence;

    PlayerTypes(int health, int strength, int dexterity, int intelligence){
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
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
