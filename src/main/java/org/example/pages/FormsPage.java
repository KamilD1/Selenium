package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FormsPage {
    WebDriver driver;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement userEmail;
    @FindBy(className = "custom-control-label")
    WebElement gender;
    @FindBy(id = "userNumber")
    WebElement userNumber;
    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;
    @FindBy(id = "submit")
    WebElement submit;
    //@FindBy(id="enterSubject")
    //WebElement enterSubject ;
    List<WebElement> name = new ArrayList<>();
    List<WebElement> name2 = new ArrayList<>();


    public void clickForms() {   // ma klikać w Forms


        name = driver.findElements(By.className("header-wrapper"));// znajdź header wrapper, wszystkie są takie same
        WebElement secondElement = name.get(1);
        secondElement.click();    //kliknij w drugi element listy

        name2 = driver.findElements(By.id("item-0"));// znajdź item-0, wszystkie są takie same (znajduje też te których my nie widzimy
        WebElement secondEl = name2.get(1); // przypisz drugi element listy do zmiennej
        secondEl.click();  //kliknij drugi element listy

    }

    public void enterFirstName(String name) { // wpisze imię
        firstName.sendKeys(name);
    }

    public void enterLastName(String name) { // wpisz nazwisko
        lastName.sendKeys(name);
    }

    public void enterUserEmail(String email) {
        userEmail.sendKeys(email);
    }

    public void enterGender() {
        gender.click();
    }

    public void enterUserNumber(String number) {
        userNumber.sendKeys(number);
    }


    public void enterDateOfBirth(String dayMonthYear) {
        dateOfBirthInput.sendKeys(dayMonthYear);
    }
    /*
    public void enterSubject(String subjectAuto){
        subject.sendKeys(subjectAuto);
    }*/

    public void clickSubmit() {
        submit.click();
    }

}




