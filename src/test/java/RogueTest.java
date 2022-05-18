import PCs.Rogue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RogueTest {

    PCs.Rogue rogue;

    @Before
    public void before(){
        rogue = new Rogue("Cordii");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Cordii", rogue.getName());
        assertEquals(8, rogue.getPlayerType().health);
        assertEquals(2, rogue.getPlayerType().strength);
        assertEquals(4, rogue.getPlayerType().dexterity);
        assertEquals(2, rogue.getPlayerType().intelligence);
    }


}
