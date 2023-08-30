
package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;

public class CartTest extends BaseTest {

    @Test
    public void shouldReturnToInventoryPageWhenContinueShoppingButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        InventoryPage inventoryPage = new InventoryPage(getDriver());
        cartPage.navigate(cartPage.URL_CART_PAGE);
        Assertions.assertTrue(cartPage.isThere(cartPage.URL_CART_PAGE));
        cartPage.findAndClickButton(cartPage.CONTINUE_SHOPPING_BUTTON);
        Assertions.assertTrue(cartPage.isThere(inventoryPage.URL_INVENTORY_PAGE));

    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        cartPage.navigate(cartPage.URL_CART_PAGE);
        Assertions.assertTrue(cartPage.isThere(cartPage.URL_CART_PAGE));
        cartPage.findAndClickButtonById(cartPage.CHECKOUT_BUTTON);
        Assertions.assertTrue(cartPage.isThere(checkoutPage.URL_CHECKOUT_PAGE));
    }
}
