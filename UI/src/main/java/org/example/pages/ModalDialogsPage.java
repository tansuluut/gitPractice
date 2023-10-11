package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ModalDialogsPage extends BasePage{
    @FindBy(id = "showSmallModal")
    public WebElement showSmallModalClick;
    @FindBy(id = "showLargeModal")
    public WebElement showLargeModalClick;
    @FindBy(id = "closeSmallModal")
    public WebElement closeSmallModalClick;

    @FindBy(id = "closeLargeModal")
    public WebElement closeSmallModal;
    @FindBy(xpath= "/html/body/div[5]/div/div/div[2]")
    public WebElement txtSmallModal;
    @FindBy(xpath= "/html/body/div[5]/div/div/div[2]/p")
    public WebElement txtLargeModal;


    public ModalDialogsPage showSmallModalClickClickOnField(){
        elementActions.clickTheButton(showSmallModalClick);
        Assert.assertTrue(txtSmallModal.getAttribute("innerText").contains("This is a small modal."));
        return this;
    }
    public ModalDialogsPage showLargeModalClickOnField(){
        elementActions.clickTheButton(showLargeModalClick);
        Assert.assertTrue(txtLargeModal.getAttribute("innerText").contains("Lorem Ipsum is simply dummy text"));
        return this;
    }
    public ModalDialogsPage closeSmallModalClickOnField(){
        elementActions.clickTheButton(closeSmallModalClick);
        return this;
    }
    public ModalDialogsPage closeLargeModalOnField(){
        elementActions.clickTheButton(closeSmallModal);
        return this;
    }

}
