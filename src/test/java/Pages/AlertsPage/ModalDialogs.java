package Pages.AlertsPage;

import Base.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogs extends BaseTest {

    public ModalDialogs() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "showSmallModal")
    public WebElement smallDialogButton;

    @FindBy (id = "showLargeModal")
    public WebElement largeDialogButton;

    @FindBy (id = "example-modal-sizes-title-sm")
    public WebElement smallDialogMessage;

    @FindBy (id = "example-modal-sizes-title-lg")
    public  WebElement largeDialogMessage;

    @FindBy (id = "closeSmallModal")
    public WebElement smallDialogCloseButton;

    @FindBy (id = "closeLargeModal")
    public WebElement largeDialogCloseButton;


    //=====================================

    public void clockOnSmallDialogButton () {
        smallDialogButton.click();
    }
    public void  clickOnLargeDialogButton () {
        largeDialogButton.click();
    }

    public void slickSmallDialogCloseButon () {
        smallDialogCloseButton.click();
    }

    public void largeDialogCloseButton () {
        largeDialogCloseButton.click();
    }

}
