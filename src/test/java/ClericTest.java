import PCs.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Claire");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Claire", cleric.getName());
        assertEquals(9, cleric.getPlayerType().health);
        assertEquals(3, cleric.getPlayerType().strength);
        assertEquals(2, cleric.getPlayerType().dexterity);
        assertEquals(3, cleric.getPlayerType().intelligence);
    }
}
