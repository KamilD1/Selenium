package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.manager.PageObjectManager;
import org.example.pages.DasboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class Steps {

    WebDriver driver;
    PageObjectManager pageObjectManager;
    HomePage homePage;
    ChromeOptions options;
    LoginPage loginPage;
    DasboardPage dasboardPage;

    @Given("^User is on home page$")
    public void user_is_on_home_page(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamil\\Desktop\\sda Tester\\java\\Selenium\\Chromedriver\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        pageObjectManager = new PageObjectManager(driver);

        homePage = pageObjectManager.getHomePage();


        homePage.navigateToHomePage();



    }
    // @Before otwieranie strony aby odciążyć homepage

    @When("^User click on login button$")
    public void userClickOnLoginButton() {

        homePage.clickLogin();
    }

    @And("^User enter username$")
    public void userEnterUsername() {
        loginPage = pageObjectManager.getLoginPage();
        loginPage.enterUserName("gunjankaushik");

    }


    @And("User write password")
    public void userWritePassword() {
        loginPage.enterPassword("Password@123");
    }

    @And("^User click login button$")
    public void userClickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("^Correct user is log in$")
    public void correctUserIsLogIn() {
        dasboardPage = pageObjectManager.getDasboardPage();
        Assert.assertEquals("gunjankaushik", dasboardPage.userLogin());


    }
}
