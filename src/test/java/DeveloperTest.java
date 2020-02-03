import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John Smith", 54321, 15000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("John Smith", developer.getName());
    }
    @Test
    public void canGetSocialSecurity(){
        assertEquals(54321, developer.getSocialSecurity());
    }
    @Test
    public void canGetSalary(){
        assertEquals(15000.00, developer.getSalary(), 0.00001);
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000.00);
        assertEquals(16000.00, developer.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(150, developer.payBonus(), 0.00);
    }
}
