package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BestSellesPage extends BasePage {
    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AMAZON_FASHION/2022/SITE_FLIPS/SPR_22/BROWSE/L0/desktop/L0_DT_HERO_01W-v2.jpg']")
    public WebElement mainFashionImage;

    public BestSellesPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}
