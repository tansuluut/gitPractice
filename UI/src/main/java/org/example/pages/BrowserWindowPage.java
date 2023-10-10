package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.driver.Driver.driver;

public class BrowserWindowPage extends BasePage{
    @FindBy(id = "tabButton")
    public WebElement tabBtn;
    @FindBy(id = "windowButton")
    public WebElement windowBtn;
    @FindBy(id = "messageWindowButton")
    public WebElement messageWindowBtn;
    @FindBy(id = "sampleHeading")
    public WebElement txtInButton;
    @FindBy(xpath = "/html/body")
    public WebElement txtInNewWindowMessageButton;

    public BrowserWindowPage tabBtnClick(){
//        elementActions.clickTheButton(tabBtn);
//        Assert.assertTrue(txtInButton.getText().contains("This is a sample page"));
//        return this;
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("tabButton"))).click();// открыть вклдаку
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());// cобирает вкладки  и сохраняет
        System.out.println(tabs.get(0));
        driver.switchTo().window(tabs.get(0));// переключения на другую вкладку окно
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(txtInButton.getText().contains("This is a sample page"));
        driver.close();
        return  this;
    }
    public BrowserWindowPage windowBtnClick(){

        new  WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("windowButton"))).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());// cобирает вкладки  и сохраняет
        System.out.println(tabs.get(0));
        driver.switchTo().window(tabs.get(0));// переключения на другую вкладку окно
        driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(txtInButton.getText().contains("This is a sample page"));
        driver.close();
        return this;
    }
    public BrowserWindowPage messageWindowBtnClick(){
        new  WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("messageWindowButton"))).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs);
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();
        Assert.assertTrue(txtInNewWindowMessageButton.getText().contains("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization."));
        return this;
    }



}
