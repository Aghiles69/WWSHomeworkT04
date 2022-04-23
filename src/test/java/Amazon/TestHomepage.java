package Amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestHomepage extends TestBasePage {
    @Test
    public void testAccessToAllOptionPage(){
        Homepage homepage = new Homepage();
        homepage.selectAllOption();
    }
}
