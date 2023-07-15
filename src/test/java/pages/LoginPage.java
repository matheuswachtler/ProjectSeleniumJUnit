package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public static final String URL_LOGIN_PAGE = "https://www.saucedemo.com/";

    public static final String ID_LOGIN_BUTTON = "login-button";

    public static final String ID_USERNAME = "user-name";

    public static final String ID_PASSWORD = "password";


    public void attemptLoginWith(WebDriver webDriver, String username, String password) {
        WebElement usernameLabel = webDriver.findElement(By.id(ID_USERNAME));
        usernameLabel.sendKeys(username);
        WebElement passwordLabel = webDriver.findElement(By.id(ID_PASSWORD));
        passwordLabel.sendKeys(password);
        passwordLabel.submit();
    }

    @Override
    public boolean isThere(WebDriver webDriver) {
        if (webDriver.getCurrentUrl().equals(URL_LOGIN_PAGE)){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(BASE_URL);
        insertCookieOnWebDriver(webDriver);
        webDriver.get(URL_LOGIN_PAGE);
    }

}
