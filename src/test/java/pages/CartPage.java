package pages;

import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {


    private static final String urlCartPage = "https://www.saucedemo.com/cart.html";
    private static final String idContinueShoppingButton = "continue-shopping";
    private static final String idCheckoutButton = "checkout";

    public static String getUrlCartPage() {
        return urlCartPage;
    }

    public static String getIdContinueShoppingButton() {
        return idContinueShoppingButton;
    }

    public static String getIdCheckoutButton() {
        return idCheckoutButton;
    }


    @Override
    public boolean isThere(WebDriver webDriver) {
        if (webDriver.getCurrentUrl().equals(getUrlCartPage())){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(getBaseUrl());
        insertCookieOnWebDriver(webDriver);
        webDriver.get(getUrlCartPage());
    }
}


