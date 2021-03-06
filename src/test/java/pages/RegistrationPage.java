package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement indexSignIn;

    @FindBy(id = "email_create")
    WebElement authenticationEmail;

    @FindBy(id = "SubmitCreate")
    WebElement emailCreateBtn;

    @FindBy(id = "id_gender1")
    WebElement maleGender;

    @FindBy(id = "id_gender2")
    WebElement femaleGender;

    @FindBy(id = "customer_firstname")
    WebElement regCusFname;

    @FindBy(id = "customer_lastname")
    WebElement regCusLname;

    @FindBy(id = "email")
    WebElement regCusEmail;


    @FindBy(id = "passwd")
    WebElement regCusPass;

    @FindBy(id = "firstname")
    WebElement addrsFname;

    @FindBy(id = "lastname")
    WebElement addrsLname;

    @FindBy(id = "company")
    WebElement cmpnyName;

    @FindBy(id = "address1")
    WebElement addrsLineOne;


    @FindBy(id = "address2")
    WebElement addrsLineTwo;

    @FindBy(id = "city")
    WebElement cityName;

    @FindBy(id = "id_state")
    WebElement stateDropDown;

    @FindBy(id = "postcode")
    WebElement postalCode;

    @FindBy(id = "other")
    WebElement additionalInformation;

    @FindBy(id = "phone")
    WebElement homePhoneNumber;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhoneNumber;

    @FindBy(id = "alias")
    WebElement addressAlias;

    @FindBy(id = "submitAccount")
    WebElement rgstrBtn;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[2]/a")
    WebElement signOutBtn;


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void setAuthenticationEmail(String strAuthEmail) {
        authenticationEmail.sendKeys(strAuthEmail);
    }

    public void clickIndexSignIn() {
        indexSignIn.click();
    }

    public void clickEmailCreateBtn() {
        emailCreateBtn.click();
    }

    public void clickGenderRadioBtn() {
        maleGender.click();
//        femaleGender.click();

    }

    public void setRegCusFname(String strRegCusFname) {
        regCusFname.sendKeys(strRegCusFname);
    }

    public void setRegCusLname(String strRegCusLname) {
        regCusLname.sendKeys(strRegCusLname);
    }

    public void setRegCusEmail(String strRegCusEmail) {
        regCusEmail.sendKeys(strRegCusEmail);
    }

    public void setRegCusPass(String strRegCusPass) {
        regCusPass.sendKeys(strRegCusPass);
    }

    public void setAddrsFname(String strAddrsFname) {

        addrsFname.sendKeys(strAddrsFname);
    }

    public void setAddrsLname(String strAddrsLname) {

        addrsLname.sendKeys(strAddrsLname);
    }

    public void setCompanyName(String strCmpnyName) {

        cmpnyName.sendKeys(strCmpnyName);
    }

    public void setAddressLineOne(String strAddressLineOne) {

        addrsLineOne.sendKeys(strAddressLineOne);
    }

    public void setAddressLineTwo(String strAddressLineTwo) {

        addrsLineTwo.sendKeys(strAddressLineTwo);
    }

    public void setCityName(String strCityName) {

        cityName.sendKeys(strCityName);
    }

    public void setPostalCode(String strPostalCode) {

        postalCode.sendKeys(strPostalCode);
    }

    public void setStateDropDown(String strStateDropDown) {

        Select selectStateName = new Select(stateDropDown);
        selectStateName.selectByValue(strStateDropDown);

     }

    public void setAdditionalInformation(String strAdditionalInformation) {

        additionalInformation.sendKeys(strAdditionalInformation);
    }

    public void setHomePhoneNumber(String strHomePhoneNumber) {

        homePhoneNumber.sendKeys(strHomePhoneNumber);
    }

    public void setMobilePhoneNumber(String strMobilePhoneNumber) {

        mobilePhoneNumber.sendKeys(strMobilePhoneNumber);
    }

    public void setAddressAlias(String strAddressAlias) {

        addressAlias.sendKeys(strAddressAlias);
    }

    public void clickRgstrBtn() {
        rgstrBtn.click();
    }

    public void clickSignOutBtn() {
        signOutBtn.click();
    }

    /**
     * @param strAuthEmail
     * @param strRegCusFname
     * @param strRegCusLname
     * @param strRegCusPass
     * @param strAddrsFname
     * @param strAddrsLname
     * @param strCmpnyName
     * @param strAddressLineOne
     * @param strAddressLineTwo
     * @param strCityName
     * @param strStateDropDown
     * @param strAdditionalInformation
     * @param strHomePhoneNumber
     * @param strMobilePhoneNumber
     * @param strAddressAlias
     * @param strPostalCode
     * @return
     *
     */

    public void registrationInEcommerce(
            String strAuthEmail, String strRegCusFname, String strRegCusLname,
            String strRegCusPass, String strAddrsFname, String strAddrsLname,
            String strCmpnyName, String strAddressLineOne, String strAddressLineTwo,
            String strCityName, String strStateDropDown, String strPostalCode, String strAdditionalInformation,
            String strHomePhoneNumber, String strMobilePhoneNumber, String strAddressAlias)
    {

        this.clickIndexSignIn();
        this.setAuthenticationEmail(strAuthEmail);
        this.clickEmailCreateBtn();
        this.clickGenderRadioBtn();
        this.setRegCusFname(strRegCusFname);
        this.setRegCusLname(strRegCusLname);
        this.setRegCusPass(strRegCusPass);
        this.setAddrsFname(strAddrsFname);
        this.setAddrsLname(strAddrsLname);
        this.setCompanyName(strCmpnyName);
        this.setAddressLineOne(strAddressLineOne);
        this.setAddressLineTwo(strAddressLineTwo);
        this.setCityName(strCityName);
        this.setStateDropDown(strStateDropDown);
        this.setPostalCode(strPostalCode);
        this.setAdditionalInformation(strAdditionalInformation);
        this.setHomePhoneNumber(strHomePhoneNumber);
        this.setMobilePhoneNumber(strMobilePhoneNumber);
        this.setAddressAlias(strAddressAlias);
        this.clickRgstrBtn();
        this.clickSignOutBtn();
    }
}
