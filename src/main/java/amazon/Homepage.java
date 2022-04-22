package amazon;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Homepage extends BasePage {
    @FindBy(css = "#searchDropdownBox")
    public WebElement dropMenu;

    @FindBy(xpath = "//div//select[@option=search-alias=gift-cards]")
    public WebElement giftCardOptionInAllDM;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    public GiftCardPage navigateToGiftCardPage(){
       clickOnElement(dropMenu);



    return new GiftCardPage();
    }


}
