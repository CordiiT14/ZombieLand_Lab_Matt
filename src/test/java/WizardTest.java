import PCs.Wizard;
import items.Fireball;
import items.WaterWraith;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    WaterWraith waterWraith;
    Fireball fireball;

    @Before
    public void before(){
        fireball = new Fireball();
        waterWraith = new WaterWraith();
        wizard = new Wizard("Kevin", fireball, waterWraith);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Kevin", wizard.getName());
        assertEquals(6, wizard.getPlayerType().health);
        assertEquals(1, wizard.getPlayerType().strength);
        assertEquals(2, wizard.getPlayerType().dexterity);
        assertEquals(4, wizard.getPlayerType().intelligence);
        assertEquals(waterWraith, wizard.getFamiliar());
        assertEquals(fireball, wizard.getSpell());
    }
}
