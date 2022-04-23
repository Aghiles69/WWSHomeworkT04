package Amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.security.cert.X509Certificate;
import java.util.WeakHashMap;

public class AllOptionsPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[27]/a")
    public WebElement pharmacyButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement supportSearchBar;


    public AllOptionsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}