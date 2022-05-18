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
        assertEquals(8, rogue.getPlayerType().getHealth());
        assertEquals(2, rogue.getPlayerType().getStrength());
        assertEquals(4, rogue.getPlayerType().getDexterity());
        assertEquals(2, rogue.getPlayerType().getIntelligence());
        assertEquals(dagger, rogue.getWeapon());
    }


}
