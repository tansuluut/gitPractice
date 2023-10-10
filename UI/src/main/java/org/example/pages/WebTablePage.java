package org.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.driver.Driver.driver;

public class WebTablePage extends BasePage {
    @FindBy(id = "addNewRecordButton")
    public WebElement clickAddButton;

    @FindBy(id = "firstName")
    public WebElement nameInputField;
    @FindBy(id = "lastName")
    public WebElement lastNameInputField;

    @FindBy(id = "userEmail")
    public WebElement userEmailInputField;
    @FindBy(id = "age")
    public WebElement ageUserInputField;
    @FindBy(id = "salary")
    public WebElement salaryInputField;

    @FindBy(id = "department")
    public WebElement departmentInputField;
    @FindBy(id = "//*[@id=submit]")
    public WebElement submitClick;
    public  WebTablePage clickAdd(){
        elementActions.clickTheButton(clickAddButton);
        return this;
    }

    public WebTablePage fillUpName(String txt){
        elementActions.writeText(nameInputField,txt);
        return this;
    }
    public WebTablePage fillUpLastName(String txt){
        elementActions.writeText(lastNameInputField,txt);
        return this;
    }
    public WebTablePage fillUpUserEmail(String txt){
        elementActions.writeText(userEmailInputField,txt);
        return this;
    }
    public WebTablePage fillUpAge(String txt){
        elementActions.writeText(ageUserInputField,txt);
        return this;
    }
    public WebTablePage fillUpSalary(String txt){
        elementActions.writeText(salaryInputField,txt);
        return this;
    }
    public WebTablePage fillUpDepartment(String txt){
        elementActions.writeText(departmentInputField,txt);
        return this;
    }
    public WebTablePage submitBtmClick(){
        elementActions.waitButtonToBeClickAble(submitClick);
        return this;
    }

}
