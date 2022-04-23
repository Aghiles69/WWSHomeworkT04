package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeBooks extends BasePage {

    private static final String URL =
            "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books";

    @FindBy(xpath = "//*[@id=/'s-refinements/']/div[10]/ul/li/span/a/div/label/input")
    public WebElement PrimeButton;

    public PrimeBooks() {
        webDriverWait.until(ExpectedConditions.urlToBe(URL));
        PageFactory.initElements(driver, this);
    }

    public void selectPrimeButton() {
        clickOnElement(PrimeButton);
    }

         //    Assert.

}