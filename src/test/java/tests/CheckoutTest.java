package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void shouldRegisterInformationInForm() {
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.navigate(checkoutPage.URL_CHECKOUT_PAGE);
        Assertions.assertTrue(checkoutPage.isThere(checkoutPage.URL_CHECKOUT_PAGE));
        checkoutPage.sendDataInCheckoutForm("Matheus", "Wachtler", "12345");
        Assertions.assertEquals(checkoutPage.getValue(checkoutPage.firstName), "Matheus");
        Assertions.assertEquals(checkoutPage.getValue(checkoutPage.lastName), "Wachtler");
        Assertions.assertEquals(checkoutPage.getValue(checkoutPage.postalCode), "12345");
    }

    @Test
    public void shouldShowErrorMessageWhenFormIsNull() {
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.navigate(checkoutPage.URL_CHECKOUT_PAGE);
        Assertions.assertTrue(checkoutPage.isThere(checkoutPage.URL_CHECKOUT_PAGE));
        checkoutPage.sendDataInForm(checkoutPage.firstName,"");
        Assertions.assertTrue(checkoutPage.findTextInPage("Error: First Name is required"));
        checkoutPage.sendDataInForm(checkoutPage.firstName,"Matheus");
        Assertions.assertTrue(checkoutPage.findTextInPage("Error: Last Name is required"));
        checkoutPage.sendDataInForm(checkoutPage.lastName,"Wachtler");
        Assertions.assertTrue(checkoutPage.findTextInPage("Error: Postal Code is required"));
    }

    @Test
    public void shouldReturnToCartPageWhenCancelButtonIsClicked(){
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());
        checkoutPage.navigate(checkoutPage.URL_CHECKOUT_PAGE);
        Assertions.assertTrue(checkoutPage.isThere(checkoutPage.URL_CHECKOUT_PAGE));
        checkoutPage.findAndClickButton(checkoutPage.cancelButton);
        Assertions.assertTrue(checkoutPage.isThere(cartPage.URL_CART_PAGE));
    }



}
