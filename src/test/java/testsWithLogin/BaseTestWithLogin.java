package testsWithLogin;

import common.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.LoginPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {

    @Override
    @Parameters({"username", "browser"})
    @BeforeMethod
    public void setup(@Optional("no username provided") String username, String browser) {


        LoginPage loginPage = new LoginPage(driver);
        if (username.equals("no username provided")) {
            loginPage.performLogIn(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
        } else {
            loginPage.performLogIn(PropertyManager.getInstance().getValidUsername(), PropertyManager.getInstance().getValidPassword());
        }
    }
}