package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public static final String URL_LOGIN_PAGE = "https://www.saucedemo.com/";

    public static final String ID_LOGIN_BUTTON = "login-button";

    public static final String ID_USERNAME = "user-name";

    public static final String ID_PASSWORD = "password";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void attemptLoginWith(String username, String password) {
        WebElement usernameLabel = webDriver.findElement(By.id(ID_USERNAME));
        usernameLabel.sendKeys(username);
        WebElement passwordLabel = webDriver.findElement(By.id(ID_PASSWORD));
        passwordLabel.sendKeys(password);
        passwordLabel.submit();
    }


}
