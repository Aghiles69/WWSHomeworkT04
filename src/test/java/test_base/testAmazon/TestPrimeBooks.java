package test_base.testAmazon;
import amazon.BooksPage;
import amazon.Homepage;
import amazon.PrimeBooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestPrimeBooks extends TestBasePage {


    @Test
    public void selectPrimeButton() {
        Homepage homepage = new Homepage();
        BooksPage primeBooks = homepage.navigateToBooksPage();
        primeBooks.clickOnElement(primeBooks.BooksButton);

}

     //   Assert.assertTrue(selectPrimeButton.IsSelected());



}
