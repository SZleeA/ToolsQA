package Tests;

import Base.BaseTest;
import Pages.Elements.RadioButtonPage;
import Pages.Elements.TextBoxPage;
import Pages.SidebarPage;
import org.apache.poi.ss.formula.functions.T;
import org.bouncycastle.crypto.agreement.srp.SRP6Client;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;

    public TextBoxTest() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void pageSetUp() {
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
        sidebarPage.clickOnSideCard("Elements");
    }

    @Test
    public void userCanFillTextBox() {
        sidebarPage.clickOnButton("Text Box");
        String userName = excelReader.getStringData("TextBox", 1,0);
        String email = excelReader.getStringData("TextBox", 1,1);
        String currentAddress = excelReader.getStringData("TextBox", 1,2);
        String permanentAddress = excelReader.getStringData("TextBox", 1,3);
        textBoxPage.enterFullNameInNameField(userName);
        textBoxPage.enterUserEmailInUserEmailField(email);
        textBoxPage.enterAddressInCurrentAddressField(currentAddress);
        textBoxPage.enterAddressInPermanetntAddressField(permanentAddress);
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.nameassertation.isDisplayed());
    }

}
