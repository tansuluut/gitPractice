package org.example.helper;

import org.example.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ElementActions {
    public ElementActions waitButtonToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public ElementActions waitElementToBeVisible(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;

    }
    public ElementActions clickTheButton(WebElement element) {
        waitButtonToBeClickable(element);
        actions.moveToElement(element).perform();
        element.click();
        return this;
    }
    public ElementActions writeText(WebElement element, String txt) {
        waitElementToBeVisible(element);
        actions.moveToElement(element).perform();
        element.sendKeys(txt);
        return this;
    }
    public ElementActions scrollToTheElement(WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", element);
        return this;
    }
    public ElementActions clickToRandomElement(List<WebElement> element){
        int randomIndex = new Random().nextInt(element.size());
        WebElement randomLabel = element.get(randomIndex);
        randomLabel.click();
        return this;
    }



    public ElementActions setTextAndEnterElement(String txt,WebElement element){
        writeText(element,txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    Actions actions= new Actions(Driver.getDriver());

    public ElementActions doubleClick(WebElement element){
        actions.moveToElement(element).perform();
        actions.doubleClick().perform();
        return this;
    }
    public ElementActions rightClickElementAction(WebElement element){
        actions.moveToElement(element).perform();
        actions.contextClick(element).perform();
        return this;
    }

    public void waitButtonToBeClickAble(WebElement submitClick) {
    }
    public ElementActions clickWithJavaScript(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        return this;
}

    public boolean checkHoverEffect(WebElement element, String cssProperty) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String hoverValue = element.getCssValue(cssProperty);
        return hoverValue != null && !hoverValue.isEmpty();
    }
}
