# Nesine Test Automation
In this test case, login scenarios and my account scenarios have been implemented.
# Table of Contents
- Cucumber
- TestNG
- IntelliJ
- Java
- Appium
- Log4j
- Maven
- Allure
# Structure of Project
> Project structure is POM and Project has these packages
- Features
    - login.feature
    - myAccount.feature
- PageObjects
    - BasePage
    - LoginPage
    - PersonalInfo
    - Promotions
- runnerTest
   -RunnerTest
- stepDefinition
    - BaseClass
    - myAccount
    - InvalidLoginStep
    - ValidLoginStep
- mylogs.log have all log files
- ExtentReportResults.html reporter
# Launch

Start Appium server, open the project in intellij and run the testng.xml or RunnerTest with right click and "Run".

# Sources

Get dependecies from  https://mvnrepository.com/ and http://maven.apache.org/plugins/index.html

# Mobile Device Properties
- Device Model Number : SM-M317F/DSN
- Platform : Android
- Version : 11
