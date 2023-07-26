package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public static final String URL_LOGIN_PAGE = "https://www.saucedemo.com/";

    public static final String ID_LOGIN_BUTTON = "login-button";

    @FindBy(id = "user-name")
    private WebElement usernameLabel;
    @FindBy(id = "password")
    private WebElement passwordLabel;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void attemptLoginWith(String username, String password) {
        usernameLabel.sendKeys(username);
        passwordLabel.sendKeys(password);
        passwordLabel.submit();
    }


}
