package tests;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void shouldNotAcessWithInvalidData() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.navigate(loginPage.URL_LOGIN_PAGE);
        loginPage.attemptLoginWith("fakeUsername","fakePassword");
        Assertions.assertTrue(loginPage.isThere(LoginPage.URL_LOGIN_PAGE));
        Assertions.assertNotNull(loginPage.elementIsPresent(LoginPage.ID_LOGIN_BUTTON));
    }

    @Test
    public void shouldAcessWithValidData() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.navigate(loginPage.URL_LOGIN_PAGE);
        loginPage.attemptLoginWith("standard_user","secret_sauce");
        Assertions.assertFalse(loginPage.isThere(LoginPage.URL_LOGIN_PAGE));
        Assertions.assertNull(loginPage.elementIsPresent(LoginPage.ID_LOGIN_BUTTON));
    }
}
