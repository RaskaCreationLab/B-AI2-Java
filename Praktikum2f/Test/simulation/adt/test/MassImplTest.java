package simulation.adt.test;

import org.junit.Test;
import static org.junit.Assert.*;
import simulation.adt.classes.MassImpl;

public class MassImplTest {
    
    @Test
    public void testAdd() {
        MassImpl mass = new MassImpl(30.0);
        MassImpl mass1 = new MassImpl(0.0);
        assertEquals(mass, mass.add(mass1));
    }
    
    @Test 
    public void testAbs() {
        MassImpl mass1 = new MassImpl(30.0);
        MassImpl mass = new MassImpl(-30.0);
        assertEquals(mass1 ,mass.abs());
    }
}
