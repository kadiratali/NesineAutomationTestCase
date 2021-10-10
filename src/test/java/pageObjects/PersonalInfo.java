package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PersonalInfo extends BasePage{


    public PersonalInfo(AppiumDriver<MobileElement> driver){
        super(driver);
    }
    private By checkMemberId = By.id("com.pordiva.nesine.android:id/memberidValue");
    private By Info = By.id("com.pordiva.nesine.android:id/personal_info_btn");
    private By idCheck = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView[3]");


    public void checkId(){
        driver.findElement(checkMemberId).getText();
    }
    public void myInfo(){
        driver.findElement(Info).click();
    }

    public void checkIn(){
      String actualMemberNumber = driver.findElement(idCheck).getText();
      String expectedMemberNumber = "15799224";
      Assert.assertEquals(actualMemberNumber,expectedMemberNumber);
    }

}
