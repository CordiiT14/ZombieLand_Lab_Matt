import PCs.Knight;
import behaviours.IWeapon;
import items.Dagger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Dagger dagger;

    @Before
    public void before(){
        dagger = new Dagger();
        knight = new Knight("Jon", dagger);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Jon", knight.getName());
        assertEquals(10, knight.getPlayerType().health);
        assertEquals(3, knight.getPlayerType().strength);
        assertEquals(3, knight.getPlayerType().dexterity);
        assertEquals(2, knight.getPlayerType().intelligence);
        assertEquals(dagger, knight.getWeapon());
    }
}
