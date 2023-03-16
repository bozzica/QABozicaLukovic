package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.PropertyManager;
@Test

public class FailedCredencialsTests extends  BaseTest {
    public void emptyUsernameTest () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogIn("", PropertyManager.getInstance().getValidPassword());
        loginPage.verifyFailedLogin("Epic sadface: Username is required");

    }
    public void emptyPasswordTest () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogIn(PropertyManager.instance.getValidUsername(),"" );
        loginPage.verifyFailedLogin("Epic sadface: Password is required");
    }
    public void InvalidCredencialsTest () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogIn(PropertyManager.getInstance().getInvalidUsername(), PropertyManager.getInstance().getInvalidPassword());
        loginPage.verifyFailedLogin("Epic sadface: Username and password do not match any user in this service");
    }
}
