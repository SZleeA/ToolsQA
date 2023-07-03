package Pages.BookStoreAplication;

import Base.BaseTest;
import jdk.dynalink.linker.LinkerServices;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilPage extends BaseTest {

    public ProfilPage () {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "userName-value")
    public WebElement profileName;

    @FindBy (id = "submit")
    public WebElement logoutButton;

    @FindBy (xpath = "//*[@id=\"notLoggin-label\"]/a[1]")
    public WebElement loginLink;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]/button")
    public WebElement deleteAllBooksButton;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement closeSmallModalOkButton;

    @FindBy (id = "submit")
    public List<WebElement> buttonList;



    //==========================================

    public void clickOnLoginLink () {
        loginLink.click();
    }
    public void clickOnOkSmallModalButton () {
        closeSmallModalOkButton.click();
    }
    public void clickOnDeleteAllBooksButton () {
        for (int i = 0; i <buttonList.size(); i++) {
            buttonList.get(4).click();
        }

    }


}
