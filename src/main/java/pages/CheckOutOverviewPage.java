package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage  extends BasePage {

    public CheckOutOverviewPage(WebDriver driver) {
        super(driver);
    }
    By finishButtonBy = By.id("finish");

    public void finishShopping () {
        clickElement(finishButtonBy);
    }
}
