package pages;

public class CartPage extends BasePage {


    private static final String urlCartPage = "https://www.saucedemo.com/cart.html";
    private static final String idContinueShoppingButton = "continue-shopping";
    private static final String idCheckoutButton = "checkout";
    private static final String urlInventoryPage = "https://www.saucedemo.com/inventory.html";
    private static final String urlCheckoutPage = "https://www.saucedemo.com/checkout-step-one.html";

    public static String getUrlCartPage() {
        return urlCartPage;
    }

    public static String getIdContinueShoppingButton() {
        return idContinueShoppingButton;
    }

    public static String getIdCheckoutButton() {
        return idCheckoutButton;
    }

    public static String getUrlInventoryPage() {
        return urlInventoryPage;
    }

    public static String getUrlCheckoutPage() {
        return urlCheckoutPage;
    }

}


