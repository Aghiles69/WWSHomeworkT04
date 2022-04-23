package test_base.testAmazon;
import amazon.BooksPage;
import amazon.Homepage;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestBooksPage extends TestBasePage {

    @Test
    public void navigateToBooksPage() {
        Homepage homepage = new Homepage();
        BooksPage booksPage = homepage.navigateToBooksPage();
    }
}
