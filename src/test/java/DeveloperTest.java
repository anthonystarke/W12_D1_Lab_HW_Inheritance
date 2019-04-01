import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void before(){
        dev = new Developer("Sarah",6543,60000);
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah",dev.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(6543,dev.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000,dev.getSalary());
    }

    @Test
    public void canSetName(){
        dev.setName("Macky");
        assertEquals("Macky",dev.getName());
    }

    @Test
    public void canSetNI(){
        dev.setNI(4321);
        assertEquals(4321,dev.getNI());
    }

    @Test
    public void canSetSalary(){
        dev.setSalary(3000);
        assertEquals(3000,dev.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        dev.raiseSalary(3000);
        assertEquals(63000,dev.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(600,dev.payBonus(),2);
    }
}
