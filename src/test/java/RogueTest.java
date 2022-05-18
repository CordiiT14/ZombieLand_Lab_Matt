import PCs.Rogue;
import items.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RogueTest {

    PCs.Rogue rogue;
    Dagger dagger;


    @Before
    public void before(){
        dagger = new Dagger();
        rogue = new Rogue("Cordii", dagger);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Cordii", rogue.getName());
        assertEquals(8, rogue.getHealth());
        assertEquals(2, rogue.getStrength());
        assertEquals(4, rogue.getDexterity());
        assertEquals(2, rogue.getIntelligence());
        assertEquals(dagger, rogue.getWeapon());
    }

    @Test
    public void canTakeAHit() {
        rogue.takeHit(1);
        assertEquals(7, rogue.getHealth());
    }
}
