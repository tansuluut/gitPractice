import org.example.pages.DynamicPropertiesPage;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest{
    @Test
    void test(){
        driver.get("https://demoqa.com/dynamic-properties");
        DynamicPropertiesPage dynamicPropertiesPage= new DynamicPropertiesPage();
        dynamicPropertiesPage
                .clickClick()
                .setVisibleA()
                .color();

    }
}
