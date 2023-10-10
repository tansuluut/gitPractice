package org.example.pages;

import com.beust.ah.A;
import org.example.helper.AlertHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertPage extends BasePage{
    AlertHelper alertHelper= new AlertHelper();
    @FindBy(id = "alertButton")
    public WebElement alertButtonClick;
    @FindBy(id = "timerAlertButton")
    public WebElement timerAlertButtonClick;
    @FindBy(id = "confirmButton")
    public WebElement confirmButtonClick;
    @FindBy(id = "promtButton")
    public WebElement promtButtonClick;
    @FindBy(id = "confirmResult")
    public WebElement confirmResult;
    @FindBy(id = "promptResult")
    public WebElement promptResult;

    public AlertPage clickToAlertButton(){
       elementActions.clickTheButton(alertButtonClick);
       alertHelper.acceptAlert();
       return this;
    }
    public AlertPage clickToTimerAlertButton(){
        elementActions.clickTheButton(timerAlertButtonClick);
        alertHelper.acceptAlert();
        return this;
    }
    public AlertPage clickToConfirmResult(){
        elementActions.clickTheButton(confirmButtonClick);
        alertHelper.dismissAlert();
        Assert.assertTrue(confirmResult.getText().contains("Cancel"));
        return this;
    }
    public AlertPage clickToPromptResult(){
        elementActions.clickTheButton(promtButtonClick);
        alertHelper.sendKeysAlert("tanos");
        Assert.assertTrue(promptResult.getText().contains("tanos"));
        return this;
    }


}
