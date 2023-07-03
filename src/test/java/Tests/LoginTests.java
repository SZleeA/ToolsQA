package Tests;

import Base.BaseTest;
import Pages.BookStoreAplication.BookStorePage;
import Pages.BookStoreAplication.LoginPage;
import Pages.BookStoreAplication.ProfilPage;
import Pages.SidebarPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    public SidebarPage sidebar;
    public LoginPage loginPage;
    public ProfilPage profilPage;
    public BookStorePage bookStorePage;
    String ValidUsername;
    String ValidPassword;
    String InvalidUsername;
    String InvalidPassword;

    public LoginTests() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void PageSetUp() {
        bookStorePage = new BookStorePage();
        profilPage = new ProfilPage();
        loginPage = new LoginPage();
        sidebar = new SidebarPage();
        driver.manage().window().maximize();
        driver.get(homeURL);

    }

    @Test
    public void userCanLogInFromLoginPageWithValidCredentials() {
        sidebar.clickOnSideCard("Book Store Application");
        sidebar.clickOnButton("Login");
        ValidUsername = excelReader.getStringData("Credentials", 1, 0);
        ValidPassword = excelReader.getStringData("Credentials", 1, 1);
        loginPage.insertUsername(ValidUsername);
        loginPage.insertPassword(ValidPassword);
        loginPage.clickOnLoginButton();
        waitForVisibility(profilPage.profileName);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
        Assert.assertTrue(profilPage.profileName.isDisplayed());
        Assert.assertTrue(profilPage.logoutButton.isDisplayed());
    }

    @Test
    public void userCanLogInFromBookStorePageWithValidCredentials () {
        sidebar.clickOnSideCard("Book Store Application");
        sidebar.clickOnButton("Book Store");
        bookStorePage.clickOnLoginButton();
        ValidUsername = excelReader.getStringData("Credentials", 1, 0);
        ValidPassword = excelReader.getStringData("Credentials", 1, 1);
        loginPage.insertUsername(ValidUsername);
        loginPage.insertPassword(ValidPassword);
        loginPage.clickOnLoginButton();
        waitForVisibility(profilPage.profileName);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
        Assert.assertTrue(profilPage.profileName.isDisplayed());
        Assert.assertTrue(profilPage.logoutButton.isDisplayed());
    }

    @Test
    public void userCanLoginFromProfilePage() {
        sidebar.clickOnSideCard("Book Store Application");
        sidebar.clickOnButton("Profile");
        profilPage.clickOnLoginLink();
        ValidUsername = excelReader.getStringData("Credentials", 1, 0);
        ValidPassword = excelReader.getStringData("Credentials", 1, 1);
        loginPage.insertUsername(ValidUsername);
        loginPage.insertPassword(ValidPassword);
        loginPage.clickOnLoginButton();
        waitForVisibility(profilPage.profileName);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
        Assert.assertTrue(profilPage.profileName.isDisplayed());
        Assert.assertTrue(profilPage.logoutButton.isDisplayed());
    }
    @Test
    public void userCanLogOut() {
        sidebar.clickOnSideCard("Book Store Application");
        sidebar.clickOnButton("Login");
        ValidUsername = excelReader.getStringData("Credentials", 1, 0);
        ValidPassword = excelReader.getStringData("Credentials", 1, 1);
        loginPage.insertUsername(ValidUsername);
        loginPage.insertPassword(ValidPassword);
        loginPage.clickOnLoginButton();
        waitForVisibility(profilPage.logoutButton);
        Assert.assertTrue(profilPage.logoutButton.isDisplayed());
        profilPage.logoutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
        Assert.assertTrue(loginPage.loginButton.isDisplayed());
    }

    @Test
    public void userCanNotLoginWithInvalidUserName() {
        sidebar.clickOnSideCard("Book Store Application");
        sidebar.clickOnButton("Login");
        for (int i = 1; i <= excelReader.getLastRow("Credentials"); i++) {
            InvalidUsername = excelReader.getStringData("Credentials", i, 2);
            InvalidPassword = excelReader.getStringData("Credentials", i, 3);
            waitForVisibility(loginPage.usernameField);
            loginPage.insertUsername(InvalidUsername);
            loginPage.insertPassword(InvalidPassword);
            loginPage.clickOnLoginButton();
            waitForClickability(loginPage.invalidMessage);
            Assert.assertTrue(loginPage.invalidMessage.isDisplayed());
        }
    }





}