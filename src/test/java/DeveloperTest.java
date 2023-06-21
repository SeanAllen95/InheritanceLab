import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sean", "X1 223 45 667", 32000);
    }
    @Test
    public void hasName(){
        assertEquals("Sean", developer.getName());
    }
    @Test
    public void hasniNumber(){
        assertEquals("X1 223 45 667", developer.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(32000, developer.getSalary(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(8000);
        assertEquals(40000, developer.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(320, developer.payBonus(), 0.0);
    }
}

