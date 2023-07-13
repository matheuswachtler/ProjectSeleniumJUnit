package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;

public class CartTest extends BaseTest {

    CartPage cartPage = new CartPage();

    @Test
    public void shouldReturnWhenContinueShoppingButtonIsClicked() {
        cartPage.navigate(this.webDriver);
        cartPage.findAndClickButtonById(this.webDriver, CartPage.getIdContinueShoppingButton());
        Assertions.assertNull(cartPage.elementIsPresent(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertNull(cartPage.elementIsPresent(this.webDriver, CartPage.getIdCheckoutButton()));
    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        cartPage.navigate(this.webDriver);
        cartPage.findAndClickButtonById(this.webDriver, CartPage.getIdCheckoutButton());
        Assertions.assertNull(cartPage.elementIsPresent(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertNull(cartPage.elementIsPresent(this.webDriver, CartPage.getIdCheckoutButton()));
    }

}
