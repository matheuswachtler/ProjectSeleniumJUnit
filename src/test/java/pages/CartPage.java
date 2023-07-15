package pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public static final String URL_CART_PAGE = "https://www.saucedemo.com/cart.html";
    public static final String ID_CONTINUE_SHOPPING_BUTTON = "continue-shopping";
    public static final String ID_CHECKOUT_BUTTON = "checkout";

    @Override
    public boolean isThere(WebDriver webDriver) {
        if (webDriver.getCurrentUrl().equals(URL_CART_PAGE)){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(BASE_URL);
        insertCookieOnWebDriver(webDriver);
        webDriver.get(URL_CART_PAGE);
    }
}


