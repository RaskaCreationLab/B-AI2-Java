package simulation.adt.test;

import org.junit.Test;
import static org.junit.Assert.*;
import simulation.adt.classes.MassImpl;
import simulation.adt.classes.AccImpl;
import simulation.adt.classes.ForceImpl;

public class MassImplTest {
    MassImpl mass = new MassImpl(30.0);
    MassImpl mass1 = new MassImpl(0.0);
    MassImpl mass2 = new MassImpl(-30.0);
    MassImpl mass3 = new MassImpl(1.0);
    
    AccImpl acc = new AccImpl(10.0);
    
    ForceImpl force = new ForceImpl(300.0);
    
    String string ="30.0 kg";
    
    @Test
    public void testAdd() {
        assertEquals(mass, mass.add(mass1));
    }
    
    @Test 
    public void testSub() {
        assertEquals(mass1, mass.sub(mass));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(mass1, mass.multiply(0.0));
    }
    
    @Test 
    public void testMul() {
        assertEquals(force,mass.mul(acc));
    }
    
    @Test
    public void testDiv() {
        assertEquals(mass3,mass.div(30.0));
    }
    
    @Test 
    public void testAbs() {
        assertEquals(mass, mass2.abs());
    }
    
    @Test
    public void testSignum() {
        assertEquals(mass3,mass.signum());
    }
        
    @Test
    public void testToString() {
        assertEquals(string, mass.toString_EU());
    }
}
