package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class UserLoggedinPage extends BasePage {
    public UserLoggedinPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButtonBy = By.id("add-to-cart-sauce-labs-backpack");

    By logoutButtonBy = By.id("logout_sidebar_link");

    By burgerButtonBy = By.id("react-burger-menu-btn");

    By shoppingCartButtonBy = By.id("shopping_cart_container");

    By allAddToCartButtonsBy = By.xpath("//button[contains(@id,'add-to-cart')]");

    By itemNameBy = By.className("inventory_item_name");



    public void verifyLogin(String expectedText) {
        assertStringEquals(readText(addToCartButtonBy), expectedText);
    }

    public void performLogout() {
        clickElement(burgerButtonBy);
        clickElement(logoutButtonBy);
    }
    public void addToCart() {
        clickElement(addToCartButtonBy);
        clickElement(shoppingCartButtonBy);
    }

    public UserLoggedinPage addRandomItemToCart() {
        List<WebElement> webElementList = driver.findElements(allAddToCartButtonsBy);
        Random random = new Random();
        int size = webElementList.size();
        int selection = random.nextInt(size-1);
        webElementList.get(selection).click();
        return this;
    }
    public String saveItemName () {
        return (readText(itemNameBy));
    }
}
