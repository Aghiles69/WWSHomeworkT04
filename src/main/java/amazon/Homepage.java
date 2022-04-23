package amazon;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Homepage extends BasePage {
    @FindBy(xpath = "//div[@id=\"nav-search-dropdown-card\"]")
    public WebElement allDropMenu;

    @FindBy(xpath = "//div//select[@option=search-alias=gift-cards]")
    public WebElement giftCardOptionInAllDM;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;



    public void clickOnDrop() throws NullPointerException {
        preSetUp();
        clickOnElement(allDropMenu);


        //switchTabs();
        // driver.switchTo().alert().dismiss();
        // try {

        // } catch(NullPointerException e)
        //{
        // System.out.print("NullPointerException Caught");
        //}
        //clickOnElement(giftCardOptionInAllDM);
        //clickOnElement(searchButton);


    }

    public void selectGiftCardOption() throws NullPointerException {
       clickOnDrop();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//select[@option=search-alias=gift-cards]")));
        clickOnElement(giftCardOptionInAllDM);
    }

    public void clickOnSearchIcon() throws NullPointerException {
        clickOnElement(searchButton);
    }
    public void navigateToGiftCardPage(){
        selectGiftCardOption();
        clickOnSearchIcon();
    }
    public  void preSetUp() {
        PageFactory.initElements(driver, this);
    }


}