import org.example.pages.CheckBoxPage;
import org.testng.annotations.Test;

public class CheckBoxTest  extends BaseTest{
    @Test
    void fillUpTheCheckBox(){
        driver.get("https://demoqa.com/checkbox");
        CheckBoxPage checkBoxPage= new CheckBoxPage();
        checkBoxPage.clickCheckHome()
                .clickCheckHome()
                .chooseElement()
                .testAssert();


    }


}
