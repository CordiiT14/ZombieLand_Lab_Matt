package Rooms;

import NPCs.Enemy;
import items.Loot;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Room {

    ArrayList<Loot> loot;
    ArrayList<Enemy> enemies;
    String description;

    public Room(String description) {
        this.loot = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.description = description;
    }

    public ArrayList<Loot> getLoot() {
        return loot;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public String getDescription() {
        return description;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public void addToLoot(Loot loot){
        this.loot.add(loot);
    }

    public int lootSize(){
        return this.loot.size();
    }

    public int enemiesSize(){
        return enemies.size();
    }
}
