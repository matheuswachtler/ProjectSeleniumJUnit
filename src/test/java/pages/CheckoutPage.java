package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }
    public final String URL_CHECKOUT_PAGE = "https://www.saucedemo.com/checkout-step-one.html";

    @FindBy(id="first-name")
    public WebElement firstName;

    @FindBy(id="last-name")
    public WebElement lastName;

    @FindBy(id="postal-code")
    public  WebElement postalCode;

    @FindBy(id="cancel")
    public WebElement cancelButton;

    public void sendDataInCheckoutForm(String firstName, String lastName, String postalCode){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.postalCode.sendKeys(postalCode);
    }


}
