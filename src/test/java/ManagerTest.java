import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sam", 20, 20000, "Sports");
    }

    @Test
    public void canGetName(){
        assertEquals("Sam", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(20, manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sports", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(2000);
        assertEquals(22000, manager.getSalary());
    }

    @Test
    public void canGetBonus(){

       assertEquals(200, manager.payBonus(), 0);
    }

    @Test
    public void canChangeName(){
        manager.changeName("Aaron");
        assertEquals("Aaron", manager.getName());
    }
}
