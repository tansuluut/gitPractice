package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
    private  Driver(){ // нельзя создать обьект этого класса
        //singleton pattern
    }
    public static WebDriver driver;
    public  static  WebDriver getDriver() {
        if (driver==null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "fox":
                    driver = FirefoxWEbDriver.loadFireFoxWEbDriver();
                    break;
                default:
                    throw new IllegalArgumentException("You provider wrong Driver name");
            }
            }
        return driver;
           
    }

    public  static void closeDriver(){
        try {
            if (driver!= null){
                driver.close();
                driver.quit();
                driver = null;// чтоб войти в тело if
            }
        }catch (Exception e){
            System.out.println("Error while closing the driver");
        }
    }

    
}
