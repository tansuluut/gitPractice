package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dynamic extends BaseTest{

  @Test
  void demo1(){
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    driver.get("https://demoqa.com/dynamic-properties");
    js = (JavascriptExecutor) driver;

//	     wait.until(ExpectedConditions.attributeToBe(By.id("colorChange"), "color", "rgba(220, 53, 69, 1)"));

    // если закомментировать он сразу поменяет цвет а так будет ждать когда кнопка станет красной
    WebElement colorChangeBtn = driver.findElement(By.id("colorChange"));
    js.executeScript("arguments[0].style.background = 'white';", colorChangeBtn);

  }

//@Test
//void demo1(){
//  wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//  driver.get("https://demoqa.com/dynamic-properties");
//  wait.until(ExpectedConditions.elementToBeClickable(By.id("enableAfter"))).click();
//  // ждет пока элемент станет кликабельным
//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter"))).click();
//  // ждет когда появится
//  js = (JavascriptExecutor) driver;
//  wait.until(ExpectedConditions.attributeToBe(By.id("colorChange"), "color", "rgba(220, 53, 69, 1)"));
//  // если закомментировать он сразу поменяет цвет а так будет ждать когда кнопка станет красной
//  WebElement colorChangeBtn = driver.findElement(By.id("colorChange"));
//  js.executeScript("arguments[0].style.background = 'white';", colorChangeBtn);
//
//}


  @FindBy(id = "enableAfter")
  public WebElement enableAfter;

  @FindBy(xpath = "//button[@id = 'colorChange']")
  public WebElement colorChange;

  @FindBy(id = "visibleAfter")
  public WebElement visibleAfter;



  @Test(priority = 1)
  public void clickClick() throws InterruptedException {
    driver.get("https://demoqa.com/dynamic-properties");

    new WebDriverWait(driver,Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(By.id("enableAfter")))
            .click();
    Thread.sleep(3000);
  }

  @Test(priority = 2)
  public void visibleA() throws InterruptedException {
    new WebDriverWait(driver,Duration.ofSeconds(7))
            .until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")))
            .click();
    Thread.sleep(3000);
  }

  @Test(priority = 3)
  public void colorBut() throws InterruptedException {
    new WebDriverWait(driver,Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id = 'colorChange']")))
            .click();
    Thread.sleep(3000);
  }


}
