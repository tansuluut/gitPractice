import org.example.pages.CheckBoxPage;
import org.example.pages.RadioButtonPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{
    @Test
    void fillUpTheCheckBox() {
            driver.get("https://demoqa.com/radio-button");
            radioButtonPage
                    .clickYesBtn()
                    .clickImpessiveBtn()
                    .clickNoBtn();


        }
    }
