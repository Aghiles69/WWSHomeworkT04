package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PharmacyPage extends BasePage {
    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div/div[1]/div/div/div/div[2]/div/nav/ul/li[1]/a")
    public WebElement shopAllButton;
}
