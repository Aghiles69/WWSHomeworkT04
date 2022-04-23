package testAmazon;

import amazon.GiftCardPage;
import amazon.Homepage;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class testNavToBDayPage extends TestBasePage {

    @Test
    public void testNavToGiftCard() {
        GiftCardPage giftCardPage = new GiftCardPage();
        giftCardPage.clickOnBDayButton();

    }
}


