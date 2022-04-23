package testAmazon;

import amazon.GiftCardPage;

import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestMouseOverFuncInGCP extends TestBasePage {
    @Test
    public void moveOverAFlyoutElement(){
       GiftCardPage giftCardPage = new GiftCardPage();
       giftCardPage.mouseOverGiftCardPageHeader();


    }

}
