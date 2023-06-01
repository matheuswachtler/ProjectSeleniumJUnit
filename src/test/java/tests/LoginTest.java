package tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void isCurrentPage() {
        loginPage.navigateToUrl(this.webDriver,LoginPage.getUrlLoginPage());
        Assertions.assertTrue(loginPage.compareCurrentUrl(this.webDriver,LoginPage.getUrlLoginPage()));
        Assertions.assertNotNull(loginPage.findElementById(this.webDriver,LoginPage.getIdLoginButton()));
    }

    @Test
    public void shouldNotAcessWithInvalidData() {
        loginPage.navigateToUrl(this.webDriver,LoginPage.getUrlLoginPage());
        loginPage.sendDataInFormById(this.webDriver,LoginPage.getIdUserName(),LoginPage.getFakeUserName());
        loginPage.sendDataInFormById(this.webDriver,LoginPage.getIdPassword(),LoginPage.getFakePassword());
        loginPage.findAndClickButtonById(this.webDriver,LoginPage.getIdLoginButton());
        Assertions.assertTrue(loginPage.compareCurrentUrl(this.webDriver,LoginPage.getUrlLoginPage()));
        Assertions.assertNotNull(loginPage.findElementById(this.webDriver,LoginPage.getIdLoginButton()));
    }

    @Test
    public void shouldAcessWithValidData() {
        loginPage.navigateToUrl(this.webDriver,LoginPage.getUrlLoginPage());
        loginPage.sendDataInFormById(this.webDriver,LoginPage.getIdUserName(),LoginPage.getUserName());
        loginPage.sendDataInFormById(this.webDriver,LoginPage.getIdPassword(),LoginPage.getPassword());
        loginPage.findAndClickButtonById(this.webDriver,LoginPage.getIdLoginButton());
        Assertions.assertFalse(loginPage.compareCurrentUrl(this.webDriver,LoginPage.getUrlLoginPage()));
        Assertions.assertNull(loginPage.findElementById(this.webDriver,LoginPage.getIdLoginButton()));


    }


}
