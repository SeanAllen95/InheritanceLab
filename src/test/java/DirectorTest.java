import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Sean", "X1 223 45 667", 32000, "Chemist", 90000);
    }
    @Test
    public void hasName(){
        assertEquals("Sean", director.getName());
    }
    @Test
    public void hasniNumber(){
        assertEquals("X1 223 45 667", director.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(32000, director.getSalary(), 0.0);
    }
    @Test
    public void hasDepartment(){
        assertEquals("Chemist", director.getDeptName());
    }
    @Test
    public void hasBudget(){
        assertEquals(90000, director.getBudget(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(8000);
        assertEquals(40000, director.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(640, director.payBonus(), 0.0);
    }
    @Test
    public void cannotRaiseNegative(){
        director.raiseSalary(-2000);
        assertEquals(32000, director.getSalary(), 0.0);
    }
    @Test
    public void cannotSetNameToNull(){
        director.setName(null);
        assertEquals("Sean", director.getName());
    }
}
