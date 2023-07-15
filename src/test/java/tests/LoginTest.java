package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void shouldNotAcessWithInvalidData() {
        loginPage.navigate();
        loginPage.attemptLoginWith("fakeUsername","fakePassword");
        Assertions.assertTrue(loginPage.isThere());
        Assertions.assertNotNull(loginPage.elementIsPresent(LoginPage.ID_LOGIN_BUTTON));
    }

    @Test
    public void shouldAcessWithValidData() {
        loginPage.navigate();
        loginPage.attemptLoginWith("standard_user","secret_sauce");
        Assertions.assertFalse(loginPage.isThere());
        Assertions.assertNull(loginPage.elementIsPresent(LoginPage.ID_LOGIN_BUTTON));
    }
}
