package com.silvassaOfficer.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.About;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class About_026 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "About_026", priority = 281)
    public void clickon_Menu_FeedbackComplaint() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            data.waitForPageToLoad();
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            About about = new About(driver);
            Thread.sleep(2000);
            about.select_About();
            System.out.println("Select About page");

            extentReports.createTest("Select About page").log(Status.PASS,
                    " Successfully Select About page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select About page: " + e.getMessage());
            System.err.println("Failed to Select About page: " + e.getMessage());
            extentReports.createTest("Select About page").log(Status.FAIL,
                    "Failed to Select About page:  " + e.getMessage());
        }
    }

    @Test(groups = "About_026", priority = 282)
    public void aboutPage_ApplicationName() {
        try {
            Thread.sleep(3000);
            WebElement appNameElement = driver.findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View"));
            String appNameText = appNameElement.getText();
            if (appNameText.equals("Silvassa Smart Parking")) {
                System.out.println("App name is matched : " + appNameText);
                Assert.assertTrue(true, "App name is matched");
                extentReports.createTest("Silvassa Smart Parking").log(Status.PASS,
                        "App name matched : " + appNameText);

            } else {
                Assert.assertTrue(false, "App name is not matched");
                System.out.println("App name is not matched");
                extentReports.createTest("Silvassa Smart Parking").log(Status.PASS,
                        "Silvassa Smart Parking app name not found. ");
            }
        } catch (Exception e) {
            extentReports.createTest("Silvassa Smart Parking Verification").log(Status.FAIL,
                    "Failed to verify Silvassa Smart Parking app name. Exception: " + e.getMessage());
            Assert.assertTrue(false, "App name is not matched");
            System.out.println("App name is not matched : " + e.getMessage());
        }
    }

    @Test(groups = "About_026", priority = 283)
    public void testProductDetails() {
        About aboutPage = new About(driver);
        try {
            String productName = aboutPage.getProductName();
            String partNumber = aboutPage.getPartNumber();
            String version = aboutPage.getVersion();
            String license = aboutPage.getLicense();

            System.out.println("Product Name: " + productName);
            System.out.println("Part Number: " + partNumber);
            System.out.println("Version: " + version);
            System.out.println("License: " + license);

            extentTest = extentReports.createTest("Product Details Test");
            extentTest.log(Status.PASS, "Product Name: " + productName);
            extentTest.log(Status.PASS, "Part Number: " + partNumber);
            extentTest.log(Status.PASS, "Version: " + version);
            extentTest.log(Status.PASS, "License: " + license);

            Assert.assertNotNull(productName, "Product Name is null");
            Assert.assertNotNull(license, "License is null");
            Assert.assertNotNull(version, "Version is null");
            Assert.assertNotNull(partNumber, "Part Number is null");
        } catch (Exception e) {
            extentTest.log(Status.FAIL, "Failed to retrieve product details. Exception: " + e.getMessage());
            Assert.fail("Failed to retrieve product details. Exception: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown_FromAboutPage() {
        try {
            Thread.sleep(3000);
            super.setLogoutRequired(true);
            extentReports.createTest("Logout From the application").log(Status.PASS,
                    "Successfully logout from the application");
        } catch (Exception e) {
            extentReports.createTest("Logout from the application").log(Status.FAIL,
                    "Failed to logout from the application");
        }
    }
}
