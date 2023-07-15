package pages;

import org.openqa.selenium.*;
import tests.BaseTest;

public abstract class BasePage extends BaseTest {


    public static final String BASE_URL = "https://www.saucedemo.com/";

    public WebElement elementIsPresent(String id) {

        try {
            WebElement element = webDriver.findElement(By.id(id));
            return element;
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

    public void findAndClickButtonById(String id) {
        WebElement button = webDriver.findElement(By.id(id));
        button.click();
    }

    public void insertCookieOnWebDriver() {
        Cookie cookie = new Cookie("session-username", "standard_user");
        webDriver.manage().addCookie(cookie);
    }

    public abstract boolean isThere();

    public abstract void navigate();

}
