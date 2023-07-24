package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public static final String URL_LOGIN_PAGE = "https://www.saucedemo.com/";

    public static final String ID_LOGIN_BUTTON = "login-button";

    public static final String ID_USERNAME = "user-name";

    public static final String ID_PASSWORD = "password";

    @FindBy(id = ID_USERNAME)
    private WebElement usernameLabel;
    @FindBy(id = ID_PASSWORD)
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
