import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Sarah",6543,60000);
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah",admin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(6543,admin.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000,admin.getSalary());
    }

    @Test
    public void canSetName(){
        admin.setName("Macky");
        assertEquals("Macky",admin.getName());
    }

    @Test
    public void canSetNI(){
        admin.setNI(4321);
        assertEquals(4321,admin.getNI());
    }

    @Test
    public void canSetSalary(){
        admin.setSalary(3000);
        assertEquals(3000,admin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        admin.raiseSalary(3000);
        assertEquals(63000,admin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(6000,admin.payBonus(),2);
    }
}
