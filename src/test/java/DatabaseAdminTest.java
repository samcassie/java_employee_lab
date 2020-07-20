import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Adam", 30, 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Adam", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(30, databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, databaseAdmin.getSalary());
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(2500);
        assertEquals(27500, databaseAdmin.getSalary());
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0);
    }

}
