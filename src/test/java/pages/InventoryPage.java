package pages;


import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
    }
    public  final String URL_INVENTORY_PAGE = "https://www.saucedemo.com/inventory.html";
    public static final String ID_SHOPPING_CART = "shopping_cart_container";
    public static final String ID_ADD_ITEM_TO_CART = "add-to-cart-sauce-labs-backpack";
    public static final String ID_REMOVE_ITEM_TO_CART = "remove-sauce-labs-backpack";


}
