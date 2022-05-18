import PCs.Wizard;
import behaviours.IDefend;
import items.Fireball;
import items.Imp;
import items.LightningBolt;
import items.WaterWraith;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    WaterWraith waterWraith;
    Fireball fireball;
    Imp imp;
    LightningBolt lightningBolt;

    @Before
    public void before(){
        fireball = new Fireball();
        waterWraith = new WaterWraith();
        wizard = new Wizard("Kevin", fireball, waterWraith);
        lightningBolt = new LightningBolt();
        imp = new Imp();
    }

    @Test
    public void hasAttributes(){
        assertEquals("Kevin", wizard.getName());
        assertEquals(6, wizard.getPlayerType().getHealth());
        assertEquals(1, wizard.getPlayerType().getStrength());
        assertEquals(2, wizard.getPlayerType().getDexterity());
        assertEquals(4, wizard.getPlayerType().getIntelligence());
        assertEquals(waterWraith, wizard.getFamiliar());
        assertEquals(fireball, wizard.getSpell());
    }

    @Test
    public void canSwitchFamiliars(){
        IDefend oldFamiliar = wizard.switchFamiliar(imp);
        assertEquals(waterWraith, oldFamiliar);
        assertEquals(imp, wizard.getFamiliar());
    }
}
