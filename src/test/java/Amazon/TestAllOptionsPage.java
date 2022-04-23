package Amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAllOptionsPage extends TestBasePage {
    @Test
    public void testNavigateToFireTv(){
        Homepage homepage = new Homepage();
        AllOptionsPage allOptionsPage = homepage.selectAllOption();
        allOptionsPage.fireTv.click();
        allOptionsPage.fireTvSupport.click();
        allOptionsPage.supportSearchBar.sendKeys("Streaming");
        allOptionsPage.supportSearchBar.submit();

        String expectedText = "Streaming";
        String text = driver.findElement(By.xpath("//*[@id=\"search-help\"]/div/p/b")).getText();
        System.out.println(text);
        Assert.assertEquals(expectedText, text);
    }
}
