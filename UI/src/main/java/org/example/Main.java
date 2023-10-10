package org.example;


import modals.Student;
import org.example.driver.ChromeWebDriver;
import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.example.helper.FrameHelper;
import org.example.helper.ScreenShotMethods;
import org.example.pages.RegistrationPage;
//import org.example.pages.TextBoxPage;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class Main<TextBoxPage> {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        WebDriver driver= ChromeWebDriver.loadChromeDriver();//static method
        driver.get("https://www.google.com/");



        Student jonh =new Student("tanos","tanos","tast@.com","08987788","bali");
        System.out.println(jonh.getFirstName());


    }



    WebDriver driver;
    @BeforeClass
    public void setUp()  {
        driver = Driver.getDriver();
    }
//    @Test
//    void test(){
//        driver.get("https://demoqa.com/text-box/");
//        TextBoxPage textBoxPage= new TextBoxPage(driver);
//        textBoxPage
//                .fillUpTheFullName("tanos")
//                .fillUpEmail("tanosSoska@gamil.com")
//                .fillUpCurrentAddress("Bali")
//                .fillUpPermanentAddress("bishkek")
//                .submitBtmClick().testTexBoxForm();
//    }


    @Test
    public void test2 (){
        driver.get("https://demoqa.com/automation-practice-form");
        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        Student student =  new Student();
        student.setFirstName("Tanos");
        student.setLastName("nono");
        student.setEmail("tanos.sdxh@mail.com");
        student.setPhoneNumber("098776655");
        student.setCurrentAddress("bali");

    }

//    @Test
//    public void testRegistration(){
//        driver.get("https://demoqa.com/register");
//        RegistrationPage registrationPage = new RegistrationPage();
//
//        registrationPage
//                .fillUpFirstName("tansuluu")
//                .fillUpLastName("totosheva")
//                .fillUpUserName("tanos")
//                .filUpPassword("1234")
//                .clickIAmNotARobot()
//                .clickTheSubmitBtn();
//    }
    @Test
    public void loginRegistration(){
        driver.get("https://demoqa.com/login");
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage
                .fillUpUserNameLogin("tanos")
                .fillUpPasswordLogin("1234")
                .clickTheLoginBtn();


    }

    @Test
    void test1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();//находим кнопку и кликаем
        Alert alert = driver.switchTo().alert();//интерфейс  переключаеьтся , у аллерта нет атрибута
        Thread.sleep(2000);
        alert.accept();


        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));//explicit wait
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();// принимает условие

        driver.findElement(By.id("confirmButton")).click();
        alert.dismiss();//используется для отклонения

        driver.findElement(By.id("promtButton")).click();
        alert.sendKeys("tanos");
        alert.accept();
    }


    @Test
    void  alertTeat() throws IOException {
        WebDriver driver = Driver.getDriver();
        ScreenShotMethods screenShotMethods =  new ScreenShotMethods();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper();
        alertHelper.acceptAlert();

        driver.findElement(By.id("timerAlertButton")).click();
        alertHelper.acceptAlert();

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.dismissAlert();

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("tanos");
        screenShotMethods.takeScreenShot();
    }
    @Test
    void testFrame(){
        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");// переключиться
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();//возвращвет на основной  корневой html
        WebElement div = driver.findElement(By.xpath("//div[@id= 'framesWrapper']/div"));
        System.out.println(div.getText());
    }

    @Test
    void test12(){
        driver.get("https://demoqa.com/nestedframes");

        driver.switchTo().frame("frame1");//first go to parent frame
        driver.switchTo().frame(0);// then go to child frame
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"Child Iframe");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();

//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Child Iframe");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().defaultContent();
    }

    @Test
    void test10(){//den
        driver.get("https://demoqa.com/frames");
        FrameHelper frameHelper = new FrameHelper(driver);
        frameHelper.switchToFrame("frame1");
        WebElement text = driver.findElement(By.tagName("h1"));
        System.out.println(text.getText());
        frameHelper.switchToDefaultContent();
        WebElement div  = driver.findElement(By.xpath("//div[@id='framesWrapper']/div"));
        System.out.println(div.getText());
    }
    @Test
    void test123(){
        driver.get("https://demoqa.com/nestedframes");
        FrameHelper frameHelper = new FrameHelper(driver);
        frameHelper.switchToFrame("frame1");
//        driver.findElement(By.tagName("p"));
        frameHelper.switchToChildFrame(0);
        frameHelper.switchToParentFrame();
        driver.findElement(By.tagName("body"));
        frameHelper.switchToDefaultContent();


    }



}










