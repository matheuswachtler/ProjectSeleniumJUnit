package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final String urlLoginPage = "https://www.saucedemo.com/";

    private static final String idLoginButton = "login-button";

    private static final String idUserName = "user-name";

    private static final String idPassword = "password";

    public static String getIdUserName() {
        return idUserName;
    }

    public static String getIdPassword() {
        return idPassword;
    }

    public static String getUrlLoginPage() {
        return urlLoginPage;
    }

    public static String getIdLoginButton() {
        return idLoginButton;
    }
    public void attemptLoginWith(WebDriver webDriver, String username, String password) {
        WebElement usernameForm = webDriver.findElement(By.id(getIdUserName()));
        usernameForm.sendKeys(username);
        WebElement passwordForm = webDriver.findElement(By.id(getIdPassword()));
        passwordForm.sendKeys(password);
        passwordForm.submit();
    }

    @Override
    public boolean isThere(WebDriver webDriver) {
        if (webDriver.getCurrentUrl().equals(getUrlLoginPage())){
            return true;
        }
        else return false;
    }

    @Override
    public void navigate(WebDriver webDriver) {
        webDriver.get(getBaseUrl());
        insertCookieOnWebDriver(webDriver);
        webDriver.get(getUrlLoginPage());
    }

}
