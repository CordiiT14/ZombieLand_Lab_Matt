package NPCs;

import PCs.Player;

public abstract class Enemy {

    int health;
    int damage;

    public Enemy(EnemyTypes type) {
        this.health = type.getHealth();
        this.damage = type.getDamage();
    }

    public void takeDamage(int damageTaken){
        this.health -= damageTaken;
    }

    public void attackPlayer(Player player){
        player.takeHit(this.damage);
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
