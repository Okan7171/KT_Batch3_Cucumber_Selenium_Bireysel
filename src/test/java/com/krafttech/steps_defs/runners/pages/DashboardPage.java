package com.krafttech.steps_defs.runners.pages;

import com.krafttech.steps_defs.runners.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//li[.='Dashboard']")
    public WebElement dashboardPageSubTitle;

    @FindBy(xpath = "//main[@id='main']//li[1]")
    public WebElement firstTitle;

    @FindBy(xpath = "//main[@id='main']//li[2]")
    public WebElement secondTitle;

    @FindBy(xpath = "//main[@id='main']//li[3]")
    public WebElement thirdTitle;

    public String getProfilDetails(String job){
        return Driver.get().findElement(By.xpath("//div[.='"+job+"']")).getText();
    }
}
