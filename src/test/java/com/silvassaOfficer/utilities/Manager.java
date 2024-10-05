package com.silvassaOfficer.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Manager {
    private static ExtentReports extentReports;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    static {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("output/extent_report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }

    public static ExtentReports getExtentReports() {
        return extentReports;
    }

    public static ExtentTest getExtentTest() {
        return extentTest.get();
    }

    public static void setExtentTest(ExtentTest test) {
        extentTest.set(test);
    }
}
