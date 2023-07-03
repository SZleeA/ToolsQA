package Pages.Wigets;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import java.nio.file.WatchEvent;

public class TabsPage extends BaseTest {

    public TabsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "demo-tab-what")
    public WebElement tabWhat;

    @FindBy(id = "demo-tab-origin")
    public WebElement tabOrigin;

    @FindBy(id = "demo-tab-use")
    public WebElement tabUse;

    @FindBy (id = "demo-tabpane-what")
    public WebElement tabWhatCntent;

    @FindBy (id = "demo-tabpane-origin")
    public WebElement tabOriginContent;

    @FindBy (id = "demo-tabpane-use")
    public  WebElement tabUseContent;
    //=================================
    public void clickOnTabWhat () {
        tabWhat.click();
    }
    public void clickOnTabOrigin () {
        tabOrigin.click();
    }
    public void clickOnTabUse () {
        tabUse.click();
    }

}