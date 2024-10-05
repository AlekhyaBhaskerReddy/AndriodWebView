package com.silvassaOfficer.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestListener implements ITestListener {

    private static ExtentReports extentReports;
    private static ExtentTest extentTest;

    static {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("reports/extent_report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }

    @Override
    public void onStart(ITestContext context) {
        // Initialization of ExtentReports
    }

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extentReports.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.log(Status.PASS, result.getMethod().getMethodName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.log(Status.FAIL, result.getMethod().getMethodName() + " failed");
        extentTest.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.log(Status.SKIP, result.getMethod().getMethodName() + " skipped");
        extentTest.skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        extentReports.flush();
    }
}
