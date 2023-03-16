package testsWithLogin;

import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;
import pages.ShoppingCartPage;
import pages.UserLoggedinPage;

@Test

public class RemoveFromCartTest extends BaseTestWithLogin {
    public void removeFromCartTest () {
        UserLoggedinPage userLoggedinPage = new UserLoggedinPage(driver);
        userLoggedinPage.addToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.removeFromCart();
        shoppingCartPage.verifyEmptyShoppingCart();

    }
}
