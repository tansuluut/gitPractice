import org.testng.annotations.Test;

public class ToolTipsTest extends BaseTest{
    @Test
    void Test(){
        driver.get("https://demoqa.com/tool-tips");
        toolTipsPage
                .checkHoverBtn()
                .checkHoverTextField()
                .checkHoverLink();
    }

}
