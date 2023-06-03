package Utilities;

import Driversetup.DriverSetup;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CaptureScreenShot extends DriverSetup implements ITestListener {


    public void onTestStart(ITestResult iTestResult) {

    }


    public void onTestSuccess(ITestResult iTestResult) {

    }


    public void onTestFailure(ITestResult testResult) {
        System.out.println("This test case has been failed");
        try {
            takeScreenshots(testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void onTestSkipped(ITestResult iTestResult) {

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    public void onStart(ITestContext iTestContext) {

    }


    public void onFinish(ITestContext iTestContext) {
    }

    public void takeScreenshots(ITestResult testResult) throws IOException {
        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());
        File target = new File("./Screenshots/" + testResult.getMethod().getMethodName() + " " + timeStamp + ".jpg");
        FileUtils.copyFile(sourceFile, target);

    }
}