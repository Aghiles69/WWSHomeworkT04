package amazon;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CelebrityPicks<expectedText, text> extends BasePage {
    final static String url = "https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books";

    @FindBy(xpath = "//*[@id='contentGrid_933884']/div/div/div[2]/div/div/a")
    public WebElement CelebPicksButton;

    public CelebrityPicks() {
        webDriverWait.until(ExpectedConditions.urlContains(url));
        PageFactory.initElements(driver, this);
    }

    public void clickOnElement(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}