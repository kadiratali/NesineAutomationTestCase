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



public class InvalidLoginStepp extends BaseClass{

    @Given("User launched application")
    public void user_launch_application() throws MalformedURLException, InterruptedException {
        driver = new AppiumDriver<MobileElement>(new URL(LOCALHOST),  getDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @When("User click to login button")
    public void userClickToLoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("User enter invalid username as {string}")
    public void userEnterInvalidUsernameAs(String invaliduser) {
        loginPage = new LoginPage(driver);
        loginPage.setUserName(invaliduser);
    }

    @And("User enter invalid password {string}")
    public void userEnterInvalidPassword(String invalidpass) {
        loginPage = new LoginPage(driver);
        loginPage.setPassword(invalidpass);
    }

    @And("User click a login button")
    public void userClickALoginButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickHomePage();
    }

    @Then("User saw error message")
    public void userSawErrorMessage() {
        WebElement result =  driver.findElement(By.id("android:id/button2"));
        Assert.assertEquals(result.getText(), "TAMAM");
    }
}
