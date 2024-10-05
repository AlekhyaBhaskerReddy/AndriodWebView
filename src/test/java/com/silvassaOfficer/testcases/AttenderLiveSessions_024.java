package com.silvassaOfficer.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.ActivityLog;
import com.silvassaOfficer.pageobject.AttenderLiveSessions;
import com.silvassaOfficer.pageobject.POSReports_Revenue;
import com.silvassaOfficer.pageobject.ReservationReports1;
import com.silvassaOfficer.pageobject.SiteReports_DeviceStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AttenderLiveSessions_024 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "ActivityLogs_023", priority = 261)
    public void clickon_Menu_UserLog() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            data.waitForPageToLoad();
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_UserLog();
            System.out.println("UserLogs");

            extentReports.createTest("User Log").log(Status.PASS,
                    " Successfully clicked on User Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on User Log: " + e.getMessage());
            System.err.println("Failed to click on User Log: " + e.getMessage());
            extentReports.createTest("User Log").log(Status.FAIL,
                    "Failed to click on User Log:  " + e.getMessage());
        }
    }

    @Test(groups = "AttenderLiveSessions_024", priority = 262)
    public void clickon_Menu_UserLog_AttenderLiveSessions() {
        try {
            AttenderLiveSessions sessions = new AttenderLiveSessions(driver);
            Thread.sleep(2000);
            sessions.select_AttenderLiveSessions();
            System.out.println("Attender Live Sessions");

            extentReports.createTest("Attender Live Sessions").log(Status.PASS,
                    " Successfully clicked on Attender Live Sessions");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Attender Live Sessions: " + e.getMessage());
            System.err.println("Failed to click on Attender Live Sessions: " + e.getMessage());
            extentReports.createTest("Attender Live Sessions").log(Status.FAIL,
                    "Failed to click on Attender Live Sessions:  " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 263)
    public void clickOn_SitesDropDownList() {
        try {
            POSReports_Revenue data = new POSReports_Revenue(driver);
            Thread.sleep(2000);
            data.clickon_SitesList();
            data.clickon_SitesList();
            System.out.println("Clicked on SitesList dropdown");
            List<WebElement> siteElements = data.getSiteElements();
            for (WebElement siteElement : siteElements) {
                System.out.println(siteElement.getText());
            }
            Thread.sleep(2000);
            data.clickon_Site();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
            System.out.println("Select Site from the dropdown list & Select Site");
            extentReports.createTest("Clicked on SitesList dropdown in Attender Live Sessions ").log(Status.PASS,
                    " Successfully Clicked on siteslist & Select Site dropdown Attender Live Sessions");
        } catch (Exception e) {

            extentReports.createTest("Click on sites list dropdown & Select Site Attender Live Sessions").log(
                    Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site Attender Live Sessions: " + e.getMessage());
        }
    }

    @Test(groups = "AttenderLiveSessions_024", priority = 264)
    public void click_ShowEntries() {
        try {
            AttenderLiveSessions sessions = new AttenderLiveSessions(driver);
            Thread.sleep(3000);
            sessions.select_ShowEntries();
            Thread.sleep(1000);
            SiteReports_DeviceStatus showEntries = new SiteReports_DeviceStatus(driver);
            showEntries.select_25EntriesButton();
            System.out.println("Select Show Entries");
            extentReports.createTest("Site Device Status select the Display List count").log(Status.PASS,
                    "Successfully selected");
        } catch (Exception e) {
            System.err.println("Failed to select entries: " + e.getMessage());
            extentReports.createTest("Site Device Status select the Display List count").log(Status.FAIL,
                    "Failed to select the count. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void tearDown_FromAttenderLiveSessions() {
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
