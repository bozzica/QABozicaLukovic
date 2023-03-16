package testsWithLogin;

import org.testng.annotations.Test;
import pages.*;
import utilities.PropertyManager;

@Test
public class ShoppingItemTest extends BaseTestWithLogin {
    public void shoppingItemTest () {
        UserLoggedinPage userLoggedinPage = new UserLoggedinPage(driver);
        userLoggedinPage.addToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.checkOut();
        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.writePersonalData();
        CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver);
        checkOutOverviewPage.finishShopping();
        CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage(driver);
        checkOutCompletePage.verifyShoppingCompleted("CHECKOUT: COMPLETE!");


    }

}
