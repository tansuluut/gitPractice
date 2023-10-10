import org.example.pages.ButtonsClickPage;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{
    @Test
     void fillUpClick(){
        driver.get("https://demoqa.com/buttons");
        buttonsClickPage
                .doubleClickOnButton()
                .rightClickOnButton()//исправь
                .clickMeOnButton();

    }
}
