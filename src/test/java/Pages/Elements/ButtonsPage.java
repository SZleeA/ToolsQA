package Pages.Elements;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ButtonsPage extends BaseTest {

    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }
    Actions act = new Actions(driver);

    @FindBy (css = ".btn.btn-primary")
    public List<WebElement> listOfButtons;


    @FindBy (id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy (id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy (id = "dynamicClickMessage")
    public WebElement clickMeMessage;


    //==============================================

    public void clickDoubleClickButton () {
        act.doubleClick(listOfButtons.get(0)).perform();
    }
    public void clickRightClickButton () {
        act.contextClick(listOfButtons.get(1)).perform();
    }
    public void clickClickMeButton () {
        listOfButtons.get(2).click();
    }
}