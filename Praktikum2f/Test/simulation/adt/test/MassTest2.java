package simulation.adt.test;

import org.junit.Test;
import static org.junit.Assert.*;
import simulation.adt.*;
import simulation.adt.interfaces.*;

public class MassTest2 {
    Mass mass = Values.massInKG(30.0);
    Mass mass1 = Values.massInG(0.0);
    Mass mass2 = Values.massInKG(-30.0);
    Mass mass3 = Values.massInKG(1.0);
    
    Acc acc = Values.accInMS2(10.0);
    
    Force force = Values.forceInN(300.0);
    
    String string ="30.0kg";
    
    @Test
    public void testAdd() {
        assertEquals(mass, mass.add(mass1));
        assertEquals(mass1, mass.add(mass2));
    }
    
    @Test 
    public void testSub() {
        assertEquals(mass1, mass.sub(mass));
        assertEquals(mass2, mass1.sub(mass));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(mass1, mass.mul(0.0));
        assertEquals(mass2, mass.mul(-1.0));
    }
    
    @Test 
    public void testMul() {
        assertEquals(force,mass.mul(acc));
    }
    /*
    @Test
    public void testDiv() {
        assertEquals(mass3,mass.div(30.0));
    }
    */
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
        assertEquals(string, mass.toString());
    }
}
