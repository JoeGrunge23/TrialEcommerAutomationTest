package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopTest {

    WebDriver driver;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement indexSignIn;

    @FindBy(id = "email")
    WebElement loginEmail;

    @FindBy(id = "passwd")
    WebElement loginPassword;

    @FindBy(id = "SubmitLogin")
    WebElement loginBtn;

    //Dashboard shopping element

    @FindBy(linkText = "WOMEN")
    WebElement womenButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img")
    WebElement secondImg;

    @FindBy(xpath = "/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]")
    WebElement moreBtn;

    public ShopTest(WebDriver driver) {
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

    public void clickWomenButton() {
        womenButton.click();
    }


    /**
     * @param strLoginEmail
     * @param strLoginPassword
     */

    public void shopTestInCommerce(String strLoginEmail, String strLoginPassword) {

        this.setLoginEmail(strLoginEmail);
        this.setLoginPassword(strLoginPassword);
        this.clickLoginBtn();
        this.clickWomenButton();
    }


}
