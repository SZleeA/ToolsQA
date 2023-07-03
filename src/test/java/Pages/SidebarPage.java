package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".card.mt-4.top-card")
    public List<WebElement> cards;

    @FindBy(className = "text")
    public List<WebElement> button;

    //========================================

    public void clickOnButton(String buttonName) {
        for (int i = 0; i < button.size(); i++) {
            if (button.get(i).getText().equals(buttonName)) {
                scrollIntoView(button.get(i));
                button.get(i).click();
                break;
            }
        }
    }

    public void clickOnSideCard(String s) {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals(s)) {
                scrollIntoView(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }






}
