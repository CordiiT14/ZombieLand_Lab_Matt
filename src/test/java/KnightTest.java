import PCs.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Jon");
    }

    @Test
    public void hasAttributes(){
        assertEquals("Jon", knight.getName());
        assertEquals(10, knight.getPlayerType().health);
        assertEquals(3, knight.getPlayerType().strength);
        assertEquals(3, knight.getPlayerType().dexterity);
        assertEquals(2, knight.getPlayerType().intelligence);
    }
}
