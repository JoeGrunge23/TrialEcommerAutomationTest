package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

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

    @FindBy(id = "quantity_wanted")
    WebElement quantityWanted;

    @FindBy(id = "group_1")
    WebElement sizeDrpDwn;

    @FindBy(id = "color_11")
    WebElement selectColor;

    @FindBy(xpath = "//p[@id='add_to_cart']//span[.='Add to cart']")
    WebElement addToCart;

    @FindBy(xpath = "/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")
    WebElement procesToCheckOut;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")
    WebElement checkoutPageOne;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")
    WebElement checkoutPageTwo;

    @FindBy(xpath = "//*[@id='cgv']")
    WebElement termsAndConditionOne;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")
    WebElement termsAndConditionTwo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
    WebElement payByCheck;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")
    WebElement confirmTheOrder;


    public ShopTest(WebDriver driver) {
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

    public void clickWomenButton() {
        womenButton.click();
    }

    public void clearQuantityWanted()
    {
        quantityWanted.clear();
    }

    public void setQuantityWanted(String strQuantityWanted) {
        quantityWanted.sendKeys(strQuantityWanted);
    }

    public void setSizeDrpDwn(String strSizeDrpDwn) {
        Select selectSize = new Select(sizeDrpDwn);
        selectSize.selectByVisibleText("M");
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public void clickProcesToCheckOut() {
        procesToCheckOut.click();
    }

    public void clickCheckoutPageOne() {
        checkoutPageOne.click();
    }

    public void clickCheckoutPageTwo() {
        checkoutPageTwo.click();
    }

    public void clickTermsAndConditionOne() {
        termsAndConditionOne.click();
    }

    public void clickTermsAndConditionTwo() {
        termsAndConditionTwo.click();
    }

    public void clickPayByCheck() {
        payByCheck.click();
    }

    public void clickConfirmTheOrder() {
        confirmTheOrder.click();
    }


//    public void clickImgMore() {
//        actions.moveToElement(secondImg).moveToElement(moreBtn).click().perform();
//    }

//    public void clickSecondImg() {
//
//        secondImg.click();
//     }
//
//    public void clickMoreBtn() {
//        moreBtn.click();
//    }

    /**
     * @param strLoginEmail
     * @param strLoginPassword
     * @param strQuantityWanted
     * @param strSizeDrpDwn
     */

    public void shopTestInCommerce(
            String strLoginEmail,
            String strLoginPassword,
            String strQuantityWanted,
            String strSizeDrpDwn) {

        this.clickIndexSignIn();

        this.setLoginEmail(strLoginEmail);
        this.setLoginPassword(strLoginPassword);
        this.clickLoginBtn();
        this.clickWomenButton();
        new Actions(driver).moveToElement(secondImg).moveToElement(moreBtn).click().perform();
        this.setQuantityWanted(strQuantityWanted);
        this.clearQuantityWanted();
        this.setSizeDrpDwn(strSizeDrpDwn);
        this.clickAddToCart();
        this.clickProcesToCheckOut();
        this.clickCheckoutPageOne();
        this.clickCheckoutPageTwo();
        this.clickTermsAndConditionOne();
        this.clickTermsAndConditionTwo();
        this.clickPayByCheck();
        this.clickConfirmTheOrder();


    }


}
