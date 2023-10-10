package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends  BaseTest{
    @Test
    void demo1() throws InterruptedException {
//        driver.navigate().to("https://nambafood.kg/");
//        driver.findElement(By.xpath("(//a[@href='/food'])[1]")).click();
//        Thread.sleep(4000);
//        driver.navigate().back();//назад
//        Thread.sleep(4000);
//        driver.navigate().forward();// вперед пойдет
//        Thread.sleep(4000);
//        driver.navigate().refresh();//обновляет
    }
    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectColor= driver.findElement(By.id("oldSelectMenu"));
        Select select= new Select(selectColor);
//        select.selectByVisibleText("Green");
//
//        Thread.sleep(3000);
//        select.selectByValue("3");
//
//        select.selectByIndex(7);
//       // select.deselectByIndex(7);


        List<WebElement> selectedOption= select.getOptions();
//        for(WebElement option: selectedOption){
//            System.out.println(option.getText());
//        }
        selectRandomColor(select, selectedOption);

    }
    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOption) throws InterruptedException {
//            driver.get("https://demoqa.com/select-menu");
//        WebElement selectReact = driver.findElement(By.id("withOptGroup"));
//        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
//        inputClick.click();
//        WebElement inputText = driver.findElement(By.id("react-select-2-input"));
//
//        List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]//div[contains(text(), 'Group') or contains(text(), 'root option')]"));
//        List<String> menuItemValue = new ArrayList<>();
//
//        for (WebElement item : menuItem) {
//            String text = item.getText();
//            if (!text.equals("GROUP 1") && !text.equals("GROUP 2")) {
//                menuItemValue.add(text);
//            }
//        }
//
//        Random random = new Random();
//        int numberOfItemsToSelect = random.nextInt(menuItemValue.size());
//
//        inputText.sendKeys(menuItemValue.get(numberOfItemsToSelect));
////        inputText.sendKeys(Keys.ENTER);









    }
    }














