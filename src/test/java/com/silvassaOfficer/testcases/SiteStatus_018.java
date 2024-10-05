package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.LiveInfo_SiteStatus;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class SiteStatus_018 extends TC_LoginTest_001 {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "SiteStatus_018", priority = 201)
    public void clickon_Menu_LiveInfo() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            Thread.sleep(5000);
            data.waitForPageToLoad();
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            LiveInfo_SiteStatus sitelocations = new LiveInfo_SiteStatus(driver);
            Thread.sleep(2000);
            sitelocations.select_LiveInfo();
            System.out.println("Clicked on LiveInfo");
            sitelocations.select_SiteStatus();
            System.out.println("Clicked on Site Status");
            extentReports.createTest("Live Info and  Site Status").log(Status.PASS,
                    " Successfully Clicked on LiveInfo &  Site Status");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on LiveInfo &  Site Status: " + e.getMessage());
            System.err.println("Failed to Click on LiveInfo &  Site Status: " + e.getMessage());
            extentReports.createTest("Click on LiveInfo &  Site Status").log(Status.FAIL,
                    "Failed to Click on LiveInfo &  Site Status:  " + e.getMessage());
        }
    }

    @Test(groups = "SiteStatus_018", priority = 202)
    public void siteStatus_ZoomIn() {
        try {
            Thread.sleep(3000);
            LiveInfo_SiteStatus sitelocations = new LiveInfo_SiteStatus(driver);
            sitelocations.click_ZoomIn();
            System.out.println("Site Status zoom in");
            extentReports.createTest("Site Status zoom in").log(Status.PASS,
                    " Successfully zoom in the site status page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to zoom in site status: " + e.getMessage());
            System.err.println("Failed to zoom in site status: " + e.getMessage());
            extentReports.createTest("Site Status zoom in").log(Status.FAIL,
                    "Failed to zoom in site status: " + e.getMessage());
        }
    }

    @Test(groups = "SiteStatus_018", priority = 203)
    public void siteStatus_ZoomOut() {
        try {
            Thread.sleep(3000);
            LiveInfo_SiteStatus sitelocations = new LiveInfo_SiteStatus(driver);
            sitelocations.click_ZoomOut();
            System.out.println("Site Status ZoomOut");
            extentReports.createTest("Site Status ZoomOut").log(Status.PASS,
                    " Successfully ZoomOut the site status page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to ZoomOut site status: " + e.getMessage());
            System.err.println("Failed to ZoomOut site status: " + e.getMessage());
            extentReports.createTest("Site Status ZoomOut").log(Status.FAIL,
                    "Failed to ZoomOut site status: " + e.getMessage());
        }
    }

    @Test(groups = "SiteStatus_018", priority = 204)
    public void hover_SiteLocationsMap() {
        try {
            LiveInfo_SiteStatus sitelocations = new LiveInfo_SiteStatus(driver);
            sitelocations.hover_ParkingLocation();

            extentReports.createTest("Hover on site location").log(Status.PASS,
                    "Successfully hovered over the map element.");

        } catch (Exception e) {
            extentReports.createTest("Hover on site location").log(Status.FAIL,
                    "Failed to hover over the map element: " + e.getMessage());
            System.err.println("Failed to hover over the map element: " + e.getMessage());
        }
    }

    @AfterClass
    public void continueProcess_SiteStatus() {
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
