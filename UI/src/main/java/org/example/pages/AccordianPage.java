package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccordianPage extends  BasePage{
    @FindBy(id = "section1Heading")
    public WebElement section1Heading;
    @FindBy(id = "section2Heading")
    public WebElement section2Heading;
    @FindBy(id = "section3Heading")
    public WebElement section3Heading;
    @FindBy(id= "section1Content")
    public WebElement txtSelection1;
    @FindBy(id = "section2Content")
    public WebElement txtSelection2;

    @FindBy(id = "section3Content")
    public WebElement txtSelection3;


    public AccordianPage section1HeadingClick(){
        elementActions.clickTheButton(section1Heading);
        Assert.assertTrue(txtSelection1.getAttribute("innerText").contains("Lorem Ipsum is simply dummy text of the printing"));
        return  this;
    }
    public AccordianPage section2HeadingClick()  {
        elementActions.clickTheButton(section2Heading);
        Assert.assertTrue(txtSelection2.getAttribute("innerText").contains("Contrary to popular belief,"));
        return  this;
    }
    public AccordianPage section3HeadingClick(){
        elementActions.waitButtonToBeClickable(section3Heading);
        Assert.assertTrue(txtSelection3.getAttribute("innerText").contains("It is a long established fact that a reader will "));
        return  this;
    }


}
