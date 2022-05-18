import PCs.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Matt");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Matt", barbarian.getName());
        assertEquals(12, barbarian.getPlayerType().health);
        assertEquals(4, barbarian.getPlayerType().strength);
        assertEquals(2, barbarian.getPlayerType().dexterity);
        assertEquals(1, barbarian.getPlayerType().intelligence);
    }
}
