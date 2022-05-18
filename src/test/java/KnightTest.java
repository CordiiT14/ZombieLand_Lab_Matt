import PCs.Knight;
import behaviours.IWeapon;
import items.Dagger;
import items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Dagger dagger;
    Sword sword;

    @Before
    public void before(){
        dagger = new Dagger();
        sword = new Sword();
        knight = new Knight("Jon", dagger);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Jon", knight.getName());
        assertEquals(10, knight.getPlayerType().getHealth());
        assertEquals(3, knight.getPlayerType().getStrength());
        assertEquals(3, knight.getPlayerType().getDexterity());
        assertEquals(2, knight.getPlayerType().getIntelligence());
        assertEquals(dagger, knight.getWeapon());
    }

    @Test
    public void canSwitchWeapons(){
        IWeapon oldWeapon = knight.switchWeapon(sword);
        assertEquals(dagger, oldWeapon);
        assertEquals(sword, knight.getWeapon());
    }
}
