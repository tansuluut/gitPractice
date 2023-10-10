package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;


import java.time.Duration;

public  abstract class BaseTest {

    public WebDriver driver;
    @BeforeClass
    public void setUpBrowser(){



        WebDriverManager.chromedriver().setup(); // set up the chrome  driver

        driver = new ChromeDriver();// create new object
//        driver = new FirefoxDriver();

        driver.manage().window().maximize();//  make full screen

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//set up the time

        PageFactory.initElements(driver, this);
    }

}
