package org.example.manager;

import org.example.pages.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    HomePage homePage;
    DasboardPage dasboardPage;
    BookPage bookPage;
    FormsPage formsPage;
    LoginPage loginPage;
    WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;    // jeżeli homePage jest równy null to tworzysz homePage, jeżeli nei to robisz nowego

    }

    public DasboardPage getDasboardPage() {
        return (dasboardPage == null) ? dasboardPage = new DasboardPage(driver) : dasboardPage;
    }

    public BookPage getBookPage() {
        return (bookPage == null) ? bookPage = new BookPage(driver) : bookPage;
    }

    public FormsPage getFormsPage() {
        return (formsPage == null) ? formsPage = new FormsPage(driver) : formsPage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }
}
