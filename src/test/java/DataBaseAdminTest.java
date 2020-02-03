import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DataBaseAdminTest {
    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Jane Smith", 13250, 14000.00);
    }
    @Test
    public void canGetName(){
        assertEquals("Jane Smith", dataBaseAdmin.getName());
    }
    @Test
    public void canGetSocialSecurity(){
        assertEquals(13250, dataBaseAdmin.getSocialSecurity());
    }
    @Test
    public void canGetSalary(){
        assertEquals(14000.00, dataBaseAdmin.getSalary(), 0.00001);
    }
    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(1000.00);
        assertEquals(15000.00, dataBaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(140, dataBaseAdmin.payBonus(), 0.00);
    }
}
