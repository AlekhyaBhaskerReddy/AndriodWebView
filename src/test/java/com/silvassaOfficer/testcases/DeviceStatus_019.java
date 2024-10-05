package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.LiveInfo_DeviceStatus;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class DeviceStatus_019 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "DeviceStatus_019", priority = 210)
    public void clickon_Menu_LiveInfo_DeviceStatus() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");

            LiveInfo_DeviceStatus devicelocations = new LiveInfo_DeviceStatus(driver);
            devicelocations.select_DeviceStatus();
            System.out.println("Clicked on Device Status");
            devicelocations.click_SitesDropdown();
            System.out.println("Clicked on Sites Dropdown");
            devicelocations.click_Site();
            System.out.println("Selected site from the list");

            extentReports.createTest("Live Info and  Device Status").log(Status.PASS,
                    " Successfully Clicked on LiveInfo &  Device Status");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on LiveInfo &  Device Status: " + e.getMessage());
            System.err.println("Failed to Click on LiveInfo &  Device Status: " + e.getMessage());
            extentReports.createTest("Click on LiveInfo &  Device Status").log(Status.FAIL,
                    "Failed to Click on LiveInfo &  Device Status:  " + e.getMessage());
        }
    }

    @Test(groups = "DeviceStatus_019", priority = 211)
    public void selectDevices_List() {
        try {
            LiveInfo_DeviceStatus devicelocations = new LiveInfo_DeviceStatus(driver);
            devicelocations.click_DeviceType();
            System.out.println("Clicked on Device Type");
            devicelocations.click_DeviceType_Barrier();
            System.out.println("Select Boom Barrier");

            devicelocations.click_DeviceType();
            System.out.println("Clicked on Device Type");
            devicelocations.click_DeviceType_Gateway();
            System.out.println("Select Gateway");

            devicelocations.click_DeviceType();
            System.out.println("Clicked on Device Type");
            devicelocations.click_DeviceType_Sensor();
            System.out.println("Select Sensor");

            devicelocations.click_DeviceType();
            System.out.println("Clicked on Device Type");
            devicelocations.click_DeviceType_MobilePrinter();
            System.out.println("Select Mobile Printer");

            devicelocations.click_DeviceType();
            System.out.println("Clicked on Device Type");
            devicelocations.click_DeviceType_Camera();
            System.out.println("Select Camera");

            extentReports.createTest("Device Type and devices").log(Status.PASS,
                    " Successfully Clicked on Device Type and devices");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click Device Type and devices: " + e.getMessage());
            System.err.println("Failed to Click Device Type and devices: " + e.getMessage());
            extentReports.createTest("Device Type and devices").log(Status.FAIL,
                    "Failed to Click Device Type and devices:  " + e.getMessage());
        }
    }

    @AfterClass
    public void continueProcess_LiveInfoDeviceStatus() {
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
