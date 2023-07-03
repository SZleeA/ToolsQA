package Tests;

import Base.BaseTest;
import Pages.Elements.ButtonsPage;
import Pages.Elements.RadioButtonPage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {
    public SidebarPage sidebarPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;

    @BeforeMethod
    public void pageSetUp () {
        buttonsPage = new ButtonsPage();
        radioButtonPage = new RadioButtonPage();
        sidebarPage = new SidebarPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
        sidebarPage.clickOnSideCard("Elements");

    }
    @Test(priority = 10)
    public void testRadioButtonYes()  {
        sidebarPage.clickOnButton("Radio Button");
        radioButtonPage.clickOnRadioButtonOnRadioButtonPage("Yes");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
        Assert.assertTrue(radioButtonPage.message.isDisplayed());
        Assert.assertEquals(radioButtonPage.text.getText(), "Yes");
    }
    @Test(priority = 20)
    public void testRadioButtonImpressive()  {
        sidebarPage.clickOnButton("Radio Button");
        radioButtonPage.clickOnRadioButtonOnRadioButtonPage("Impressive");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
        Assert.assertTrue(radioButtonPage.message.isDisplayed());
        Assert.assertEquals(radioButtonPage.text.getText(), "Impressive");
    }
    @Test(priority = 30)
    public void testRadioButtonNo () {
        sidebarPage.clickOnButton("Radio Button");
        Assert.assertTrue(radioButtonPage.noButton.isDisplayed());
        Assert.assertFalse(radioButtonPage.noButton.isSelected());
    }
    @Test
    public void testButtons () {
        sidebarPage.clickOnButton("Buttons");
        buttonsPage.clickDoubleClickButton();
        buttonsPage.clickRightClickButton();
        buttonsPage.clickClickMeButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
        Assert.assertTrue(buttonsPage.doubleClickMessage.isDisplayed());
        Assert.assertTrue(buttonsPage.rightClickMessage.isDisplayed());
        Assert.assertTrue(buttonsPage.clickMeMessage.isDisplayed());
    }

}
