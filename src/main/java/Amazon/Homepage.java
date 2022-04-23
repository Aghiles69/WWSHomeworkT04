package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {


    @FindBy(xpath = "//a[@href='javascript: void(0)']")
    public WebElement allOptionPage;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public AllOptionsPage selectAllOption() {
        clickOnElement(allOptionPage);

        return new AllOptionsPage();
    }
}
