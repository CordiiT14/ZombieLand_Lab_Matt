import PCs.Sorcerer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorcererTest {

    Sorcerer sorcerer;

    @Before
    public void before(){
        sorcerer = new Sorcerer("Max");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Max", sorcerer.getName());
        assertEquals(7, sorcerer.getPlayerType().health);
        assertEquals(2, sorcerer.getPlayerType().strength);
        assertEquals(2, sorcerer.getPlayerType().dexterity);
        assertEquals(3, sorcerer.getPlayerType().intelligence);
    }
}
