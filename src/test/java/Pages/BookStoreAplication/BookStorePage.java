package Pages.BookStoreAplication;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookStorePage extends BaseTest {

    public BookStorePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy (className = "mr-2")
    public List<WebElement> books;

    @FindBy (id = "addNewRecordButton")
    public List<WebElement> addButton;
    @FindBy (id = "login")
    public WebElement loginButton;

    //======================================================================

    public void selectBookGitPocketGuide() {
        for (int i = 0; i < books.size(); i++) {
            books.get(0).click();
        }
    }
    public void selectLearningJavaScriptDesignPatterns () {
        for (int i = 0; i < books.size(); i++) {
            books.get(1).click();
        }
    }
    public void selectDesigningEvolvableWebAPIs () {
        for (int i = 0; i < books.size(); i++) {
            books.get(2).click();
        }
    }
    public void selectSpeakingJavaScript () {
        for (int i = 0; i < books.size(); i++) {
            books.get(3).click();
        }
    }
    public void selectYouDontKnowJS () {
        for (int i = 0; i < books.size(); i++) {
            books.get(4).click();
        }
    }
    public void selectProgrammingJavaScriptApplications () {
        for (int i = 0; i < books.size(); i++) {
            books.get(5).click();
        }
    }
    public void clickAddButton() {
        for (int i = 0; i < addButton.size(); i++) {
            addButton.get(1).click();
        }
    }
    public void clickOnLoginButton () {
        loginButton.click();
    }


}
