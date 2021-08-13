package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    String driverPathLinux = "resources/linux/chromedriver",
            userName = "10test081021@mailinator.com",
            password = "Test123!";
    WebDriver driver;
    RegistrationPage objRegistration;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPathLinux);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }


    @Test(priority = 0)
    public void registrationProcess() {

        objRegistration = new RegistrationPage(driver);
        objRegistration.registrationInEcommerce
                (
                        userName,
                        "Test",
                        "Test",
                        password,
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
