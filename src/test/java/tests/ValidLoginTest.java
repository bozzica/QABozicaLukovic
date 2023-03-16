package tests;

import org.apache.commons.logging.Log;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserLoggedinPage;
import utilities.PropertyManager;
@Test

public class ValidLoginTest extends BaseTest {
    public void validLogIn() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.performLogIn(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
            UserLoggedinPage userLoggedinPage = new UserLoggedinPage(driver);
            userLoggedinPage.verifyLogin("ADD TO CART");
        }
    }



