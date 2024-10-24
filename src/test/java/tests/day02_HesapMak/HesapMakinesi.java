package tests.day02_HesapMak;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HesapMakinesi {
    AndroidDriver<AndroidElement> driver;

    @Test

    public void hesapmakinesi() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");//cihazin adi
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Case Sensetive
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\levoo\\IdeaProjects\\Appium_ProjectII\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        //Uygulamianin yuklnedigini dogrular
        Assert.assertTrue(driver.isAppInstalled("com.google.android.calculator"));
        //Uygulamnanin acildigini dogrular
        Assert.assertTrue(driver.findElement(By.id("com.google.android.calculator:id/clr")).isDisplayed());
        //400 un 3 katinin 1200 hesap makinseden dogrular
        driver.findElementByAccessibilityId("4").click();
        driver.findElementByAccessibilityId("0").click();
        driver.findElementByAccessibilityId("0").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementByAccessibilityId("3").click();
        int expectedData=1200;                                                          //sonuc almak icin gettext
        String islemSonucu= driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
        Assert.assertEquals((Integer.parseInt(islemSonucu)),expectedData);



    }
}
