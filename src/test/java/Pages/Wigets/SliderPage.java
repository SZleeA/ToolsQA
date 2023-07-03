package Pages.Wigets;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage extends BaseTest {

    public SliderPage () {
        PageFactory.initElements(driver, this);
    }
    @FindBy (className = "range-slider__wrap")
    public WebElement slider;

    @FindBy (id = "sliderValue")
    public  WebElement sliderValueField;

//========================================================

    public void moveSliderRight (int number) {
        for (int i = 1; i <= number ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void moveSliderLeft (int number) {
        for (int i = 1; i <= number ; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void movesSliderToDesiredValue (int desiredValue) {
        int currentValue = Integer.parseInt(slider.getAttribute("value"));
        while (currentValue != desiredValue) {
            if (currentValue < desiredValue) {
                actions.dragAndDropBy(slider, 1, 0).perform();
                currentValue = Integer.parseInt(slider.getAttribute("value"));
            } else {
                actions.dragAndDropBy(slider, -1, 0).perform();
                currentValue = Integer.parseInt(slider.getAttribute("value"));
            }
        }
    }

}
