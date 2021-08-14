package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginTest;
import pages.RegistrationPage;
import pages.ShopTest;

import java.util.concurrent.TimeUnit;

public class Testing {
    String driverPathLinux = "resources/linux/chromedriver",
            userName = "9test081121@mailinator.com",
            password = "Test123";

    WebDriver driver;
    RegistrationPage objRegistration;
    LoginTest objLoginTest;
    ShopTest objShop;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPathLinux);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
                        "Test",
                        "Test",
                        "Company",
                        "580 California",
                        "California St #150",
                        "San Francisco",
                        "5",
                        "94104",
                        "Test Additonal",
                        "415-291-5475",
                        "415-291-5475",
                        "Test Alias"
                );
    }

    @Test(priority = 2)
    public void loginTestProcess(){
        objLoginTest = new LoginTest(driver);
        objLoginTest.loginToEcommerce(userName, password);

    }

    @Test(priority = 3)
    public void shopTestInCommerce(){
        objShop = new ShopTest(driver);

        objShop.shopTestInCommerce(
                userName,
                password,
                "2",
                "M");

    }

}
