package org.example.helper;

import com.beust.ah.A;
import lombok.Data;
import org.example.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Data
public class AlertHelper {
    Alert alert;

    public AlertHelper acceptAlert() {
        waitAlertToBePresent();
        switchToAlert();
        alert.accept();
        return this;
    }
    public AlertHelper dismissAlert(){
        waitAlertToBePresent();
        switchToAlert();
        alert.dismiss();// отклоняет
        return  this;
    }
    public AlertHelper sendKeysAlert(String txt){
        waitAlertToBePresent();
        switchToAlert();
        alert.sendKeys(txt);
        alert.accept();
        return this;
    }

    public AlertHelper switchToAlert() {
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }

    public AlertHelper waitAlertToBePresent() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(7))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }



}
