package amazon;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static base.BasePage.driver;

public class SearchResultPage{

    @FindBy(className = "a-color-state a-text-bold")
    public WebElement searchTerm;


    //@FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    //public WebElement searchTerm;
    // Safety 1st Plug Protectors, 36 Count
    @FindBy(className = "//div[@class='a-section aok-relative s-image-square-aspect']")
    public WebElement firstResult;


    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm() {
        String searchTermString = searchTerm.getText().toLowerCase();
        return searchTermString.substring(1, searchTermString.length() - 1);
    }
    public ItemListingPage clickFirstSearchResult(){
        firstResult.click();
        return new ItemListingPage();
    }
}