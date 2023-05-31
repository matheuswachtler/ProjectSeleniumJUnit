package jUnitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.InventoryPage;
import pageObject.LoginPage;

public class LoginTest implements InterfaceTest {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Override
    @BeforeEach
    public void beforeEach() {
        loginPage.openBrowser();

    }

    @Override
    @AfterEach
    public void afterEach() {
        loginPage.closeBrowser();
    }

    @Test
    @Override
    public void isCurrentPage() {
        loginPage.navigateToUrl();
        Assertions.assertTrue(loginPage.compareCurrentUrl());
        Assertions.assertNotNull(loginPage.findElementById(LoginPage.getIdLoginButton()));
    }

    @Test
    public void shouldNotAcessWithInvalidData() {
        loginPage.navigateToUrl();
        loginPage.sendDataInFormById(LoginPage.getIdUserName(), LoginPage.getFakeUserName());
        loginPage.sendDataInFormById(LoginPage.getIdPassword(), LoginPage.getFakePassword());
        loginPage.findAndClickButtonById(LoginPage.getIdLoginButton());
        Assertions.assertTrue(loginPage.compareCurrentUrl());
        Assertions.assertNotNull(loginPage.findElementById(LoginPage.getIdLoginButton()));
    }


    @Test
    public void shouldAcessWithValidData() {
        loginPage.navigateToUrl();
        loginPage.sendDataInFormById(LoginPage.getIdUserName(), LoginPage.getUserName());
        loginPage.sendDataInFormById(LoginPage.getIdPassword(), LoginPage.getPassword());
        loginPage.findAndClickButtonById(LoginPage.getIdLoginButton());
        Assertions.assertFalse(loginPage.compareCurrentUrl());
        Assertions.assertNull(loginPage.findElementById(LoginPage.getIdLoginButton()));

    }


}
