import org.example.pages.ModalDialogsPage;
import org.testng.annotations.Test;

public class ModalDialogs extends BaseTest{
    @Test
    void test(){
        driver.get("https://demoqa.com/modal-dialogs");
        ModalDialogsPage modalDialogsPage = new ModalDialogsPage();
        modalDialogsPage
                .showSmallModalClickClickOnField()
                .closeSmallModalClickOnField()
                .showLargeModalClickOnField()
                .closeLargeModalOnField();
    }
}
