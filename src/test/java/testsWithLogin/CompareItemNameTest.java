package testsWithLogin;

import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import pages.UserLoggedinPage;

@Test
public class CompareItemNameTest extends  BaseTestWithLogin{
    public void compareItemNameTest () {
        UserLoggedinPage userLoggedinPage = new UserLoggedinPage(driver);
        String itemName = userLoggedinPage.saveItemName();
        userLoggedinPage.addRandomItemToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.verifyItemName(itemName);
    }
}
