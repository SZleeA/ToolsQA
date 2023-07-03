package Pages.Elements;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioButtonPage extends BaseTest {

    public RadioButtonPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (className = "custom-control-label")
    List<WebElement> radioButtons;
    @FindBy(className = "mt-3")
    public WebElement message;

    @FindBy (className = "text-success")
    public WebElement text;
    @FindBy (css = ".custom-control.disabled.custom-radio.custom-control-inline")
    public WebElement noButton;

    //===========================================================================

    public void clickOnRadioButtonOnRadioButtonPage(String buttonName) {
        for (int i = 0; i < radioButtons.size(); i++) {
            if (radioButtons.get(i).getText().equals(buttonName)) {
                scrollIntoView(radioButtons.get(i));
                radioButtons.get(i).click();
                break;
            }
        }
    }
}
