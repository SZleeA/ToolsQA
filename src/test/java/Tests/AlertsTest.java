package Tests;

import Base.BaseTest;
import Pages.AlertsPage.AlertsPage;
import Pages.AlertsPage.ModalDialogs;
import Pages.SidebarPage;
import jdk.jfr.Description;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class AlertsTest extends BaseTest {
    public SidebarPage sidebarPage;
    public AlertsPage alertsPage;
    public ModalDialogs modalDialogs;
    //Set<String> allWindowHandles = driver.getWindowHandles();
    public AlertsTest() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void PageSetUp() {
        modalDialogs = new ModalDialogs();
        alertsPage = new AlertsPage();
        sidebarPage = new SidebarPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test
    public void browserWindowsTest() {


    }

    @Test
    public void alertTest() throws InterruptedException {
        sidebarPage.clickOnSideCard("Alerts, Frame & Windows");
        sidebarPage.clickOnButton("Alerts");
        alertsPage.clickAlertButton();
        driver.switchTo().alert().accept();
        alertsPage.clickAlertButton5sec();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        alertsPage.clickConformationButton();
        driver.switchTo().alert().accept();
        Assert.assertTrue(alertsPage.conformationMessage.isDisplayed());
        alertsPage.clickPromptButton();
        driver.switchTo().alert().sendKeys("Aleksandar");
        driver.switchTo().alert().accept();
        Assert.assertTrue(alertsPage.conformationMessage2.isDisplayed());
    }

    @Test
    public void modalDialogsTest() {
        sidebarPage.clickOnSideCard("Alerts, Frame & Windows");
        sidebarPage.clickOnButton("Modal Dialogs");
        modalDialogs.clockOnSmallDialogButton();
        waitForVisibility(modalDialogs.smallDialogMessage);
        Assert.assertTrue(modalDialogs.smallDialogMessage.isDisplayed());
        modalDialogs.slickSmallDialogCloseButon();
        modalDialogs.clickOnLargeDialogButton();
        waitForVisibility(modalDialogs.largeDialogMessage);
        Assert.assertTrue(modalDialogs.largeDialogMessage.isDisplayed());
        modalDialogs.largeDialogCloseButton();
    }


}
