package Pages.Forms;

import Base.BaseTest;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BaseTest {

    public PracticeFormPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "firstName")
    public WebElement firstNameField;

    @FindBy (id = "lastName")
    public WebElement lastnameField;

    @FindBy (id = "userEmail")
    public WebElement emailField;

    @FindBy (className = "custom-control-input")
    public List<WebElement> radioButton;

    @FindBy (id = "userNumber")
    public WebElement mobileFileld;
    @FindBy (id = "dateOfBirthInput")
    public WebElement dateOfBirthField;

    @FindBy (id = "subjectsContainer")
    public WebElement subjectField;

    @FindBy (id = "hobbies-checkbox-3")
    public WebElement hobieMusic;


    //==========================================

    public void inputTextInFirstNameField(String s) {
        firstNameField.clear();
        firstNameField.sendKeys(s);
    }
    public void inputTextInLastNameField(String s) {
        lastnameField.clear();
        lastnameField.sendKeys(s);
    }

    public  void inputTextInEmailField(String s) {
        emailField.clear();
        emailField.sendKeys(s);
    }

    public void clickOnRadioButtonOnPracticeForm (String radioButtonName) {
        for (int i = 0; i < radioButton.size(); i++) {
            if (radioButton.get(i).getText().equals(radioButtonName)) {
                scrollIntoView(radioButton.get(i));
                radioButton.get(i).click();
                break;
            }
        }
    }
    public void inputNumberInMobileField(String number) {
        mobileFileld.clear();
        mobileFileld.sendKeys(number);
    }

    public void inputDateOfBirthInTheField() {
        dateOfBirthField.clear();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('dateOfBirthInput').setAttribute('Value', '30 Apr 2000')");
    }

    public void inputDateOfBirthInTheField2 (String date) {
        dateOfBirthField.sendKeys(Keys.CONTROL + "a");
        dateOfBirthField.sendKeys(Keys.DELETE);
        dateOfBirthField.sendKeys(date);
        dateOfBirthField.sendKeys(Keys.TAB);
    }

    public void enterSubjectInSubjectField (String s) {
        subjectField.click();
        subjectField.clear();
        subjectField.sendKeys(s);
        subjectField.sendKeys(Keys.TAB);
    }

    public void selectHobbiesMusic () {
        hobieMusic.click();
    }


}
