package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginTest;
import pages.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class Testing {
    String driverPathLinux = "resources/linux/chromedriver",
            userName = "23test081021@mailinator.com",
            password = "Test123";

    WebDriver driver;
    RegistrationPage objRegistration;
    LoginTest objLoginTest;

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

    @Test(priority = 1)
    public void registrationProcess() {

        objRegistration = new RegistrationPage(driver);
        objRegistration.registrationInEcommerce
                (
                        userName,
                        "Test",
                        "Test",
                        password,
                        "34312 312321",
                        "312321 321321",
                        "Company",
                        "580 California  ",
                        "California St #150",
                        "San Francisco",
                        "5",
                        "dsads",
                        "Test Additonal",
                        "dasdas-dadsa-dasdsa",
                        "dasdsa-asd-asd",
                        "Test Alias"
                );
    }

    @Test(priority = 2)
    public void loginTestProcess(){
        objLoginTest = new LoginTest(driver);
        objLoginTest.loginToEcommerce(userName, password);

    }
}
