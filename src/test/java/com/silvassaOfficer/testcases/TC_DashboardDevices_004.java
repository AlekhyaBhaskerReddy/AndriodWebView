package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardDevices;
import com.silvassaOfficer.pageobject.DashboardSites;

public class TC_DashboardDevices_004 extends Basetest {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "TC_DashboardDevices_004", priority = 26)
    public void click_DeviceStatus() {
        DashboardDevices data = new DashboardDevices(driver);
        try {
            Thread.sleep(6000);
            data.clickon_DeviceStatus();
            System.out.println("Clicked on Device Status Tab In Dashboard");
            extentReports.createTest("Device Status Tab In Dashboard").log(Status.PASS,
                    " Successfully Clicked on Device Status Tab In Dashboard");
        } catch (Exception e) {
            System.err.println("Failed to Click on Device Status Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Device Status Tab In Dashboard").log(Status.FAIL,
                    "Failed to Click on Device Status Tab In Dashboard: " + e.getMessage());
        }
    }

    @Test(groups = "TC_DashboardDevices_004", priority = 27)
    public void get_DeviceStatusData() {
        DashboardDevices data = new DashboardDevices(driver);
        try {
            Thread.sleep(3000);
            String cardData = data.getDeviceStatus();
            System.out.println("Initail Device Status data : " + cardData);
            extentReports.createTest("Device Status Percentage").log(Status.PASS,
                    "Successfully displaying the Device Status percent")
                    .log(Status.INFO,
                            "Successfully displaying the Device Status percent : " + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Device Status Tab In Dashboard: " + e.getMessage());
            System.err.println("Failed to Click on Device Status Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Device Status Percentage").log(Status.FAIL,
                    "Failed to displaying the Device Status percent.Exception" + e.getCause());
        }
    }

    @Test(groups = "TC_DashboardDevices_004", priority = 28)
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
            extentReports.createTest("Scroll up").log(Status.FAIL,
                    "Failed to scroll up. Exception: " + e.getMessage());
            System.out.println("Failed to scroll up. Exception: " + e.getMessage());
        }
    }

    @AfterClass
    public void continueProcess_DashboardDevices() {
        try {
            Thread.sleep(3000);
            super.setLogoutRequired(false);
            extentReports.createTest("Donot Logout From the application").log(Status.PASS,
                    "Successfully the application dont logout");
        } catch (Exception e) {
            extentReports.createTest("Logout from the application").log(Status.FAIL,
                    "Logout from the application");
        }
    }
}
