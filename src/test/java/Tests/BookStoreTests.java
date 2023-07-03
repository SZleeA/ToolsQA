package Tests;

import Pages.BookStoreAplication.BookStorePage;
import Pages.BookStoreAplication.LoginPage;
import Pages.BookStoreAplication.ProfilPage;
import Pages.SidebarPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookStoreTests extends LoginTests {

    public SidebarPage sidebarPage;
    public BookStorePage bookStorePage;

    public BookStoreTests() {
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void PageSetUp() {
        profilPage = new ProfilPage();
        loginPage = new LoginPage();
        sidebarPage = new SidebarPage();
        bookStorePage = new BookStorePage();
        driver.manage().window().maximize();
        driver.get(homeURL);
        sidebarPage.clickOnSideCard("Book Store Application");
    }

    @Test
    public void userCanAddBook() {
        sidebarPage.clickOnButton("Login");
        ValidUsername = excelReader.getStringData("Credentials", 1, 0);
        ValidPassword = excelReader.getStringData("Credentials", 1, 1);
        loginPage.insertUsername(ValidUsername);
        loginPage.insertPassword(ValidPassword);
        loginPage.clickOnLoginButton();
        sidebarPage.clickOnButton("Book Store");
        bookStorePage.selectBookGitPocketGuide();
        bookStorePage.clickAddButton();
        bookStorePage.selectLearningJavaScriptDesignPatterns();
        bookStorePage.clickAddButton();
    }


}
