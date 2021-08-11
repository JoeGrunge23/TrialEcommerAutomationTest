package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class Testing {
    String driverPathLinux = "resources/linux/chromedriver";
    WebDriver driver;
    RegistrationPage objRegistration;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPathLinux);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @Test(priority = 0)
    public void registrationProcess() {

        objRegistration = new RegistrationPage(driver);
        objRegistration.registrationInEcommerce
                (
                        "3test081021@mailinator.com",
                        "Test",
                        "Test",
                        "Test123!",
                        "Test Two",
                        "Test Two",
                        "Company",
                        "580 California Street",
                        "California St #150",
                        "San Francisco",
                        "5",
                        "94104",
                        "Test Additonal",
                        "202-555-0102",
                        "202-555-0102",
                        "Test Alias");
    }
}
