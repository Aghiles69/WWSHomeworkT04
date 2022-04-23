package Amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestPharmacyPage extends TestBasePage {

    @Test
    public void testPharmacyPage() {
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.pharmacyButton.click();
    }

    @Test
    public void testPharmacyUrl() {
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.pharmacyButton.click();
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testPharmacyPageTitle() {
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.pharmacyButton.click();
        System.out.println(driver.getTitle());
    }
    @Test
    public void testSearchbar() {
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.supportSearchBar.sendKeys("Pharmacy");

    }
}
