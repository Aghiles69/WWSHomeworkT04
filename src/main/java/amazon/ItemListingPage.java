package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ItemListingPage extends BasePage {

    @FindBy(id="a-autoid-2-announce")
    public WebElement quantityComboBox;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    public ItemListingPage(){
        PageFactory.initElements(driver,this );
    }

    public amazon.ShoppingCartPage selectQuantityAddItemToCart(String quantity){
        selectQuantityByVisibleTex(quantity);
        clickAddToCartButton();

      webDriverWait.until(ExpectedConditions.titleIs("Amazon.com Shopping Cart"));
        return new amazon.ShoppingCartPage();

    }

    public void selectQuantityByVisibleTex(String text){
        Select select= new Select(quantityComboBox);
        select.selectByVisibleText(text);


    }


    public void clickAddToCartButton(){
        addToCartButton.click();
    }
}
