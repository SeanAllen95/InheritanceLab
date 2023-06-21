import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sean", "X1 223 45 667", 32000);
    }
    @Test
    public void hasName(){
        assertEquals("Sean", databaseAdmin.getName());
    }
    @Test
    public void hasniNumber(){
        assertEquals("X1 223 45 667", databaseAdmin.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(32000, databaseAdmin.getSalary(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(8000);
        assertEquals(40000, databaseAdmin.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(320, databaseAdmin.payBonus(), 0.0);
    }
}


