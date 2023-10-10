package homeWork;

import demo.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import javax.xml.datatype.Duration;

public class NambaFood  extends BaseTest {

    @Test
    void menuFood(){
        driver.get("https://nambafood.kg/");
        WebElement linkToClickFood = driver.findElement(By.xpath("//ul[@class='nav']//a[@href='/food']"));
        linkToClickFood.click();
        WebElement  nationFoodClick= driver.findElement(By.xpath("//div[@class='cat-item--title']"));
        nationFoodClick.click();
        WebElement faizaFoodClick= driver.findElement(By.xpath("//div[@class='catalog-wrap']//a[@href='/faiza']"));
        faizaFoodClick.click();
        WebElement ChooseMamparClickUp= driver.findElement(By.xpath("//div[@data-item-name='Мампар']//div[2]//div[2]"));
        ChooseMamparClickUp.click();
        ChooseMamparClickUp.click();
        WebElement makeOrderMamparClick= driver.findElement(By.xpath("//div[@data-item-name='Мампар']/button"));
        makeOrderMamparClick.click();
        WebElement ChooseChuchvaraClickUp= driver.findElement(By.xpath("//div[@data-item-name='Чучвара']//div[2]//div[2]"));
        ChooseChuchvaraClickUp.click();
        ChooseChuchvaraClickUp.click();
        WebElement makeOrderChuchvaraClick= driver.findElement(By.xpath("//div[@data-item-name='Чучвара']/button"));
        makeOrderChuchvaraClick.click();
//        WebElement napitkChooseClick= driver.findElement(By.xpath("//div[@id='filter--init']//div[11]"));
//        napitkChooseClick.click();
//        WebElement orderCompoteBtn  = driver.findElement(By.xpath("By.xpath(\"/html/body/main/section/div[1]/div[5]/div[13]/div[2]/div/button"));;
//        orderCompoteBtn.click();
//        WebElement priceBottonClick= driver.findElement(By.xpath("By.id(\"cart\")"));
//        //*[@id=\"cart\"]/a/svg"
//        priceBottonClick.click();


        WebElement linkToOrderPage = driver.findElement(By.xpath("//div[@class='login ']//div[@id='cart']"));
        linkToOrderPage.click();
        WebElement endOrderOrderFood=driver.findElement(By.xpath("//button[contains(text(), 'Оформить заказ')]"));
        endOrderOrderFood.click();


        WebElement clientNameInputField = driver.findElement(By.xpath("//input[@id='food_order_client_name']"));
        String userNameAndLastName="zhoroev erzan";
        clientNameInputField.sendKeys(userNameAndLastName);

        WebElement clientAddressInputField = driver.findElement(By.xpath("//input[@id='food_order_address']"));
        String userAddressInputField= "vefa";
        clientAddressInputField.sendKeys(userAddressInputField);

        WebElement clientAddressOfFlatInputField = driver.findElement(By.xpath("//input[@id='food_order_door_code']"));
        clientAddressOfFlatInputField.sendKeys("1этаж");


        WebElement clientNumberInputField= driver.findElement(By.xpath("//input[@id= 'food_order_phone']"));
        String realClientNumber= "0777776773";
        clientNumberInputField.sendKeys(realClientNumber);

        WebElement moreInfoInInputField= driver.findElement(By.xpath("//textarea[@id= 'food_order_additional_info']"));
        String informationInField= "можно не слишком много соли";
        moreInfoInInputField.sendKeys(informationInField);

        WebElement howMuchMoneyDoYouHaveNow=driver.findElement(By.xpath("//input[@id= 'food_order_money_change']"));
        String clientMoneys= "4000";
        howMuchMoneyDoYouHaveNow.sendKeys(clientMoneys);

//        WebElement sendAnOrderToFaiza= driver.findElement(By.xpath("//button[@id= 'payment_cash']"));
//        sendAnOrderToFaiza.click();


    }

}
