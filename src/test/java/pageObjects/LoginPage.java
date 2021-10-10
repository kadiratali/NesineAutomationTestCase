package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public LoginPage(AppiumDriver<MobileElement> driver){
        super(driver);
    }


    private By btnLogin = By.id("btn_login");
    private By txtUserName = By.id("username_edit");
    private By txtPassword = By.id("password_edit");
    private By loginBtn = By.id("login_btn");
    private By balanceBtn = By.id("user_info_container");
    private By logOutBtn = By.id("logout_btn");
    private By askLogin = By.id("ask_login_rb");


    public void clickLoginButton(){
        driver.findElement(btnLogin).click();
    }

    public void setUserName(String email){
        driver.findElement(txtUserName).clear();
        driver.findElement(txtUserName).sendKeys(email);
    }
    public void setPassword(String password){
        driver.findElement(txtPassword).clear();
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void askLogin(){
        driver.findElement(askLogin).click();
    }


    public void clickHomePage(){
        driver.findElement(loginBtn).click();
    }
    public void clickBalance(){
        driver.findElement(balanceBtn).click();
    }

    public void logOut(){
        driver.findElement(logOutBtn).click();
    }


}
