package amazon;
import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends BasePage {

    @FindBy(xpath = "//*[@id='nav-xshop']/a[11]")
    public WebElement BooksButton;

    @FindBy(xpath = "//*[@id='contentGrid_933884']/div/div/div[2]/div/div/a")
    public WebElement CelebPicksButton;


    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public BooksPage navigateToBooksPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-xshop']/a[11]")));
        clickOnElement(BooksButton);

        return new BooksPage();
    }
    public CelebrityPicks selectCelebrityPicks() {
        clickOnElement(CelebPicksButton);

        return new CelebrityPicks();
    }
}

