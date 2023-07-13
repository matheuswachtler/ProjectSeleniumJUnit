package pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    private static final String urlInventoryPage = "https://www.saucedemo.com/inventory.html";
    private static final String idShoppingCart = "shopping_cart_container";
    private static final String idAddItemToCart = "add-to-cart-sauce-labs-backpack";
    private static final String idRemoveItemToCart = "remove-sauce-labs-backpack";

    public static String getUrlInventoryPage() {
        return urlInventoryPage;
    }

    public static String getIdShoppingCart() {
        return idShoppingCart;
    }

    public static String getIdAddItemToCart() {
        return idAddItemToCart;
    }

    public static String getIdRemoveItemToCart() {
        return idRemoveItemToCart;
    }

    @Override
    public boolean isThere(WebDriver webDriver) {

        if (webDriver.getCurrentUrl().equals(getUrlInventoryPage())){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(getBaseUrl());
        insertCookieOnWebDriver(webDriver);
        webDriver.get(urlInventoryPage);
    }
}
