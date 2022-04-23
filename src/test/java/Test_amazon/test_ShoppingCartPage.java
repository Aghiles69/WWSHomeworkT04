package Test_amazon;

import amazon.Homepage;
import amazon.Homepage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_ShoppingCartPage extends BasePage {
    @Test
    public void testAddItemToCart() {
        Homepage homepage = new Homepage();
        String searchTerm = ("Safety 1st Plug Protectors");
        Assert.assertTrue(homepage.doSearch(searchTerm)
                .clickFirstSearchResult()
                .selectQuantityAddItemToCart("3")
                .confirmationMessage.isDisplayed());
    }
}