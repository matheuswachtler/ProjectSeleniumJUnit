
package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.InventoryPage;

public class CartTest extends BaseTest {

    @Test
    public void shouldReturnToInventoryPageWhenContinueShoppingButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        InventoryPage inventoryPage = new InventoryPage(getDriver());
        cartPage.navigate(cartPage.URL_CART_PAGE);
        Assertions.assertTrue(cartPage.isThere(cartPage.URL_CART_PAGE));
        cartPage.findAndClickButtonById(CartPage.ID_CONTINUE_SHOPPING_BUTTON);
        Assertions.assertTrue(cartPage.isThere(inventoryPage.URL_INVENTORY_PAGE));

    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.navigate(cartPage.URL_CART_PAGE);
        Assertions.assertTrue(cartPage.isThere(cartPage.URL_CART_PAGE));
        cartPage.findAndClickButtonById(CartPage.ID_CHECKOUT_BUTTON);
        Assertions.assertNull(cartPage.elementIsPresent(CartPage.ID_CHECKOUT_BUTTON));
    }

}
