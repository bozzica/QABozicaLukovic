package testsWithLogin;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserLoggedinPage;

@Test
public class LogoutTest extends BaseTestWithLogin {
    public void logOutTest() {
        UserLoggedinPage userLoggedinPage = new UserLoggedinPage(driver);
        userLoggedinPage.performLogout();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLogout("LOGIN");

    }


}
