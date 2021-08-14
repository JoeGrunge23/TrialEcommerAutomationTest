package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement indexSignIn;

    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(id = "passwd")
    WebElement loginPassword;

    @FindBy(id = "SubmitLogin")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement signOut;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickIndexSignIn() {
        indexSignIn.click();
    }


    public void setLoginEmail(String strLoginEmail) {
        loginEmail.sendKeys(strLoginEmail);
    }

    public void setLoginPassword(String strLoginPassword) {
        loginPassword.sendKeys(strLoginPassword);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickSignOut() {
        signOut.click();
    }

    /**
     * @param strLoginEmail
     * @param strLoginPassword
     */

    public void loginToEcommerce(String strLoginEmail, String strLoginPassword) {

        this.clickIndexSignIn();
        this.setLoginEmail(strLoginEmail);
        this.setLoginPassword(strLoginPassword);
        this.clickLoginBtn();
        this.clickSignOut();
    }


}
