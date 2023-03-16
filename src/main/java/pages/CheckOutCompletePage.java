package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompletePage extends BasePage
{
    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }
    By checkOutCompleteTitleBy = By.className("title");

    public void verifyShoppingCompleted(String expectedText) {
        assertStringEquals(readText(checkOutCompleteTitleBy), expectedText);
    }
}
