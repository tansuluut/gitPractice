package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest{
    @Test
    void demo123(){
        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);
        // make double click
        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickButton).perform(); // perform  выполняет все действия
        WebElement doubleClickText = driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(doubleClickText.getText(),"You have done a double click");

        WebElement rightClickBtn= driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();
        WebElement rightClick= driver.findElement(By.xpath("//p[text()='You have done a right click']"));
        Assert.assertEquals(rightClick.getText(),"You have done a right click");

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMeButton).perform();
        WebElement clickBtnText = driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
        Assert.assertEquals(clickBtnText.getText(),"You have done a dynamic click");
    }

}
