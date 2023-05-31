package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InventoryPage implements InterfacePage {

    private static WebDriver webDriver;


    private static final String urlInventoryPage = "https://www.saucedemo.com/inventory.html";
    private static final String urlLoginPage = "https://www.saucedemo.com/";
    private static final String idShoppingCart = "shopping_cart_container";
    private static final String idAddItemToCart = "add-to-cart-sauce-labs-backpack";
    private static final String idRemoveItemToCart = "remove-sauce-labs-backpack";


    public static String getIdRemoveItemToCart() {
        return idRemoveItemToCart;
    }

    public static String getIdAddItemToCart() {
        return idAddItemToCart;
    }

    public static String getIdShoppingCart() {
        return idShoppingCart;
    }

    public static String getUrlLoginPage() {
        return urlLoginPage;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        InventoryPage.webDriver = webDriver;
    }

    public static String getUrlInventoryPage() {
        return urlInventoryPage;
    }



    @Override
    public void openBrowser() {
        setWebDriver(new ChromeDriver());
        getWebDriver().manage().window().maximize();
        navigateToUrl();
    }

    @Override
    public void closeBrowser() {
        getWebDriver().quit();

    }

    @Override
    public void navigateToUrl() {
        getWebDriver().get(getUrlLoginPage());
        insertCookieOnWebDriver();
        getWebDriver().get(getUrlInventoryPage());
    }

    @Override
    public boolean compareCurrentUrl() {
        String url = getWebDriver().getCurrentUrl();
        return url.equals(getUrlInventoryPage());
    }

    @Override
    public WebElement findElementById(String id) {
        try {
            WebElement element = getWebDriver().findElement(By.id(id));
            return element;
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

    @Override
    public void insertCookieOnWebDriver() {
        getWebDriver().manage().addCookie(new Cookie("session-username", "standard_user"));
    }

    @Override
    public void sendDataInFormById(String id, String data) {
    }

    @Override
    public void findAndClickButtonById(String id) {
        WebElement element = getWebDriver().findElement(By.id(id));
        element.click();
    }

}