package pages;

import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    public static final String URL_INVENTORY_PAGE = "https://www.saucedemo.com/inventory.html";
    public static final String ID_SHOPPING_CART = "shopping_cart_container";
    public static final String ID_ADD_ITEM_TO_CART = "add-to-cart-sauce-labs-backpack";
    public static final String ID_REMOVE_ITEM_TO_CART = "remove-sauce-labs-backpack";

    @Override
    public boolean isThere(WebDriver webDriver) {

        if (webDriver.getCurrentUrl().equals(URL_INVENTORY_PAGE)){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(BASE_URL);
        insertCookieOnWebDriver(webDriver);
        webDriver.get(URL_INVENTORY_PAGE);
    }
}
