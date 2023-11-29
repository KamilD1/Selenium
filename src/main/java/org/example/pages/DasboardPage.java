package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class DasboardPage {
    WebDriver driver;
    public DasboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "userName-value")
    WebElement userName;


    public String userLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        return userName.getText(); //znajdź login użytkownika i pobierz go do zmiennej


    }

}
