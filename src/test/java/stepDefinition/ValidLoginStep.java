package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ValidLoginStep extends BaseClass{


    @Given("User launch application")
    public void user_launch_application() throws MalformedURLException, InterruptedException {
        driver = new AppiumDriver<MobileElement>(new URL(LOCALHOST),  getDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }
    @Then("User enter username as {string}")
    public void user_enter_username_as(String id) {
        loginPage = new LoginPage(driver);
        loginPage.setUserName(id);
    }
    @Then("User enter password {string}")
    public void user_enter_password(String password) {
        loginPage = new LoginPage(driver);
        loginPage.setPassword(password);
    }
    @And("User click asklogin")
    public void userClickAsklogin() {
        loginPage = new LoginPage(driver);
        loginPage.askLogin();
    }

    @Then("User click login")
    public void user_click_login() {
        loginPage = new LoginPage(driver);
        loginPage.clickHomePage();
    }

    @Then("User click balance button")
    public void user_click_balance_button() {
        loginPage = new LoginPage(driver);
        loginPage.clickBalance();
    }
    @Then("User click logout button")
    public void user_click_logout_button() {
        loginPage = new LoginPage(driver);
        loginPage.logOut();
        WebElement result = driver.findElement(By.id("com.pordiva.nesine.android:id/tv_nesinetv"));
        Assert.assertEquals(result.getText(), "Nesine TV");
    }


}
