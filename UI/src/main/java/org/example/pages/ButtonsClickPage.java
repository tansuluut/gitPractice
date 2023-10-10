package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ButtonsClickPage extends BasePage{
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickMe;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickMe;
    @FindBy(xpath = "//button[text()='Click Me']")
    public WebElement clickMe;
    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickText;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickText;
    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;

    public ButtonsClickPage doubleClickOnButton(){
        elementActions.doubleClick(doubleClickMe);
        Assert.assertTrue(doubleClickText.getText().contains("You have done a double click"));        return this;
    }
    public ButtonsClickPage rightClickOnButton(){
        elementActions.rightClickElementAction(rightClickMe);
        Assert.assertTrue(rightClickText.getText().contains("You have done a right click"));        return this;
    }
    public ButtonsClickPage clickMeOnButton(){
        elementActions.clickTheButton(clickMe);
        Assert.assertTrue(dynamicClickMessage.getText().contains("You have done a dynamic click"));        return this;
    }


}
