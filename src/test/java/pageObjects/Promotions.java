package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.UUID;

public class Promotions extends BasePage{

    public Promotions(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    String uuid = UUID.randomUUID().toString();

    private By btnPromosyon = By.id("my_promotions_btn");
    private By PromosyonKod = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
    private By SecurityCode = By.id("securityCode");
    private By QuitButton = By.id("back");
    private By gohome = By.id("com.pordiva.nesine.android:id/back");

    public void clickPromotion(){
        driver.findElement(btnPromosyon).click();
    }


    public void randNumber(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(PromosyonKod)));
        driver.findElement(PromosyonKod);
        driver.findElement(PromosyonKod).sendKeys(uuid);

    }

    public void QuitBtn(){
        driver.findElement(QuitButton).click();
        WebElement result =  driver.findElement(By.id("com.pordiva.nesine.android:id/title"));
        Assert.assertEquals(result.getText(), "HESABIM");
    }

    public void goBack(){
        driver.findElement(gohome).click();
    }

}
