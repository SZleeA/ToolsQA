package Pages.Wigets;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordianPage extends BaseTest {

    public AccordianPage () {
        PageFactory.initElements(driver,this);
    }
    @FindBy (id = "section1Heading")
    public  WebElement section1Heading;

    @FindBy (id = "section1Content")
    public  WebElement getSection1Content;
    @FindBy (id = "section2Heading")
    public WebElement section2Heading;

    @FindBy (id = "section2Content")
    public WebElement section2Content;

    @FindBy (id = "section3Heading")
    public  WebElement section3Heading;

    @FindBy (id = "section3Content")
    public  WebElement getSection3Content;

    //======================================
    public void clickOnSection1 () {
        section1Heading.click();
    }
    public void clickOnSection2 () {
        section2Heading.click();
    }
    public void clickOnSection3 () {
        section3Heading.click();
    }


}
