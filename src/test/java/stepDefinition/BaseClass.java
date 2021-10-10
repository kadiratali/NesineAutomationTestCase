package stepDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;
    public LoginPage loginPage;
    public static final String LOCALHOST = "http://0.0.0.0:4723/wd/hub";


    public void setup(String deviceName, String udid, String platformVersion, String url) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = getDesiredCapabilities();

        driver = new AppiumDriver<MobileElement>(new URL(LOCALHOST),cap);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }


    public DesiredCapabilities getDesiredCapabilities(){

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("browserstack.appiumLogs","false");
        cap.setCapability("deviceName","SM-M317F/DSN");
        cap.setCapability("udid","R58R20E4Q2J");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("appPackage","com.pordiva.nesine.android");
        cap.setCapability("appActivity","com.nesine.ui.taboutside.splash.SplashActivity");
        return cap;


    }
}
