package homeWork;

import demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxHW extends BaseTest {

    @Test
    void checkBox(){
        driver.get("https://demoqa.com/checkbox");
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Actions actions = new Actions(driver);
//        WebElement checkboxInputField = driver.findElement(By.xpath("//*/ol/li/span/button"));
//        actions.click(checkboxInputField).perform();
//
//        WebElement desktopClick = driver.findElement(By.xpath("//span[text() = 'Desktop']/../../button"));
//        actions.click(desktopClick).perform();
//
//        WebElement documentsClick = driver.findElement(By.xpath("//span[text() = 'Documents']/../../button"));
//        actions.click(documentsClick).click();
//        WebElement workSpaceClick = driver.findElement(By.xpath("//span[text() = 'WorkSpace']/../../button"));
//        actions.click(workSpaceClick).perform();
//        WebElement officeClick = driver.findElement(By.xpath("//span[text() = 'Office']/../../button"));
//        actions.click(officeClick).perform();
//
//        WebElement downloadClick = driver.findElement(By.xpath("//span[text() = 'Downloads']/../../button"));
//        actions.click(downloadClick).perform();


        List<String> xPaths = new ArrayList<>();
        xPaths.add("//*/ol/li/span/button");
        xPaths.add("//span[text() = 'Desktop']/../../button");
        xPaths.add("//span[text() = 'Documents']/../../button");
        xPaths.add("//span[text() = 'Downloads']/../../button");
        xPaths.add("//span[text() = 'WorkSpace']//../../button");
        xPaths.add("//span[text() = 'Office']/../../button");


        for (String xpath : xPaths) {
            List<WebElement> elements = driver.findElements(By.xpath(xpath));
            if (!elements.isEmpty()) {
                WebElement element = elements.get(0);
                js.executeScript("arguments[0].click()",element);
            }
        }

        List<String> buttons = new ArrayList<>();
        buttons.add("//input[@id ='tree-node-excelFile']");
        buttons.add("//input[@id ='tree-node-wordFile']");
        buttons.add("//input[@id ='tree-node-general']");
        buttons.add("//input[@id ='tree-node-classified']");
        buttons.add("//input[@id ='tree-node-private']");
        buttons.add("//input[@id ='tree-node-public']");
        buttons.add("//input[@id ='tree-node-veu']");
        buttons.add("//input[@id ='tree-node-angular']");
        buttons.add("//input[@id ='tree-node-react']");
        buttons.add("//input[@id ='tree-node-commands']");
        buttons.add("//input[@id ='tree-node-notes']");

        for (String button : buttons) {
            List<WebElement> buttonBoxClickInInputField = driver.findElements(By.xpath(button));
            if (!buttonBoxClickInInputField.isEmpty()) {
                WebElement element = buttonBoxClickInInputField.get(0);
                js.executeScript("arguments[0].click()",element);
            }
        }

        WebElement resText = driver.findElement(By.xpath("//div[@id ='result']"));
        Assert.assertEquals(resText.getText(),"You have selected :" +
                "\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");




    }


    @Test
    void radioButton(){
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/radio-button");
        WebElement  radioButtonInputField = driver.findElement(By.xpath("//input[@id='yesRadio']"));
        actions.click(radioButtonInputField).perform();
        WebElement clickRadioYESText = driver.findElement(By.xpath("//p[text()= 'You have selected ']//span[text()= 'Yes']"));
        Assert.assertEquals(clickRadioYESText.getText(),"Yes");
        //        radioButtonInputField.click();
        //        Assert.assertEquals(radioButtonInputField.getText(),"//input[@id='yesRadio']");
    }

    @Test
    void menuTest(){
        driver.get("https://demoqa.com/menu#");
        Actions actions = new Actions(driver);
        WebElement clickMain2= driver.findElement(By.xpath("//li[a='Main Item 2']"));
        actions.click(clickMain2).perform();
        WebElement subListIntoMain2 = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        actions.click(subListIntoMain2).perform();
        WebElement subItem1ClickIntoSubList= driver.findElement(By.xpath("//a[text()= 'Sub Sub Item 1']"));
        actions.click(subItem1ClickIntoSubList).perform();


    }
    }


