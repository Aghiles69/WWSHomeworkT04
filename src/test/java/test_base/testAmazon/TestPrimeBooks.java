package test_base.testAmazon;
import amazon.BooksPage;
import amazon.Homepage;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestPrimeBooks extends TestBasePage {


    @Test
    public void selectPrimeButton() {
        Homepage homepage = new Homepage();
        BooksPage primeBooks = homepage.navigateToBooksPage();

    }
}
