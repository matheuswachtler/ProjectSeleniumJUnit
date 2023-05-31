package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage implements InterfacePage {
    private WebDriver webDriver;

    private static final String urlLoginPage = "https://www.saucedemo.com/";

    private static final String idLoginButton = "login-button";

    private static final String idUserName = "user-name";

    private static final String idPassword = "password";

    private static final String userName = "standard_user";

    private static final String password = "secret_sauce";

    private static final String fakeUserName = "fakeUsername";

    private static final String fakePassword = "fakePassword";

    public static String getFakePassword() {
        return fakePassword;
    }

    public static String getFakeUserName() {
        return fakeUserName;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getIdUserName() {
        return idUserName;
    }

    public static String getIdPassword() {
        return idPassword;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static String getUrlLoginPage() {
        return urlLoginPage;
    }

    public static String getIdLoginButton() {
        return idLoginButton;
    }

    @Override
    public void openBrowser() {
        setWebDriver(new ChromeDriver());
        getWebDriver().manage().window().maximize();
    }

    @Override
    public void closeBrowser() {
        getWebDriver().quit();
    }

    @Override
    public void navigateToUrl() {
        getWebDriver().get(getUrlLoginPage());
    }

    @Override
    public boolean compareCurrentUrl() {
        String url = getWebDriver().getCurrentUrl();
        return url.equals(getUrlLoginPage());
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
        Cookie cookie = new Cookie("session-username", "standard_user");
        getWebDriver().manage().addCookie(cookie);
    }

    @Override
    public void sendDataInFormById(String id, String data) {
        WebElement form = getWebDriver().findElement(By.id(id));
        form.sendKeys(data);
    }

    @Override
    public void findAndClickButtonById(String id) {
        WebElement button = webDriver.findElement(By.id(id));
        button.click();
    }

}
