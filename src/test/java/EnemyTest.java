import NPCs.HawkingZombie;
import NPCs.HomerZombie;
import NPCs.NinjaZombie;
import PCs.Rogue;
import items.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    NinjaZombie ninja;
    HawkingZombie hawking;
    HomerZombie homer;
    Rogue rogue;
    Dagger dagger;

    @Before
    public void before(){
        dagger = new Dagger();
        rogue = new Rogue("Cordii", dagger);
        homer = new HomerZombie();
        hawking = new HawkingZombie();
        ninja = new NinjaZombie();

    }

    @Test
    public void haveAttributesBasedOnType(){
        assertEquals(1, homer.getHealth());
        assertEquals(1, homer.getDamage());
        assertEquals(4, hawking.getHealth());
        assertEquals(1, hawking.getDamage());
        assertEquals(8, ninja.getHealth());
        assertEquals(9, ninja.getDamage());
    }

    @Test
    public void canBeDamaged(){
        homer.takeDamage(1);
        ninja.takeDamage(5);
        hawking.takeDamage(3);
        assertEquals(0, homer.getHealth());
        assertEquals(3, ninja.getHealth());
        assertEquals(1, hawking.getHealth());
    }

    @Test
    public void canHitThePlayer(){
        homer.attackPlayer(rogue);
        assertEquals(7, rogue.getHealth());
    }
}
