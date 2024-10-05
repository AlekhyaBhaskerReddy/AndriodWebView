package com.silvassaOfficer.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.silvassaOfficer.utilities.Manager;
import com.silvassaOfficer.utilities.Readconfig;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

abstract class Basetest {

    Readconfig readconfig = new Readconfig();
    public String UserName = readconfig.getUserName();
    public String password = readconfig.getpassword();

    protected RemoteWebDriver driver;
    protected boolean logoutRequired = false;

    Properties prop = new Properties();
    InputStream input = null;

    public static ExtentReports extentReports;
    public static ExtentTest extentTest;
    public static ExtentSparkReporter spark;

    @AfterMethod
    public void getResult(ITestResult result) {
        if (extentTest == null) {
            extentTest = extentReports.createTest(result.getName());
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, MarkupHelper
                    .createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS,
                    MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
        } else {
            extentTest.log(Status.SKIP,
                    MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
            extentTest.skip(result.getThrowable());
        }
        extentReports.flush();
    }

    // @BeforeMethod
    // public void startTest(ITestResult result) {
    // extentTest = extentReports.createTest(result.getMethod().getMethodName());
    // }

    @BeforeMethod
    public void setUp() {
        Manager.setExtentTest(Manager.getExtentReports().createTest("Login Test"));
    }

    @BeforeMethod
    public void startTest(Method method) {
        extentTest = extentReports.createTest(method.getName());
    }

    @BeforeSuite
    public void setup() {
        if (extentReports == null) {
            extentReports = new ExtentReports();
            spark = new ExtentSparkReporter("output/Silvassa-Report.html");
            extentReports.attachReporter(spark);
        }
    }

    @SuppressWarnings("deprecation")
    @BeforeClass
    public void setup1() throws IOException {
        input = new FileInputStream("application.properties");
        prop.load(input);
        System.out.println("Before setup and Launch the application");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("platformName", prop.getProperty("android.name"));
        caps.setCapability("deviceName", prop.getProperty("android.devicename"));
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("android.version"));
        caps.setCapability("appPackage", prop.getProperty("android.package"));
        caps.setCapability("appActivity", prop.getProperty("android.activity"));
        caps.setCapability("noReset", true);
        caps.setCapability("testOnly", false);

        driver = new AndroidDriver(new URL(prop.getProperty("android.driver")), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDownClass() {
        if (logoutRequired && driver != null) {
            try {
                Thread.sleep(5000);
                WebElement username = driver.findElement(By.xpath(
                        "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.widget.Button"));
                username.click();
                Thread.sleep(2000);
                WebElement logoutOption = driver.findElement(By.xpath("//android.view.View[@content-desc=' Logout']"));
                Thread.sleep(2000);
                logoutOption.click();
                System.out.println("Logout from the application");
            } catch (Exception e) {
                Assert.assertTrue(false, "Failed to Logout from the application:" + e.getMessage());
                System.err.println("Failed to Logout from the application.Exception :" + e.getMessage());
            }
            logoutRequired = false;
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (WebDriverException e) {
            System.err.println("Exception during driver quit: " + e.getMessage());
        } finally {
            if (extentReports != null) {
                extentReports.flush();
            }
        }
    }

    protected void setLogoutRequired(boolean required) {
        logoutRequired = required;
    }
}