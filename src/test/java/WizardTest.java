import PCs.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Kevin");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Kevin", wizard.getName());
        assertEquals(6, wizard.getPlayerType().health);
        assertEquals(1, wizard.getPlayerType().strength);
        assertEquals(2, wizard.getPlayerType().dexterity);
        assertEquals(4, wizard.getPlayerType().intelligence);
    }
}
