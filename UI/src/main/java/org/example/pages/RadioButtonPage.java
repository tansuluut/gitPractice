package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static org.example.driver.Driver.driver;
import static org.example.driver.Driver.getDriver;

public class RadioButtonPage extends BasePage{
    @FindBy(xpath = "//label[@class='custom-control-label'][1]")
    public WebElement clickYesBtn;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
    public WebElement clickImpessiveBtn;

    @FindBy(xpath = "//label[@class='custom-control-label disabled']")
    public WebElement clickNoBtn;

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement resultBtnYes;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
    public WebElement resultImpessiveBtn;

    public RadioButtonPage clickYesBtn() {
        elementActions.clickTheButton(clickYesBtn);
        Assert.assertTrue(resultBtnYes.getText().contains("Yes"));
        return this;
    }

    public RadioButtonPage clickImpessiveBtn() {
        elementActions.clickTheButton(clickImpessiveBtn);
        Assert.assertTrue(resultImpessiveBtn.getText().contains("Impressive"));
        return this;
    }

    public RadioButtonPage clickNoBtn() {
        elementActions.clickTheButton(clickNoBtn);
        Assert.assertTrue(clickNoBtn.isEnabled());
        return this;
    }




//@FindBy(xpath = "//input[@id='yesRadio']/../label")
//public WebElement yesBtn;
//
//
//    @FindBy(xpath = "//input[@id='impressiveRadio']/../label")
//    public WebElement noBtn;
//    @FindBy(xpath = "//input[@id='noRadio']/../label")
//    public WebElement noClickBtn;
//
//    public RadioButtonPage clickYesBtn() {
//        elementActions.clickElement(yesBtn);
//        return this;
//    }
//
//    public RadioButtonPage clickNoBtn() {
//        elementActions.clickElement(noBtn);
//        return this;
//    }
//
//    public RadioButtonPage clickNoRadioBtn() {
//        elementActions.clickElement(noClickBtn);
//        return this;
//    }
//
//    public RadioButtonPage testPage() {
//        Assert.assertEquals(yesBtn.getAttribute("innerText"), "Yes");
//        Assert.assertEquals(noBtn.getAttribute("innerText"), "Impressive");
//        Assert.assertTrue(noClickBtn.isEnabled());
//        return this;
//
//    }можете еще такой вариант
}
