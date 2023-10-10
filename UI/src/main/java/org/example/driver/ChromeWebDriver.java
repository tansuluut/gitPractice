package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");// отключить расширения


        if(Boolean.parseBoolean(ConfigReader.getProperty("headless"))){// преобразовыет
            options.addArguments("--headless"); //добавляем опцию
        }


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }


}
