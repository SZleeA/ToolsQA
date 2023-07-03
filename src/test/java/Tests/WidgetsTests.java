package Tests;

import Base.BaseTest;
import Pages.BookStoreAplication.LoginPage;
import Pages.BookStoreAplication.ProfilPage;
import Pages.SidebarPage;
import Pages.Wigets.AccordianPage;
import Pages.Wigets.DatePickerPage;
import Pages.Wigets.SliderPage;
import Pages.Wigets.TabsPage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WidgetsTests extends BaseTest {
    public ProfilPage profilPage;
    public  LoginPage loginPage;
    public SidebarPage sidebarPage;
    public AccordianPage accordianPage;
    public DatePickerPage datePickerPage;
    public TabsPage tabsPage;
    public SliderPage sliderPage;

    public WidgetsTests () {
        PageFactory.initElements(driver,this);
    }

    @BeforeMethod
    public void PageSetUp() {
        sliderPage = new SliderPage();
        tabsPage = new TabsPage();
        datePickerPage = new DatePickerPage();
        profilPage = new ProfilPage();
        loginPage = new LoginPage();
        sidebarPage = new SidebarPage();
        accordianPage = new AccordianPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
        sidebarPage.clickOnSideCard("Widgets");
    }
    @Test
    public void accordianCardsExpand () {
        sidebarPage.clickOnButton("Accordian");
        accordianPage.getSection1Content.isDisplayed();
        accordianPage.clickOnSection2();
        accordianPage.section2Content.isDisplayed();
        accordianPage.clickOnSection3();
        accordianPage.getSection3Content.isDisplayed();
    }

    @Test
    public void datePicker() {
        sidebarPage.clickOnButton("Date Picker");
        datePickerPage.setDatePicker("1/3/2000");
        //Assert.assertEquals(datePickerPage.datePicker.getText(), "1/3/2000");
    }
    @Test
    public void dateAndTimePicker() {
        sidebarPage.clickOnButton("Date Picker");
        datePickerPage.setDateAndTimePicker("1/3/2000 13:30 AM");
        //Assert.assertEquals(datePickerPage.datePicker.getText(), "1/3/2000");
    }


    @Test
    public void tabsCanBeExpanded () {
        sidebarPage.clickOnButton("Tabs");
        tabsPage.clickOnTabWhat();
        Assert.assertTrue(tabsPage.tabWhatCntent.isDisplayed());
        tabsPage.clickOnTabOrigin();
        Assert.assertTrue(tabsPage.tabOriginContent.isDisplayed());
        tabsPage.clickOnTabUse();
        Assert.assertTrue(tabsPage.tabUseContent.isDisplayed());
    }

    @Test
    public void sliderIsMovable () {
        sidebarPage.clickOnButton("Slider");
        sliderPage.moveSliderLeft(25);
        String value1 = sliderPage.sliderValueField.getAttribute("Value");
        Assert.assertEquals(value1, "0");
        sliderPage.moveSliderLeft(10);
        String value2 = sliderPage.sliderValueField.getAttribute("Value");
        Assert.assertEquals(value2, "0");
        sliderPage.moveSliderRight(75);
        String value3 = sliderPage.sliderValueField.getAttribute("Value");
        Assert.assertEquals(value3, "75");
        sliderPage.moveSliderRight(35);
        String value4 = sliderPage.sliderValueField.getAttribute("Value");
        Assert.assertEquals(value4, "100");
    }


}
