package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void shouldNotAcessWithInvalidData() {
        loginPage.navigate(this.webDriver);
        loginPage.attemptLoginWith(this.webDriver,"fakeUsername","fakePassword");
        Assertions.assertTrue(loginPage.isThere(this.webDriver));
        Assertions.assertNotNull(loginPage.elementIsPresent(this.webDriver,LoginPage.ID_LOGIN_BUTTON));
    }

    @Test
    public void shouldAcessWithValidData() {
        loginPage.navigate(this.webDriver);
        loginPage.attemptLoginWith(this.webDriver,"standard_user","secret_sauce");
        Assertions.assertFalse(loginPage.isThere(this.webDriver));
        Assertions.assertNull(loginPage.elementIsPresent(this.webDriver,LoginPage.ID_LOGIN_BUTTON));
    }
}
