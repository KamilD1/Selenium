package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {     //KONSTRUKTOR
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id="userName")
    WebElement userName;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login")
    WebElement findLogin;

    public void enterUserName(String user) {
        userName.sendKeys(user);   //"gunjankaushik"
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass); // "Password@123"


    }
    public void clickLogin(){
        findLogin.click();
    }



}
