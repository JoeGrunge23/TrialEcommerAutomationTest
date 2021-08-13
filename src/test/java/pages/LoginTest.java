package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(id = "passwd")
    WebElement loginPassword;

    @FindBy(id = "SubmitLogin")
    WebElement loginBtn;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    /**
     * @param strLoginEmail
     * @param strLoginPassword
     */

    public void loginToEcommerce(String strLoginEmail, String strLoginPassword) {

        this.setLoginEmail(strLoginEmail);
        this.setLoginPassword(strLoginPassword);
        this.clickLoginBtn();
    }


}
