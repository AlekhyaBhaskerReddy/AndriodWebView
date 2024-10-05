package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.LiveInfo_DeviceOverview;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class DeviceOverview_020 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "DeviceOverview_020", priority = 215)
    public void clickon_Menu_LiveInfo_DeviceOverView() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            LiveInfo_DeviceOverview devicelocations = new LiveInfo_DeviceOverview(driver);
            Thread.sleep(2000);
            devicelocations.select_DeviceOverview();
            System.out.println("Clicked on Device Overview");

            extentReports.createTest("Live Info and  Device Overview").log(Status.PASS,
                    " Successfully Clicked on LiveInfo &  Device Overview");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on LiveInfo & Device Overview: " + e.getMessage());
            System.err.println("Failed to Click on LiveInfo & Device Overview: " + e.getMessage());
            extentReports.createTest("Click on LiveInfo & Device Overview").log(Status.FAIL,
                    "Failed to Click on LiveInfo & Device Overview:  " + e.getMessage());
        }
    }

    @Test(groups = "DeviceOverview_020", priority = 216)
    public void deviceOverview_ZoomIn() {
        try {
            Thread.sleep(3000);
            LiveInfo_DeviceOverview devicelocations = new LiveInfo_DeviceOverview(driver);
            devicelocations.click_DeviceOverview_ZoomIn();
            System.out.println("Device Overviews zoom in");
            extentReports.createTest("Device Overview zoom in").log(Status.PASS,
                    " Successfully zoom in the Device Overview page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to zoom in Device Overviews: " + e.getMessage());
            System.err.println("Failed to zoom in Device Overview: " + e.getMessage());
            extentReports.createTest("Device Overview zoom in").log(Status.FAIL,
                    "Failed to zoom in Device Overview: " + e.getMessage());
        }
    }

    @Test(groups = "DeviceOverview_020", priority = 217)
    public void deviceOverview_ZoomOut() {
        try {
            Thread.sleep(3000);
            LiveInfo_DeviceOverview devicelocations = new LiveInfo_DeviceOverview(driver);
            devicelocations.click_DeviceOverview_ZoomOut();

            System.out.println("Device Overview ZoomOut");
            extentReports.createTest("Device Overview ZoomOut").log(Status.PASS,
                    " Successfully ZoomOut the Device Overview page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to ZoomOut Device Overview: " + e.getMessage());
            System.err.println("Failed to ZoomOut Device Overview: " + e.getMessage());
            extentReports.createTest("Device Overview ZoomOut").log(Status.FAIL,
                    "Failed to ZoomOut Device Overviews: " + e.getMessage());
        }
    }

    @Test(groups = "DeviceOverview_020", priority = 218)
    public void hover_DeviceOverview_SiteLocationsMap() {
        try {
            LiveInfo_DeviceOverview devicelocations = new LiveInfo_DeviceOverview(driver);
            devicelocations.hover_DeviceOverview_ParkingLocation();

            extentReports.createTest("Hover on site location").log(Status.PASS,
                    "Successfully hovered over the map element.");

        } catch (Exception e) {
            extentReports.createTest("Hover on site location").log(Status.FAIL,
                    "Failed to hover over the map element: " + e.getMessage());
            System.err.println("Failed to hover over the map element: " + e.getMessage());
        }
    }

    @AfterClass
    public void continueProcess_DeviceOverview() {
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
