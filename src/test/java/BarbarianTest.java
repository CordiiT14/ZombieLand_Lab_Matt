import PCs.Barbarian;
import items.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Dagger dagger;

    @Before
    public void before(){
        dagger = new Dagger();
        barbarian = new Barbarian("Matt", dagger);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Matt", barbarian.getName());
        assertEquals(12, barbarian.getPlayerType().getHealth());
        assertEquals(4, barbarian.getPlayerType().getStrength());
        assertEquals(2, barbarian.getPlayerType().getDexterity());
        assertEquals(1, barbarian.getPlayerType().getIntelligence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(dagger, barbarian.getWeapon());
    }
}
