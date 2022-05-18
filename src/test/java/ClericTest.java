import PCs.Cleric;
import behaviours.IHeal;
import items.LayOnHands;
import items.Potion;
import org.junit.Before;
import org.junit.Test;
import sun.util.resources.cldr.yav.LocaleNames_yav;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    LayOnHands layOnHands;

    @Before


    public void before(){
        layOnHands = new LayOnHands();
        potion = new Potion();
        cleric = new Cleric("Claire", potion);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Claire", cleric.getName());
        assertEquals(9, cleric.getPlayerType().getHealth());
        assertEquals(3, cleric.getPlayerType().getStrength());
        assertEquals(2, cleric.getPlayerType().getDexterity());
        assertEquals(3, cleric.getPlayerType().getIntelligence());
        assertEquals(potion, cleric.getPotion());
    }

    @Test
    public void canSwitchHealingMethod(){
        IHeal oldHeal = cleric.switchHealingMethod(layOnHands);
        assertEquals(layOnHands, cleric.getPotion());
        assertEquals(potion, oldHeal);
    }
}
