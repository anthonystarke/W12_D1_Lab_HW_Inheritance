import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jon",1234,50000,"Tech Support",5000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jon",director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals(1234,director.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000,director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Tech Support", director.getDeptName());
    }

    @Test
    public void canSetName(){
        director.setName("Macky");
        assertEquals("Macky",director.getName());
    }

    @Test
    public void canSetNI(){
        director.setNI(4321);
        assertEquals(4321,director.getNI());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(3000);
        assertEquals(3000,director.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(3000);
        assertEquals(53000,director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(10000,director.payBonus(),2);
    }

    @Test
    public void canGetBudget(){
        assertEquals(5000,director.getBudget(),2);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(1000);
        assertEquals(1000,director.getBudget(),2);
    }
}
