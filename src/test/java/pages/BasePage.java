package pages;


import org.openqa.selenium.*;

public abstract class BasePage {

    private static final String baseUrl = "https://www.saucedemo.com/";

    public static String getBaseUrl() {
        return baseUrl;
    }

    public void navigateToUrl(WebDriver webDriver, String url) {
        webDriver.get(getBaseUrl());
        insertCookieOnWebDriver(webDriver);
        webDriver.get(url);
    }

    public void sendDataInFormById(WebDriver webDriver, String id, String data) {
        WebElement element = webDriver.findElement(By.id(id));
        element.sendKeys(data);
    }

    public boolean compareCurrentUrl(WebDriver webDriver, String getUrl) {
        String url = webDriver.getCurrentUrl();
        return url.equals(getUrl);
    }

    public WebElement findElementById(WebDriver webDriver, String id) {
        try {
            WebElement element = webDriver.findElement(By.id(id));
            return element;
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

    public void findAndClickButtonById(WebDriver webDriver,String id){
    WebElement button = webDriver.findElement(By.id(id));
    button.click();
    }

    public void insertCookieOnWebDriver(WebDriver webDriver){
        Cookie cookie = new Cookie("session-username","standard_user");
        webDriver.manage().addCookie(cookie);
    }

}
