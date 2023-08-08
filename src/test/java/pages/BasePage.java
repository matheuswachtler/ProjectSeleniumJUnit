package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    protected WebDriver webDriver;


    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public static final String BASE_URL = "https://www.saucedemo.com/";

    public void navigate(String url) {
        webDriver.get(BASE_URL);
        insertCookieOnWebDriver();
        this.webDriver.get(url);
    }

    public boolean isThere(String url) {
        if (webDriver.getCurrentUrl().equals(url)) {
            return true;
        } else return false;
    }

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

    public String getValue(WebElement element){
       String elementValue = element.getAttribute("value");
       return elementValue;
    }

    public void sendDataInForm(WebElement webElement, String data){
        webElement.sendKeys(data);
        webElement.submit();
    }

    public boolean findTextInPage(String data){
      return webDriver.getPageSource().contains(data);
    }

    public void findAndClickButton(WebElement webElement){
        webElement.click();
    }

}
