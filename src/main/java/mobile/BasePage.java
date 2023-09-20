package mobile;

import common_utils.ConfigLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
     public static AppiumDriver androidDriver;

    public AppiumDriver getDriver() {
        ConfigLoader configLoader = new ConfigLoader();
        DesiredCapabilities capabilities = new DesiredCapabilities(configLoader.getCapability());
        try {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return androidDriver;
    }
}
