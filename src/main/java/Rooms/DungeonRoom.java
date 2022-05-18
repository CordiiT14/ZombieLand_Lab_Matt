package Rooms;

import NPCs.Enemy;
import items.Loot;

import java.util.ArrayList;

public class DungeonRoom {

    ArrayList<Loot> loot;
    ArrayList<Enemy> enemies;

    public DungeonRoom(ArrayList<Loot> loot, ArrayList<Enemy> enemies) {
        this.loot = loot;
        this.enemies = enemies;
    }

    public ArrayList<Loot> getLoot() {
        return loot;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
}
