package testAmazon;

import amazon.Homepage;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class TestGiftCardPage extends TestBasePage{



    @Test
        public void testNavToGiftCard() {
            Homepage homepage = new Homepage();
            homepage.navigateToGiftCardPage();
        }
    }


