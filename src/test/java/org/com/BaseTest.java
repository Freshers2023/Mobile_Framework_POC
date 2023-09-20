package org.com;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobile.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import common_utils.TestLogger;
import org.testng.annotations.Listeners;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.time.Duration;


@Listeners(TestListener.class)
public class BaseTest {

    AppiumDriver androidDriver;
    @BeforeClass
    public void setUp(){
        androidDriver = new BasePage().getDriver();
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod(Method m){
        TestLogger.info("STARTING TEST: " + m.getName());
        TestLogger.info("THREAD ID: " + Thread.currentThread().getId());
    }

    @AfterClass
    public void tearDown() {
        androidDriver.quit();
        TestLogger.shutdown();
    }

}
