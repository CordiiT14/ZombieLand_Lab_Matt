import NPCs.Enemy;
import NPCs.HomerZombie;
import PCs.Rogue;
import Rooms.Room;
import items.Dagger;
import items.Diamond;
import items.Loot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Loot loot;
    HomerZombie homer;
    Rogue rogue;
    Dagger dagger;

    @Before
    public void before(){
        dagger = new Dagger();
        loot = new Diamond();
        rogue = new Rogue("Cordii", dagger);
        homer = new HomerZombie();
        room = new Room("Its a kitchen");
        room.addEnemy(homer);
        room.addToLoot(loot);
    }

    @Test
    public void roomHasAttributes(){
        assertEquals("Its a kitchen", room.getDescription());
        assertEquals(1, room.lootSize());
        assertEquals(1, room.enemiesSize());
    }
}
