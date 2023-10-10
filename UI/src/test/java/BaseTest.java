import com.beust.ah.A;
import org.example.driver.Driver;
import org.example.pages.*;
import org.example.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public  abstract class BaseTest {
    public WebDriver driver;
    public RegistrationPage.TextBoxPage textBoxPage;
    public PracticeFormPage practiceFormPage;
    public FakeDataProvider fakeDataProvider;

    public CheckBoxPage checkBoxPage;
    public WebTablePage webTablePage;
    public RadioButtonPage radioButtonPage;
    public ToolTipsPage toolTipsPage;
    public ButtonsClickPage buttonsClickPage;
    public AlertPage alertPage;
    public BrowserWindowPage browserWindowPage;
    public FramePage framePage;


    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver= Driver.getDriver();
        textBoxPage= new RegistrationPage.TextBoxPage(driver);
        practiceFormPage= new PracticeFormPage();
        fakeDataProvider= new FakeDataProvider();
        checkBoxPage = new CheckBoxPage();
        radioButtonPage= new RadioButtonPage();
        toolTipsPage= new ToolTipsPage();
        buttonsClickPage= new ButtonsClickPage();
        alertPage=  new AlertPage();
        browserWindowPage=  new BrowserWindowPage();
        framePage = new FramePage();


    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){

        Driver.closeDriver();
    }
}
