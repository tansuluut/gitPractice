package demo.practice;

import demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class WebTables extends BaseTest {
    @Test
    void start(){
        driver.get("https://demoqa.com/webtables");
        addNewPersonToTable();
        checkUserInTable();


    }
    void addNewPersonToTable(){
        WebElement addBtn = driver.findElement(By.id("addNewRecordButton"));
        addBtn.click();
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("arslan");
        Assert.assertNotNull(firstNameInput);
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("abdyzhalilov");
        Assert.assertNotNull(lastNameInput);

        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$";
        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        userEmailInput.sendKeys("hdfjkfddd@dd.hh");
        String emailText = userEmailInput.getAttribute("value");
        boolean isValidEmail = Pattern.matches(emailPattern, emailText);
        Assert.assertTrue(isValidEmail);

        WebElement ageInput = driver.findElement(By.id("age"));
        ageInput.sendKeys("44");
        Assert.assertNotNull(ageInput);

        WebElement salaryInput = driver.findElement(By.id("salary"));
        salaryInput.sendKeys("44");
        Assert.assertNotNull(salaryInput);

        WebElement departmentInput = driver.findElement(By.id("department"));
        departmentInput.sendKeys("tokmok");
        Assert.assertNotNull(departmentInput);

        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();

//        listOfValue.add(firstNameInput.getText());
//        listOfValue.add(lastNameInput.getText());
//        listOfValue.add(userEmailInput.getText());
//        listOfValue.add(ageInput.getText());
//        listOfValue.add(salaryInput.getText());
//        listOfValue.add(departmentInput.getText());

    }
    void checkUserInTable(){
        WebElement tableContainer = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        List<WebElement> userBlocks = tableContainer.findElements(By.xpath("./div"));
//        List<String> userDatas = new LinkedList<>();
        if (userBlocks.size() >= 4) {
            WebElement fourthDiv = userBlocks.get(3);
            String fourthDivText = fourthDiv.getText();
//            userDatas.add(fourthDivText);
        }
    }
    List<String>listOfValue = new ArrayList<>();



}
