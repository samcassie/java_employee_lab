import Staff.Management.Director;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Pete", 50, 40000, "Clothing", 5000);
    }

    @Test
    public void canGetName(){
        assertEquals("Pete", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(50, director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Clothing", director.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(10000);
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void canGetBonus(){

        assertEquals(800, director.payBonus(), 0);
    }


}
