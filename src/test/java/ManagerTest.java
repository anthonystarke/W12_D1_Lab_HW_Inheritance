import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jon",1234,50000,"Tech Support");
    }

    @Test
    public void canGetName(){
        assertEquals("Jon",manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(1234,manager.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000,manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech Support", manager.getDeptName());
    }

    @Test
    public void canSetName(){
        manager.setName("Macky");
        assertEquals("Macky",manager.getName());
    }

    @Test
    public void canSetNI(){
        manager.setNI(4321);
        assertEquals(4321,manager.getNI());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(3000);
        assertEquals(3000,manager.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(3000);
        assertEquals(53000,manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(5000,manager.payBonus(),2);
    }


}
