package amazon;

import org.testng.annotations.Test;
import test_base.TestBasePage;
@Test
public class TestGiftCardPage extends TestBasePage {
    public void testNavigateToGiftCard(){
        Homepage homepage = new Homepage();
       GiftCardPage giftCardPage= homepage.navigateToGiftCardPage();

    }

}
