package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;

public class CartTest extends BaseTest {

    CartPage cartPage = new CartPage();

    @Test
    public void isCurrentPage() {
        cartPage.navigateToUrl(this.webDriver, CartPage.getUrlCartPage());
        Assertions.assertTrue(cartPage.compareCurrentUrl(this.webDriver, CartPage.getUrlCartPage()));
        Assertions.assertNotNull(cartPage.findElementById(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertNotNull(cartPage.findElementById(this.webDriver, CartPage.getIdContinueShoppingButton()));
    }

    @Test
    public void shouldReturnToInventoryPageWhenContinueShoppingButtonIsClicked() {
        cartPage.navigateToUrl(this.webDriver, CartPage.getUrlCartPage());
        cartPage.findAndClickButtonById(this.webDriver, CartPage.getIdContinueShoppingButton());
        Assertions.assertNull(cartPage.findElementById(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertNull(cartPage.findElementById(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertTrue(cartPage.compareCurrentUrl(this.webDriver, CartPage.getUrlInventoryPage()));
    }

    @Test
    public void shouldGoToCheckoutPageWhenCheckoutButtonIsClicked() {
        cartPage.navigateToUrl(this.webDriver, CartPage.getUrlCartPage());
        cartPage.findAndClickButtonById(this.webDriver, CartPage.getIdCheckoutButton());
        Assertions.assertNull(cartPage.findElementById(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertNull(cartPage.findElementById(this.webDriver, CartPage.getIdCheckoutButton()));
        Assertions.assertTrue(cartPage.compareCurrentUrl(this.webDriver, CartPage.getUrlCheckoutPage()));
    }


}
