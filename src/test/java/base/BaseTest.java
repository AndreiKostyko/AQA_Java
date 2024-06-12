package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {

    private String link = "https://mts.by/";
    WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        driver.get(link);
        homePage.closeCookie();
    }

    @AfterClass
    void teardown() {
        driver.quit();
    }
}