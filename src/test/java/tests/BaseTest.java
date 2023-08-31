package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class BaseTest {
    private WebDriver webDriver;

    @BeforeEach
    public void beforeEach() {
        if (webDriver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
        }
    }

    @AfterEach
    public void afterEach() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

    public WebDriver getDriver() {
        return webDriver;
    }
}
