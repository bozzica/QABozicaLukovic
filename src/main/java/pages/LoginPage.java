package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");

    By errorButtonByBy = By.xpath("//div[@class='error-message-container error']");


    public void performLogIn(String username, String password) {
        writeText(usernameFieldBy, username);
        writeText(passwordFieldBy, password);
        clickElement(loginButtonBy);
    }
    public void verifyFailedLogin (String expectedText) {
        assertStringEquals(readText(errorButtonByBy), expectedText);
    }

    public void verifyLogout(String expectedText) {
        assertStringEquals(readText(loginButtonBy), expectedText);
}
    }
