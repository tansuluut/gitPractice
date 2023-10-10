import org.example.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys(Keys.ENTER);
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));

        for (WebElement brand:brands) {
            System.out.println(brand.getText());
            WebElement checkBox = brand.findElement(By.tagName("input"));
            checkBox.click();
        }
        driver.close();
        driver.quit();


    }
}
