package pages;


import org.openqa.selenium.*;

public abstract class BasePage {

    public static final String BASE_URL = "https://www.saucedemo.com/";

    public WebElement elementIsPresent(WebDriver webDriver, String id) {
        try {
            WebElement element = webDriver.findElement(By.id(id));
            return element;
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

    public void findAndClickButtonById(WebDriver webDriver, String id) {
        WebElement button = webDriver.findElement(By.id(id));
        button.click();
    }

    public void insertCookieOnWebDriver(WebDriver webDriver) {
        Cookie cookie = new Cookie("session-username", "standard_user");
        webDriver.manage().addCookie(cookie);
    }

    public abstract boolean isThere(WebDriver webDriver);

    public abstract void navigate(WebDriver webDriver);

}
