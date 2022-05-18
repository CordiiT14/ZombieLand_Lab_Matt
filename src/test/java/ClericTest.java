import PCs.Cleric;
import items.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;

    @Before


    public void before(){
        potion = new Potion();
        cleric = new Cleric("Claire", potion);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Claire", cleric.getName());
        assertEquals(9, cleric.getPlayerType().health);
        assertEquals(3, cleric.getPlayerType().strength);
        assertEquals(2, cleric.getPlayerType().dexterity);
        assertEquals(3, cleric.getPlayerType().intelligence);
        assertEquals(potion, cleric.getPotion());
    }
}
