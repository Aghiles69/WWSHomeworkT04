package amazon;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;


public class GiftCardPage extends BasePage {
    private static final String URL = "https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dgift-cards&field-keywords=&ref=nb_sb_noss&crid=35QRDOC18MX75&sprefix=%2Cgift-cards%2C217";

    Homepage homepage = new Homepage();

    @FindBy(xpath = "//a[@href=\"/b/ref=s9_acss_bw_cg_GCLPOC21_2b1_w?node=2973106011&pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-4&pf_rd_r=ENY5BAZGXJ9J7HPN2ZN0&pf_rd_t=101&pf_rd_p=84fc23b2-83ac-4bac-bf3c-a634b44a1482&pf_rd_i=2238192011\"]")
    public WebElement BirthdayButton;

    @FindBy(xpath = "//a[@href=\"/gift-cards/b/?ie=UTF8&node=2238192011&ref_=topnav_storetab_gc_sv_main\"]")
    public WebElement flyoutSubNavElement;

    @FindBy(xpath = "//a[@href=\"/s?bbn=2238192011&rh=n%3A2238192011%2Cp_36%3A2661612011&dc&qid=1650700279&rnid=2661611011&ref=lp_2864120011_nr_p_36_0\"]")
    public WebElement pricesFilterMenu;

    @FindBy(xpath = "//a[@href=\"/s?bbn=2238192011&rh=n%3A2238192011%2Cp_36%3A2661614011&dc&qid=1650700279&rnid=2661611011&ref=lp_2864120011_nr_p_36_2\"]")
    public WebElement wantedPriceFilter;


    public void preSetUp2() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnBDayButton() {
        clickOnElement(BirthdayButton);
    }

    SoftAssert softAssert = new SoftAssert();

    public void mouseOverGiftCardPageHeader() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated((By) flyoutSubNavElement));
        Actions action = new Actions(driver);
        action.moveToElement(flyoutSubNavElement);

    }

    public void selectFilerForPriceRange(){
        preSetUp2();
        clickOnElement(wantedPriceFilter);
    }


}
