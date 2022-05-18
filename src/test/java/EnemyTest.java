import NPCs.HawkingZombie;
import NPCs.HomerZombie;
import NPCs.NinjaZombie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    NinjaZombie ninja;
    HawkingZombie hawking;
    HomerZombie homer;

    @Before
    public void before(){
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
}
