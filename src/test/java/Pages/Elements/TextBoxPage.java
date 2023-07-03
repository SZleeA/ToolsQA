package Pages.Elements;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends BaseTest {

    public TextBoxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "userName")
    public WebElement userNameField;

    @FindBy (id = "userEmail")
    public  WebElement userEmailField;

    @FindBy (id = "currentAddress")
    public  WebElement currentAddressField;

    @FindBy (id = "permanentAddress")
    public WebElement permanentAddressField;

    @FindBy (id = "submit")
    public WebElement submitButton;

    @FindBy (id = "name")
    public WebElement nameassertation;


    //=====================================

    public void enterFullNameInNameField (String s) {
        userNameField.sendKeys(s);
    }

    public void enterUserEmailInUserEmailField (String s) {
        userEmailField.sendKeys(s);
    }

    public void enterAddressInCurrentAddressField (String s) {
        currentAddressField.sendKeys(s);
    }

    public void enterAddressInPermanetntAddressField (String s) {
        permanentAddressField.sendKeys(s);
    }

    public void clickOnSubmitButton () {
        submitButton.click();
    }
















}
