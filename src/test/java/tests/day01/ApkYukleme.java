package tests.day01;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ApkYukleme {
    //Driverolamadan olmaz server goturemerz
    //Android driver Android cihazlar icin uretilmis ve ona gore ozellikelri eklenmis driver
    AndroidDriver<AndroidElement> driver;
    //Legacy driver oneden tek driver di onceden IOS/ANDROID icin tek driver wardi zamanla ozellikler gelisti
    //AppiumDriver<MobileElement> appiumDriver;
    //IOS driver IOS cihazlar icin uretilmis ve ona gore ozellikelri eklenmis driver
    //IOSDriver<IOSElement> iosDriver;

    @Test

    public void deneme() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4");//cihazin adi
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Case Sensetive
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //UiAutoMator2 Android  6.0 uzeri olan lar icin
        // //UiAutoMator Android 6.0 alti olan
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\levoo\\IdeaProjects\\Appium_ProjectII\\Apps\\Kiwi.com - Book Cheap Flights_2023.14.0_Apkpure.apk");
        //App capability uygulama eger yklu degilse uygulamayi cihaza yuklemek icin kullanilir
        //Eger uygulama yuklu ise ve tekrardan test calistrilirsa App cap uygulamma yuklu mu diye kontrol eder
        //Eger yukli degilse uygulamayi yukler egeryuklu ise uygulamayi acar

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
}
