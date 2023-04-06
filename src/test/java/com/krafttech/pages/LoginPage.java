package com.krafttech.pages;

import com.krafttech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class LoginPage extends BasePage {

//    public LoginPage(){
//       PageFactory.initElements(Driver.get(),this);
//    }

    @FindBy(css ="#email" )
    public WebElement userEmailInput_loc;

    @FindBy(css = "#yourPassword")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//*[.='Login']")
    public  WebElement loginBtn_loc;

    @FindBy(xpath ="//*[contains(text(),'Password is incorrect. Please check')]" )
    public WebElement passwordWarningMessage_loc;

    @FindBy(xpath = "//*[contains(text(),'Email address is incorrect. Please check')]")
    public WebElement emailWarningMessage_loc;

    //list
    @FindBy(xpath = "(//span[.='Alerts']/../../..)[1]/li")
    public List<WebElement> componentsMenuList_loc;

   // if one of the element is true it is pass => OR
    @FindAll({
            @FindBy(css ="#email" ),
            @FindBy(name = "email")
    })
    public WebElement userEmail2_loc;
    // All locator should be true => AND
    @FindBys({
            @FindBy(css ="#email" ),
            @FindBy(name = "email")
    })
    public WebElement userEmail3_loc;


    public void login(){
        String userEmail= ConfigurationReader.get("userEmail");
        String password= ConfigurationReader.get("password");

        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }

    public void login(String userEmail, String password){
        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }

    public void loginAsJhon(){
        String userEmail= ConfigurationReader.get("userEmail2");
        String password= ConfigurationReader.get("password2");

        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }
    public void loginAsEddie(){
        String userEmail= ConfigurationReader.get("userEmail3");
        String password= ConfigurationReader.get("password3");

        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }
    public void loginAsMorgan(){
        String userEmail= ConfigurationReader.get("userEmail4");
        String password= ConfigurationReader.get("password4");

        userEmailInput_loc.sendKeys(userEmail);
        passwordInput_loc.sendKeys(password);
        loginBtn_loc.click();
    }





}
