package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public abstract class BaseTest {
    public static WebDriver webDriver;

    @BeforeEach
    public void beforeEach() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    @AfterEach
    public void afterEach() {
        this.webDriver.quit();
    }

}
