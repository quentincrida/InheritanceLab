import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Brendan Jones", 99876, 55000.00, 2000000.00);
    }
    @Test
    public void getName(){
        assertEquals("Brendan Jones", director.getName());
    }
    @Test
    public void getSocialSecurity(){
        assertEquals(99876, director.getSocialSecurity());
    }
    @Test
    public void getSalary(){
        assertEquals(55000, director.getSalary(), 0.001);
    }
    @Test
    public void getBudget(){
        assertEquals(2000000, director.getBudget(), 0.09);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(60000, director.getSalary(), 0.05);
    }
}
