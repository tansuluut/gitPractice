import org.testng.annotations.Test;

public class AlertTest extends BaseTest{
    @Test
    void test(){
        driver.get("https://demoqa.com/alerts");
        alertPage
                .clickToAlertButton()
                .clickToTimerAlertButton()
                .clickToConfirmResult()
                .clickToPromptResult();
    }
}
