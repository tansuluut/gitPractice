import modals.Student;
import org.example.pages.TextBoxPage;
import org.example.pages.WebTablePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;

public class WebTablesTest extends BaseTest{
    @Test
    void fillUpTheFormTest(){
        driver.get("https://demoqa.com/webtables");
       WebTablePage webTablePage = new WebTablePage();
        webTablePage
                .clickAdd()
                .fillUpName("tanos")
                .fillUpLastName("tt")
                .fillUpUserEmail("tanos@gmail.com")
                .fillUpAge("23")
                .fillUpSalary("book")
                .fillUpDepartment("bali")
                .submitBtmClick();

    }
}
