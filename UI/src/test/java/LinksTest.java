import org.example.pages.LinksPage;
import org.testng.annotations.Test;

public class LinksTest extends  BaseTest{
    @Test
    void linksClick(){
        driver.get("https://demoqa.com/links");
        LinksPage linksPage = new LinksPage();
        linksPage
                .clickHome()
                .clickDynamic();
    }
}
