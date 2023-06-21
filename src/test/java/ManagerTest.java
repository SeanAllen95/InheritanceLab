import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sean", "X1 223 45 667", 32000, "Chemist");
    }
    @Test
    public void hasName(){
        assertEquals("Sean", manager.getName());
    }
    @Test
    public void hasniNumber(){
        assertEquals("X1 223 45 667", manager.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(32000, manager.getSalary(), 0.0);
    }
    @Test
    public void hasDepartment(){
        assertEquals("Chemist", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(8000);
        assertEquals(40000, manager.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(320, manager.payBonus(), 0.0);
    }
}
