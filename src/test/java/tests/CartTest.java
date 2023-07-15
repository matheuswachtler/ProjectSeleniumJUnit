
package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;

public class CartTest extends BaseTest {

    CartPage cartPage = new CartPage();



    @Test
    public void shouldReturnWhenContinueShoppingButtonIsClicked() {
        cartPage.navigate();
        cartPage.isThere();
        cartPage.findAndClickButtonById(CartPage.ID_CONTINUE_SHOPPING_BUTTON);
        Assertions.assertNull(cartPage.elementIsPresent(CartPage.ID_CHECKOUT_BUTTON));
    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        cartPage.navigate();
        cartPage.isThere();
        cartPage.findAndClickButtonById(CartPage.ID_CHECKOUT_BUTTON);
        Assertions.assertNull(cartPage.elementIsPresent(CartPage.ID_CHECKOUT_BUTTON));
    }

}
