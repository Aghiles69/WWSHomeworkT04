package testAmazon;

import amazon.GiftCardPage;
import test_base.TestBasePage;

public class TestRangePricesFilters extends TestBasePage {

    public void testPriceFilterFunc(){
        GiftCardPage giftCardPage = new GiftCardPage();
        giftCardPage.selectFilerForPriceRange();

    }
}
