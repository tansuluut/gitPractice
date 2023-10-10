package homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestHome {
    @Test
    void fillUpTheFormTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // set up the chrome  driver

        WebDriver driver = new ChromeDriver();// create new object

        driver.manage().window().maximize();//  make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//set up the time

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstNameInputField = driver.findElement(By.id("firstName"));
        String  expectedFirstName = "Tansuluu";
        firstNameInputField.sendKeys(expectedFirstName);

        WebElement lastNameInputField = driver.findElement(By.id("lastName"));
        String expectedLastName= "Totosheva";
        lastNameInputField.sendKeys(expectedLastName);

        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        String expectedEmailInputField = "tanos@gmail.com";
        emailInputField.sendKeys(expectedEmailInputField);

//      WebElement genderLabelField = driver.findElement(By.className("custom-control-label"));
        WebElement genderLabelField = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", genderLabelField);

        WebElement numberInputField = driver.findElement(By.id("userNumber"));
        String expectedNumberInputField = "0708345467";
        numberInputField.sendKeys(expectedNumberInputField);

        WebElement dateOfBirthInputField = driver.findElement(By.id("dateOfBirthInput"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].focus();", dateOfBirthInputField);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '';", dateOfBirthInputField);
        Thread.sleep(1000);
        String expectedDateOfBirth = "10 july 2000";
        dateOfBirthInputField.sendKeys(expectedDateOfBirth);

        WebElement subjectsInputField = driver.findElement(By.id("subjectsInput"));
        String expectedSubjectsInputField= "math";
        subjectsInputField.sendKeys(expectedSubjectsInputField);
//      Assert.assertTrue(subjectsInputField.getText().contains(expectedSubjectsInputField));
//      Assert.assertTrue(subjectsInputField.getAttribute("value").contains(expectedSubjectsInputField));
        //Этот код проверит, что атрибут value поля subjectsInputField содержит ожидаемый текст "math".


        WebElement hobbiesCheckBoxInputField = driver.findElement(By.xpath("//label[text()='Sports']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", hobbiesCheckBoxInputField);


        WebElement stateAnDCityInputField = driver.findElement(By.xpath("//div[@id=\"state\"]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", stateAnDCityInputField);



        WebElement pictureField = driver.findElement(By.id("uploadPicture"));
        pictureField.sendKeys("C:\\Users\\Honor\\Desktop\\макет");;



        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        String expectedCurrentAddressInputField= "Bishkek";
        currentAddressInputField.sendKeys(expectedCurrentAddressInputField);





        WebElement submitBtn = driver.findElement(By.id("submit")); // btn button
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", submitBtn); //

//        driver.close();
//        driver.quit();








    }
}
