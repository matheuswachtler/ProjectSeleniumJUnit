package jUnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.CartPage;

public class CartTest implements InterfaceTest {


    CartPage cartPage = new CartPage();

    @Override
    @BeforeEach
    public void beforeEach() {
        cartPage.openBrowser();

    }

    @Override
    @AfterEach
    public void afterEach() {
        cartPage.closeBrowser();
    }

    @Override
    @Test
    public void isCurrentPage() {
        Assertions.assertTrue(cartPage.compareCurrentUrl());
        Assertions.assertNotNull(cartPage.findElementById(CartPage.getIdCheckout()));
        Assertions.assertNotNull(cartPage.findElementById(CartPage.getIdContinueShoppingButton()));
    }

    @Test
    public void shouldReturnToInventoryPage(){
        cartPage.findAndClickButtonById(CartPage.getIdContinueShoppingButton());
        Assertions.assertNull(cartPage.findElementById(CartPage.getIdCheckout()));
        Assertions.assertEquals(CartPage.getWebDriver().getCurrentUrl(),CartPage.getUrlInventoryPage());
    }

    @Test
    public void shouldGoToCheckoutPage(){
        cartPage.findAndClickButtonById(CartPage.getIdCheckout());
        Assertions.assertNull(cartPage.findElementById(CartPage.getIdContinueShoppingButton()));
        Assertions.assertEquals(CartPage.getWebDriver().getCurrentUrl(),CartPage.getUrlCheckoutPage());
    }


}
