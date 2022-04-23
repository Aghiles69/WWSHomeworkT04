package test_base.testAmazon;

import amazon.BooksPage;
import amazon.CelebrityPicks;
import amazon.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestCelebrityPicks extends TestBasePage {

    @Test
    public void testCelebrityPicks() {
        Homepage homepage = new Homepage();
        BooksPage celebrityPicks = homepage.navigateToBooksPage();
        celebrityPicks.clickOnElement(homepage.CelebPicksButton);

    }

    @Test
    public void clickOnElement(WebElement CalebPicksButton) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(CalebPicksButton));
        CalebPicksButton.click();
    }
}
