package Amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAllOptionsPage extends TestBasePage {
    @Test
        public void testPharmacyPage(){
            Homepage homepage = new Homepage();
            AllOptionsPage allOptionsPage = homepage.selectAllOption();
allOptionsPage.pharmacyButton.click();



    }
}
