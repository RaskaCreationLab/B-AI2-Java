package adt.mass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simulation.adt.classes.AccImpl;
import simulation.adt.classes.ForceImpl;
import simulation.adt.classes.MassImpl;
import simulation.adt.interfaces.Mass;
import simulation.adt.interfaces.Acc;
import simulation.adt.interfaces.Force;
import simulation.adt.interfaces.Length;
import simulation.adt.interfaces.Mass;

public class test {
    
    public test() {
    }
    
    public final Mass mass = MassImpl.valueOf(20.0);
    public final Force force = ForceImpl.valueof(4.0);
    public final Acc acc = AccImpl.valueOf(inValue)
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMassMul() {
        assertEquals(mass ,mass);
        assertEquals()
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
