import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class BrowserWindowTest extends BaseTest{
    @Test
    void test1(){
        driver.get("https://demoqa.com/browser-windows");
        browserWindowPage
                .tabBtnClick()
                .windowBtnClick()
                .messageWindowBtnClick();
    }


}
