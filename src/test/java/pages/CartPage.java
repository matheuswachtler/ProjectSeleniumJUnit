
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public final String URL_CART_PAGE = "https://www.saucedemo.com/cart.html";

    @FindBy(id="continue-shopping")
    public WebElement CONTINUE_SHOPPING_BUTTON;

    public final String CHECKOUT_BUTTON = "checkout";



}



