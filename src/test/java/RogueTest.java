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
        assertEquals(8, rogue.getPlayerType().health);
        assertEquals(2, rogue.getPlayerType().strength);
        assertEquals(4, rogue.getPlayerType().dexterity);
        assertEquals(2, rogue.getPlayerType().intelligence);
        assertEquals(dagger, rogue.getWeapon());
    }


}
