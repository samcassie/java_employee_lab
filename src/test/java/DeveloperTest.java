import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steve", 20, 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(20, developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canIncreaseSalary(){
       developer.raiseSalary(2500);
        assertEquals(27500, developer.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, developer.payBonus(), 0);
    }
}
