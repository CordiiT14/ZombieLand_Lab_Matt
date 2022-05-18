package NPCs;

public enum EnemyTypes {
    HAWKING(4, 1),
    HOMER(1, 1),
    NINJA(8, 9);

    private final int health;
    private final int damage;

    EnemyTypes(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
