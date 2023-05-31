package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPage implements InterfacePage {

    LoginPage loginPage = new LoginPage();

    private static WebDriver webDriver;
    private static final String urlCartPage = "https://www.saucedemo.com/cart.html";

    private static final String idContinueShoppingButton = "continue-shopping";

    private static final String idCheckout = "checkout";

    private static final String urlInventoryPage = "https://www.saucedemo.com/inventory.html";

    private static final String urlCheckoutPage = "https://www.saucedemo.com/checkout-step-one.html";

    public static String getUrlCheckoutPage() {
        return urlCheckoutPage;
    }

    public static String getUrlInventoryPage() {
        return urlInventoryPage;
    }
    public static String getIdCheckout() {
        return idCheckout;
    }

    public static String getIdContinueShoppingButton() {
        return idContinueShoppingButton;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        CartPage.webDriver = webDriver;
    }

    public static String getUrlCartPage() {
        return urlCartPage;
    }

    @Override
    public void openBrowser() {
        setWebDriver(new ChromeDriver());
        navigateToUrl();
        getWebDriver().manage().window().maximize();
    }

    @Override
    public void closeBrowser() {
    getWebDriver().quit();
    }

    @Override
    public void navigateToUrl() {
        getWebDriver().get(LoginPage.getUrlLoginPage());
        insertCookieOnWebDriver();
        getWebDriver().get(getUrlCartPage());
    }

    @Override
    public boolean compareCurrentUrl() {
        String url = getWebDriver().getCurrentUrl();
        return url.equals(getUrlCartPage());
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
