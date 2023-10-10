package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksPage extends BasePage{
    @FindBy(id = "simpleLink")
    public WebElement homeClick;
    @FindBy(id = "dynamicLink")
    public WebElement dynamicLinkClick;

    public LinksPage clickHome(){
        elementActions.clickTheButton(homeClick);
        return this;
    }
    public LinksPage clickDynamic(){
        elementActions.clickTheButton(dynamicLinkClick);
        return this;
    }
}
