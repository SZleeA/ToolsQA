package Pages.AlertsPage;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends BaseTest {

    public AlertsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "alertButton")
    public WebElement alertButton;

    @FindBy (id = "timerAlertButton")
    public  WebElement alertButton5sec;

    @FindBy (id = "confirmButton")
    public  WebElement conformationButton;

    @FindBy (id = "promtButton")
    public WebElement promptButton;

    @FindBy (id = "confirmResult")
    public WebElement conformationMessage;

    @FindBy (id = "promptResult")
    public  WebElement conformationMessage2;

    //====================================

    public void clickAlertButton () {
        alertButton.click();
    }
    public void clickAlertButton5sec () {
        alertButton5sec.click();
    }
    public void clickConformationButton () {
        conformationButton.click();
    }
    public void clickPromptButton () {
        promptButton.click();
    }





}
