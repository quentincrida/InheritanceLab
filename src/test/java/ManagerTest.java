import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bill Evans", 123456, 32000, "Electronics");
    }
    @Test
    public void getName(){
        assertEquals("Bill Evans", manager.getName());
    }
    @Test
    public void getSocialSecurity(){
        assertEquals(123456, manager.getSocialSecurity());
    }
    @Test
    public void getSalary(){
        assertEquals(32000, manager.getSalary());
    }
    @Test
    public void getDeptName() {
        assertEquals("Electronics", manager.getDeptName());
    }
    @Test

    public void getRaiseSalary(){
        manager.raiseSalary(3200);
        assertEquals(35200, manager.getSalary(), 0.01);
    }
    @Test
    public void getPayBonus(){
        assertEquals(320, manager.payBonus(), 0.01);

    }


}
