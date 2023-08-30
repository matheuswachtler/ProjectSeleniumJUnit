package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public static final String URL_LOGIN_PAGE = "https://www.saucedemo.com/";
    public static final String ID_LOGIN_BUTTON = "login-button";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(id = "user-name")
    private WebElement usernameLabel;
    @FindBy(id = "password")
    private WebElement passwordLabel;

    public void attemptLoginWith(String username, String password) {
        usernameLabel.sendKeys(username);
        passwordLabel.sendKeys(password);
        passwordLabel.submit();
    }


}
