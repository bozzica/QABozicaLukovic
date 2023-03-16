package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    By removeButtonBy = By.id("remove-sauce-labs-backpack");

    By checkOutButtonBy = By.id("checkout");

    By itemNameBy = By.className("inventory_item_name");




    public void removeFromCart () {
        clickElement(removeButtonBy);
    }
    public void  verifyEmptyShoppingCart () {
        isElementNotDisplayed(removeButtonBy);
    }
    public void checkOut () {
        clickElement(checkOutButtonBy);
    }

    public void verifyItemName (String expectedText) {
        assertStringEquals(readText(itemNameBy), expectedText);
    }
}
