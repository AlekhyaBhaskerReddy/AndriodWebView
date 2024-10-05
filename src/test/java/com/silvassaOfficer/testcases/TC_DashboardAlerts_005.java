package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardAlerts;
import com.silvassaOfficer.pageobject.DashboardSites;

public class TC_DashboardAlerts_005 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "TC_DashboardAlerts_005", priority = 29)
    public void click_DeviceStatus() {
        DashboardAlerts data = new DashboardAlerts(driver);
        try {
            Thread.sleep(5000);
            data.clickon_Alerts();
            System.out.println("Clicked on Alerts Tab In Dashboard");
            extentReports.createTest("Alerts Tab In Dashboard").log(Status.PASS,
                    " Successfully Clicked on Alerts Tab In Dashboard");
        } catch (Exception e) {
            System.err.println("Failed to Click on Alerts Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Alertss Tab In Dashboard").log(Status.FAIL,
                    "Failed to Click on Alerts Tab In Dashboard: " + e.getMessage());
        }
    }

    @Test(groups = "TC_DashboardAlerts_005", priority = 30)
    public void get_DeviceStatusData() {
        DashboardAlerts data = new DashboardAlerts(driver);
        try {
            Thread.sleep(3000);
            String cardData = data.getAlertsData();
            System.out.println("Initail Alerts data : " + cardData);
            extentReports.createTest("Alerts Count").log(Status.PASS,
                    "Successfully displaying the Alerts count")
                    .log(Status.INFO,
                            "Successfully displaying the Alerts count : " + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Alerts Tab In Dashboard: " + e.getMessage());
            System.err.println("Failed to Click on Alerts Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Alerts count").log(Status.FAIL,
                    "Failed to displaying the Alerts count .Exception" + e.getCause());
        }
    }

    @Test(groups = "TC_DashboardAlerts_005", priority = 31)
    public void deviceStatus_Scroll() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(3000);
            data.scroll_Thepage();
            System.out.println("Scrolling Down");
            data.scrollUP_Thepage();
            System.out.println("Scrolling up");
            extentReports.createTest("Scroll up").log(Status.PASS,
                    "Scroll up operation is performed successfully!");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to scroll In Dashboard: " + e.getMessage());
            extentReports.createTest("Scroll up").log(Status.FAIL,
                    "Failed to scroll up. Exception: " + e.getMessage());
            System.out.println("Failed to scroll up. Exception: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown_FromDashboardAlerts() {
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
