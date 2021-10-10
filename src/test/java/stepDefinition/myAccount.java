package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.PersonalInfo;
import pageObjects.Promotions;

public class myAccount extends BaseClass{

    Promotions promotion = new Promotions(driver);
    PersonalInfo personalInfo = new PersonalInfo(driver);

    @When("User click hesabim button")
    public void userClickHesabimButton() {
        loginPage = new LoginPage(driver);
        loginPage.clickBalance();
    }

    @And("User click promosyonlarim button")
    public void userClickPromosyonlarimButton() {
        promotion.clickPromotion();
    }

    @And("User write random number and check the number")
    public void userWriteRandomNumberAndCheckTheNumber() throws InterruptedException {
        promotion.randNumber();
        Thread.sleep(5000);
    }

    @Then("User filled security code correctly.")
    public void userFilledSecurityCodeCorrectly() throws InterruptedException {

    }

    @And("User click the Close button and check that the My Account page is returned again.")
    public void userClickTheCloseButtonAndCheckThatTheMyAccountPageIsReturnedAgain() {
        promotion.QuitBtn();
    }


    @And("go to homepage")
    public void goToHomepage() {
        promotion.goBack();
    }
    @When("Member number is obtained from the home page.")
    public void memberNumberIsObtainedFromTheHomePage() {
        personalInfo.checkId();
    }

    @And("Go to My Account page")
    public void goToMyAccountPage() {
        loginPage = new LoginPage(driver);
        loginPage.clickBalance();
    }

    @And("Click on the My Personal Information button.")
    public void clickOnTheMyPersonalInformationButton() {
        personalInfo.myInfo();
    }


    @Then("it is checked that the member number is displayed correctly.")
    public void itIsCheckedThatTheMemberNumberIsDisplayedCorrectly() {
        personalInfo.checkIn();
    }


}
