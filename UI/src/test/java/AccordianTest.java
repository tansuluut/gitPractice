import org.example.pages.AccordianPage;
import org.testng.annotations.Test;

public class AccordianTest extends BaseTest{
    @Test
    void test() throws InterruptedException {
        driver.get("https://demoqa.com/accordian");
        AccordianPage accordianPage =  new AccordianPage();
        accordianPage
                .section1HeadingClick()
                .section2HeadingClick()
                .  section3HeadingClick();
    }
}
