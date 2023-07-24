
package pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public static final String URL_CART_PAGE = "https://www.saucedemo.com/cart.html";
    public static final String ID_CONTINUE_SHOPPING_BUTTON = "continue-shopping";
    public static final String ID_CHECKOUT_BUTTON = "checkout";



}



