
package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;

public class CartTest extends BaseTest {



    @Test
    public void shouldReturnWhenContinueShoppingButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.navigate(CartPage.URL_CART_PAGE);
        cartPage.isThere(CartPage.URL_CART_PAGE);
        cartPage.findAndClickButtonById(CartPage.ID_CONTINUE_SHOPPING_BUTTON);
        Assertions.assertNull(cartPage.elementIsPresent(CartPage.ID_CHECKOUT_BUTTON));
    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        CartPage cartPage = new CartPage(getDriver());
        cartPage.navigate(CartPage.URL_CART_PAGE);
        cartPage.isThere(CartPage.URL_CART_PAGE);
        cartPage.findAndClickButtonById(CartPage.ID_CHECKOUT_BUTTON);
        Assertions.assertNull(cartPage.elementIsPresent(CartPage.ID_CHECKOUT_BUTTON));
    }

}
