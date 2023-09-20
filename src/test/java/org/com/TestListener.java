package org.com;

import common_utils.TestLogger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import mobile.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileNotFoundException;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        TestLogger.info("*****Test started :- " + result.getName() + "*****");
    }

    public void onTestSuccess(ITestResult result) {
        TestLogger.info("*****Test successful :- " + result.getName() + "*****");
    }

    public void onTestFailure(ITestResult result) {
        TestLogger.error("*****Test Failed :- " + result.getName() + "*****");
        Object currentClass = result.getInstance();
        AppiumDriver androidDriver = null;// Replace with your WebDriver setup logic
        androidDriver = BasePage.androidDriver;
        if ((androidDriver != null)) {
                try{
                    Allure.addAttachment(result.getName()+"mobile", "image/png", captureScreenshot(androidDriver).toString());
                }catch (Throwable th){
                    th.getMessage();
            }

        }
        TestLogger.info("Screenshot taken");
    }

    public void onTestSkipped(ITestResult result) {
        TestLogger.error("*****Test Skipped :- " + result.getName() + "*****");
    }


    private byte[] captureScreenshot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        return screenshot;


    }

    @Attachment(value = "Failure Screenshot2", type = "png")
    private byte[] captureScreenshot(AndroidDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
