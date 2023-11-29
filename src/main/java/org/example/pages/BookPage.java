package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BookPage {
    WebDriver driver;

    public BookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "mr-2")
    List<WebElement> listOfBooks;

    List<String> bookName = new ArrayList<>();
    List<String> isbnList = new ArrayList<>();


    public void bookSearch() {

        for (WebElement book : listOfBooks) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            String nameBook = book.getText();             //pobieramy nazwy książek
            bookName.add(nameBook);             //dodajemy nazwę książki do listy
            driver.findElement(By.id("see-book-" + nameBook)).click();      //znajdujemy nazwę książki i wchodzimy w nią
            String isbn = driver.findElement(By.id("userName-value")).getText();  // zapisujemy isbn w zmiennej isbn
            isbnList.add(isbn);  //dodajemy do listy
            driver.findElement(By.id("addNewRecordButton")).click();          //wracamy na stronę główną


        }


        for (String number : isbnList) {
            System.out.println(number);
        }


    }


}
