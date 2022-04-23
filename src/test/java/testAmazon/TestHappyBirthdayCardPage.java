package testAmazon;

import amazon.GiftCardPage;
import amazon.Homepage;
import org.testng.annotations.Test;
import test_base.TestBasePage;

import static org.testng.Assert.*;

public class TestHappyBirthdayCardPage extends TestBasePage {


    @Test
    public void navToBDCardByUsingAButton() {
        GiftCardPage gcpInsAddy = new GiftCardPage();
        gcpInsAddy.clickOnBDayButton();

    }

}