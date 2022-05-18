import PCs.Sorcerer;
import behaviours.IDefend;
import items.Fireball;
import items.Imp;
import items.LightningBolt;
import items.WaterWraith;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SorcererTest {

    Sorcerer sorcerer;
    Fireball fireball;
    WaterWraith familiar;
    Imp imp;
    LightningBolt lightningBolt;

    @Before
    public void before(){
        lightningBolt = new LightningBolt();
        imp = new Imp();
        fireball = new Fireball();
        familiar = new WaterWraith();
        sorcerer = new Sorcerer("Max", fireball, familiar);
    }

    @Test
    public void hasAttributes(){
        assertEquals("Max", sorcerer.getName());
        assertEquals(7, sorcerer.getHealth());
        assertEquals(2, sorcerer.getStrength());
        assertEquals(2, sorcerer.getDexterity());
        assertEquals(3, sorcerer.getIntelligence());
        assertEquals(fireball, sorcerer.getSpell());
        assertEquals(familiar, sorcerer.getFamiliar());
    }

    @Test
    public void canSwitchFamiliars(){
        IDefend oldFamiliar = sorcerer.switchFamiliar(imp);
        assertEquals(familiar, oldFamiliar);
        assertEquals(imp, sorcerer.getFamiliar());
    }


}
