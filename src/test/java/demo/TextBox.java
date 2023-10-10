package demo;

import com.sun.source.tree.AssertTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox  extends BaseTest{
    @Test
    void fillUpTheFormTest() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField =driver.findElement(By.id("userName")); // найти элемент id

        String expectedFullName = "John Doe";
        fullNameInputField.sendKeys(expectedFullName);

        String expectedEmail = "john@gmail.com";
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(expectedEmail);

        String expectedCurrentAdress= "Bishkek";
        WebElement  currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(expectedCurrentAdress);

        String expectedPermanentAddress = "canada";
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys(expectedPermanentAddress);


        WebElement submitBtn = driver.findElement(By.id("submit")); // btn button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn); //
        submitBtn.click();

        Thread.sleep(5000);
        WebElement resulTName = driver.findElement(By.id("name"));
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        System.out.println(resulTName.getText());
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdress.getText().contains(expectedCurrentAdress));// сравниваем

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAddress));



       driver.close();
       driver.quit();// close

    }
    void fillUpTheFormTest2() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField =driver.findElement(By.id("userName")); // найти элемент id

        String expectedFullName = "John Doe";
        fullNameInputField.sendKeys(expectedFullName);

        String expectedEmail = "john@gmail.com";
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(expectedEmail);

        String expectedCurrentAdress= "Bishkek";
        WebElement  currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(expectedCurrentAdress);

        String expectedPermanentAddress = "canada";
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys(expectedPermanentAddress);


        WebElement submitBtn = driver.findElement(By.id("submit")); // btn button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn); //
        submitBtn.click();

        Thread.sleep(5000);
        WebElement resulTName = driver.findElement(By.id("name"));
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        System.out.println(resulTName.getText());
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdress.getText().contains(expectedCurrentAdress));// сравниваем

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAddress));


    }
    void fillUpTheFormTest3() throws InterruptedException {

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField =driver.findElement(By.id("userName")); // найти элемент id

        String expectedFullName = "John Doe";
        fullNameInputField.sendKeys(expectedFullName);

        String expectedEmail = "john@gmail.com";
        WebElement emailField = driver.findElement(By.id("userEmail"));
        emailField.sendKeys(expectedEmail);

        String expectedCurrentAdress= "Bishkek";
        WebElement  currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys(expectedCurrentAdress);

        String expectedPermanentAddress = "canada";
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys(expectedPermanentAddress);


        WebElement submitBtn = driver.findElement(By.id("submit")); // btn button
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn); //
        submitBtn.click();

        Thread.sleep(5000);
        WebElement resulTName = driver.findElement(By.id("name"));
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        System.out.println(resulTName.getText());
        Assert.assertTrue(resulTName.getText().contains(expectedFullName));

        WebElement resultEmail= driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains(expectedEmail));

        WebElement resultCurrentAdress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdress.getText().contains(expectedCurrentAdress));// сравниваем

        WebElement resultPermanentAdd = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        Assert.assertTrue(resultPermanentAdd.getText().contains(expectedPermanentAddress));


    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}


