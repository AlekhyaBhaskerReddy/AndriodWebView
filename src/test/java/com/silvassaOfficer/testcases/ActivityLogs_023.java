package com.silvassaOfficer.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.ActivityLog;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class ActivityLogs_023 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "ActivityLogs_023", priority = 241)
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

    @Test(groups = "ActivityLogs_023", priority = 242)
    public void clickon_Menu_UserLog_ActivityLogs() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_ActivityLog();
            System.out.println("Activity Logs");

            extentReports.createTest("Activity Logs").log(Status.PASS,
                    " Successfully clicked on Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Activity Log: " + e.getMessage());
            System.err.println("Failed to click on Activity Log: " + e.getMessage());
            extentReports.createTest("Activity Log").log(Status.FAIL,
                    "Failed to click on Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 243)
    public void clickon_ActivityLogs_SelectRole() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_SelectRole();
            System.out.println("Activity Logs Select Role");

            extentReports.createTest("Select Role in Activity Logs").log(Status.PASS,
                    " Successfully Select Role in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select Role in Activity Log: " + e.getMessage());
            System.err.println("Failed to Select Role in Activity Log: " + e.getMessage());
            extentReports.createTest(" Select Role in Activity Log").log(Status.FAIL,
                    "Failed to Select Role in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 244)
    public void clickon_ActivityLogs_SelectAdminRole() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_AdminRole();
            System.out.println("Activity Logs Select Admin Role");

            extentReports.createTest("Select Admin Role in Activity Logs").log(Status.PASS,
                    " Successfully Select Admin Role in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select Admin Role in Activity Log: " + e.getMessage());
            System.err.println("Failed to Select Admin Role in Activity Log: " + e.getMessage());
            extentReports.createTest(" Select Admin Role in Activity Log").log(Status.FAIL,
                    "Failed to Select Admin Role in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 245)
    public void clickon_ActivityLogs_SelectUser() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_SelectUser();
            System.out.println("Activity Logs click on Select User");

            extentReports.createTest("Click on User in Activity Logs").log(Status.PASS,
                    " Successfully click on Select User in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Select User in Activity Log: " + e.getMessage());
            System.err.println("Failed to click on Select User in Activity Log: " + e.getMessage());
            extentReports.createTest("Click on Select User in Activity Log").log(Status.FAIL,
                    "Failed to click on Select User in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 246)
    public void clickon_ActivityLogs_SilvassaUser() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_Admin_SilvassaUser();
            System.out.println("Select Silvassa User");

            extentReports.createTest("Silvassa User in Activity Logs").log(Status.PASS,
                    " Successfully Select Silvassa User in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select silvassa user in Activity Log: " + e.getMessage());
            System.err.println("Failed to select silvassa User in Activity Log: " + e.getMessage());
            extentReports.createTest("Select Silvassa User in Activity Log").log(Status.FAIL,
                    "Failed to Select silvassa User in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 247)
    public void click1D_Button() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            ActivityLog logs = new ActivityLog(driver);
            logs.select_Day();

            System.out.println("Click on One Day ");
            extentReports.createTest("Click on One Day ").log(Status.PASS,
                    "Click on 1D Successfully");
        } catch (Exception e) {

            System.err.println("Failed to click on One Day : " + e.getMessage());
            extentReports.createTest("Click on One Day ").log(Status.FAIL,
                    "Failed to click on 1D in Activity log. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 248)
    public void click1W_Button() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(5000);
            logs.select_Week();

            System.out.println("Click on One Week");
            extentReports.createTest("Click on One Week ").log(Status.PASS,
                    "Successfully click on One Week in activity log");
        } catch (Exception e) {
            System.err.println("Failed to click on One Week : " + e.getMessage());
            extentReports.createTest("Click on One Week").log(Status.FAIL,
                    "Failed click on One Week in activity log. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 249)
    public void click1M_Button() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(5000);
            logs.select_Month();

            System.out.println("Click on One Month");
            extentReports.createTest("Click on One Month ").log(Status.PASS,
                    "Successfully click on One Month in activity log");
        } catch (Exception e) {
            System.err.println("Failed to click on One Month : " + e.getMessage());
            extentReports.createTest("Click on One Month").log(Status.FAIL,
                    "Failed click on One Month in activity log. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 250)
    public void clickon_ActivityLogs_SelectRole_Again() {
        clickon_ActivityLogs_SelectRole();
    }

    @Test(groups = "ActivityLogs_023", priority = 251)
    public void clickon_ActivityLogs_SelectAttenderRole() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_AttenderRole();
            System.out.println("Activity Logs Select Attender Role");

            extentReports.createTest("Select Attender Role in Activity Logs").log(Status.PASS,
                    " Successfully Select Attender Role in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select Attender Role in Activity Log: " + e.getMessage());
            System.err.println("Failed to Select Attender Role in Activity Log: " + e.getMessage());
            extentReports.createTest(" Select Attender Role in Activity Log").log(Status.FAIL,
                    "Failed to Select Attender Role in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 252)
    public void clickon_ActivityLogs_SelectUser_Again() {
        clickon_ActivityLogs_SelectUser();
    }

    @Test(groups = "ActivityLogs_023", priority = 253)
    public void clickon_ActivityLogs_AlekhyaUser() {
        try {
            ActivityLog logs = new ActivityLog(driver);
            Thread.sleep(2000);
            logs.select_Attender_AlekhyaUser();
            System.out.println("Select Alekhya User");

            extentReports.createTest("Alekhya User in Activity Logs").log(Status.PASS,
                    " Successfully Select Alekhya User in Activity Log");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select Alekhya user in Activity Log: " + e.getMessage());
            System.err.println("Failed to select Alekhya User in Activity Log: " + e.getMessage());
            extentReports.createTest("Select Alekhya User in Activity Log").log(Status.FAIL,
                    "Failed to Select Alekhya User in Activity Log:  " + e.getMessage());
        }
    }

    @Test(groups = "ActivityLogs_023", priority = 254)
    public void clickon_ActivityLogs_AlekhyaUser_Calender() {
        click1D_Button();
        click1W_Button();
        click1M_Button();
    }

    @AfterClass
    public void tearDown_FromActivityLog() {
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