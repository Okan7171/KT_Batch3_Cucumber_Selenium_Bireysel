package com.krafttech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage {

    //driver.findelement(...)
    @FindBy(css = "#about")
    public WebElement aboutInputBox;

    @FindBy(xpath = "(//input[@id='company'])[1]")
    public WebElement companyInputBox;

    @FindBy(xpath = "//select[@id='job']")
    public WebElement jobTitle;

    @FindBy(css = "#website")
    public WebElement websiteInputBox;

    @FindBy(xpath = "(//input[@id='location'])[1]")
    public WebElement locationInputBox;

    @FindBy(css = "#skills")
    public WebElement skillsInputBox;

    @FindBy(xpath = "//button[.='Save Changes']")
    public WebElement saveChangesButton;

    public void selectJob(String jobDescription){
        Select select = new Select(jobTitle);
        select.selectByVisibleText(jobDescription);
    }
}
