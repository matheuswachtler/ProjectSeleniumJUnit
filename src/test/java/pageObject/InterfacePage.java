package pageObject;


import org.openqa.selenium.WebElement;

public interface InterfacePage {

    public void openBrowser();

    public void closeBrowser();

    public void navigateToUrl();

    public boolean compareCurrentUrl();

    public WebElement findElementById(String id);

    public void insertCookieOnWebDriver();

    public void sendDataInFormById(String id, String data);

    public void findAndClickButtonById(String id);


}
