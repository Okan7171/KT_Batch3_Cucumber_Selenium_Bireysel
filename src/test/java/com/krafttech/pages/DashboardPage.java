package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

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
