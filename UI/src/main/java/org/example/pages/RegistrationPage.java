package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends BasePage{
    WebDriver driver;


    @FindBy (id = "firstname")
    public WebElement firstNameInput;
    @FindBy (id = "lastname")
    public WebElement lastNameInput;
    @FindBy (id = "userName")
    public WebElement userNameInput;
    @FindBy (id = "password")
    public WebElement passwordInput;
    @FindBy (xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    public WebElement recapctchaAnchorClick;
    @FindBy (id = "btn btn-primary")
    public WebElement btmClick;

    @FindBy(id = "userName")
    public WebElement userNameLogin;
    @FindBy(id = "password")
    public WebElement PasswordLogin;
    @FindBy(id = "login")
    public WebElement loginClick;


    public RegistrationPage fillUpFirstName(String txt){
        elementActions.writeText(firstNameInput,txt);
        return this;
    }
    public  RegistrationPage fillUpLastName(String txt){
        elementActions.writeText(lastNameInput,txt);
        return this;
    }
    public RegistrationPage fillUpUserName(String txt){
        elementActions.writeText(userNameInput,txt);
        return  this;
    }
    public RegistrationPage filUpPassword(String txt){
        elementActions.writeText(passwordInput,txt);
        return  this;
    }
    public  RegistrationPage clickIAmNotARobot(){
        elementActions.clickTheButton(recapctchaAnchorClick);
        return this;
    }

    public RegistrationPage clickTheSubmitBtn() {
        elementActions.clickTheButton(btmClick);
        return this;

    }

    public RegistrationPage fillUpUserNameLogin(String txt) {
        elementActions.writeText(userNameLogin,txt);
        return this;

    }
    public RegistrationPage fillUpPasswordLogin(String txt) {
        elementActions.writeText(PasswordLogin,txt);
        return this;

    }
    public RegistrationPage clickTheLoginBtn() {
        elementActions.clickTheButton(loginClick);
        return this;

    }

    public static class TextBoxPage extends BasePage {// чтоб сократить код
        WebDriver driver;
        public TextBoxPage(WebDriver driver){
            this.driver = driver;
        } // constructor

        //page object model
        @FindBy(id ="userName")//ищет  при помощи драйвера
        public WebElement userFullName;
        @FindBy(id = "name")
        public WebElement expectedUserFullName;
        @FindBy(id ="userEmail")
        public WebElement userEmailInput;
        @FindBy(id = "email")
        public WebElement expectedUserEmailInput;
        @FindBy(id="currentAddress")
        public WebElement userCurrentAddress;
        @FindBy(xpath = "//p[@id='currentAddress']")
        public WebElement expectedUserCurrentAddress;
        @FindBy(id="permanentAddress")
        public WebElement userPermanentAddress;
        @FindBy(xpath = "//p[@id='permanentAddress']")
        public WebElement expectedUserPermanentAddress;
        @FindBy(id = "submit")
        public WebElement submitClick;
        public TextBoxPage fillUpTheFullName(String fullName){
            elementActions.writeText(userFullName,fullName);
            return  this;
        }
        public TextBoxPage fillUpEmail (String email){
            elementActions.writeText(userEmailInput,email);
            return this;
        }
        public TextBoxPage fillUpCurrentAddress(String current){
            elementActions.writeText(userCurrentAddress,current);
            return this;
        }
        public  TextBoxPage fillUpPermanentAddress(String permanentAddressInput){
            elementActions.writeText(userPermanentAddress,permanentAddressInput);
            return this;
        }
        public  TextBoxPage submitBtmClick(){
            elementActions.waitButtonToBeClickAble(submitClick);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", submitClick);
            elementActions.clickTheButton(submitClick);
            return this;
        }
        public  TextBoxPage testTexBoxForm(){
            Assert.assertTrue(expectedUserFullName.getText().contains(userFullName.getText()));
            Assert.assertTrue(expectedUserEmailInput.getText().contains(userEmailInput.getText()));
            Assert.assertTrue(expectedUserCurrentAddress.getText().contains(userCurrentAddress.getText()));
            Assert.assertTrue(expectedUserPermanentAddress.getText().contains(userPermanentAddress.getText()));
            return this;
        }



    }
}
