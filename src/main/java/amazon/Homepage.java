package amazon;

import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BasePage {
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(id = "searchDropdownBox")
    public WebElement DropDownList;


    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;


    public Homepage() {
        PageFactory.initElements(driver, this);    //(driver,Homepage.class);
    }

    public SearchResultPage doSearch(String searchTerm) {
        typeOnSearchBar(searchTerm);
        clickSearchButton();
        clickDropDownList();
        return new SearchResultPage();
    }


    public void typeOnSearchBar(String input) {

        searchBar.sendKeys(input);
    }

    public void clickSearchButton() {
        searchButton.click();
    }
    public void clickDropDownList(){
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby");
    }
}
