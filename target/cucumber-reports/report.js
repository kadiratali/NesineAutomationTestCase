$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/Hesabim.feature");
formatter.feature({
  "name": "Promosyonlarım",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Background:",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.step({
  "name": "User launch application",
  "keyword": "Given "
});
formatter.match({
  "location": "ValidLoginStep.user_launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "When "
});
formatter.match({
  "location": "ValidLoginStep.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username as \"kadir611992\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStep.user_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter password \"4c1m4s1z\"",
  "keyword": "And "
});
formatter.match({
  "location": "ValidLoginStep.user_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login",
  "keyword": "And "
});
formatter.match({
  "location": "ValidLoginStep.user_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Go to Promosyonlarim",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User click hesabim button",
  "keyword": "When "
});
formatter.match({
  "location": "Hesabim.userClickHesabimButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click promosyonlarim button",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.userClickPromosyonlarimButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User write random number and check the number",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.userWriteRandomNumberAndCheckTheNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User filled security code correctly.",
  "keyword": "Then "
});
formatter.match({
  "location": "Hesabim.userFilledSecurityCodeCorrectly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Close button and check that the My Account page is returned again.",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.userClickTheCloseButtonAndCheckThatTheMyAccountPageIsReturnedAgain()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to homepage",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.goToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "My Personal Informations",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Member number is obtained from the home page.",
  "keyword": "When "
});
formatter.match({
  "location": "Hesabim.memberNumberIsObtainedFromTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to My Account page",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.goToMyAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the My Personal Information button.",
  "keyword": "And "
});
formatter.match({
  "location": "Hesabim.clickOnTheMyPersonalInformationButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it is checked that the member number is displayed correctly.",
  "keyword": "Then "
});
formatter.match({
  "location": "Hesabim.itIsCheckedThatTheMemberNumberIsDisplayedCorrectly()"
});
formatter.result({
  "status": "passed"
});
});