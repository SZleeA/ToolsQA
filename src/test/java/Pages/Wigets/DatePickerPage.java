package Pages.Wigets;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.atomic.AtomicReference;

import static java.nio.file.Files.setAttribute;

public class DatePickerPage extends BaseTest {

    public DatePickerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement datePicker;

    @FindBy (id = "dateAndTimePickerInput")
    public WebElement dateAndTimePicker;

    //===========================================

    public void clickDatePicker() {
        datePicker.click();
    }

    public void setDatePicker(String date) {
        datePicker.sendKeys(Keys.CONTROL + "a");
        datePicker.sendKeys(Keys.DELETE);
        datePicker.sendKeys(date);
        datePicker.sendKeys(Keys.ENTER);
    }

    public void setDateAndTimePicker (String dateAndTime) {
        dateAndTimePicker.sendKeys(Keys.CONTROL + "a");
        dateAndTimePicker.sendKeys(Keys.DELETE);
        dateAndTimePicker.sendKeys(dateAndTime);
        dateAndTimePicker.sendKeys(Keys.ENTER);
    }
}