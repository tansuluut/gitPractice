import org.testng.annotations.Test;

public class TexBoxTest extends BaseTest{


        @Test
        void fillUpTheFormTest() {
            driver.get("https://demoqa.com/text-box");
            textBoxPage
                    .fillUpTheFullName("tanos")
                    .fillUpEmail("tanos@gmail.com")
                    .fillUpCurrentAddress("bali")
                    .fillUpPermanentAddress("bish")
                    .submitBtmClick().testTexBoxForm();

        }

    }

