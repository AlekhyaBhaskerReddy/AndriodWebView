package com.silvassaOfficer.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.SiteAnalytics_Occupancy;

public class SiteAnalytics_Occupancy_015 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "SiteAnalytics_Occupancy_015", priority = 150)
    public void click_Analytics_Occupancy() {
        SiteAnalytics_Occupancy data = new SiteAnalytics_Occupancy(driver);
        try {
            Thread.sleep(2000);
            data.click_Analytics_Occupancy();
            System.out.println("Click on Occupancy in Site Analytics ");
            extentReports.createTest("Click on Occupancy in Site Analytics").log(Status.PASS,
                    "Successfully Click on Occupancyy in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on Occupancyy in Site Analytics").log(Status.FAIL,
                    "Failed to Click on Occupancy in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Occupancy_015", priority = 151)
    public void click1W_Button_Occupancy() {
        SiteAnalytics_Occupancy data = new SiteAnalytics_Occupancy(driver);
        try {
            Thread.sleep(2000);
            data.clickonOccupancy_1Woption();
            System.out.println("Click on Occupancy One Week in Site Analytics  ");
            extentReports.createTest("Click on Occupancy One Week in Site Analytics").log(Status.PASS,
                    "Successfully Click on Occupancy One Week in Site Analytics  ");
        } catch (Exception e) {

            extentReports.createTest("click on Occupancy One Week in Site Analytics").log(Status.FAIL,
                    "Failed Click on Occupancy One Week in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Occupancy_015", priority = 152)
    public void click1M_Button_Occupancy() {
        SiteAnalytics_Occupancy data = new SiteAnalytics_Occupancy(driver);
        try {
            Thread.sleep(2000);
            data.clickonOccupancy_1Moption();
            System.out.println("Click on Occupancy One Month in Site Analytics ");
            extentReports.createTest("Click on Occupancy One Month in Site Analytics").log(Status.PASS,
                    "Successfully Click on Occupancy One Month in Site Analytics ");
        } catch (Exception e) {
            extentReports.createTest("Click on Occupancy One Month in Site Analytics").log(Status.FAIL,
                    "Failed to Click on Occupancy One Month in Site Analytics. Exception: "
                            + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Occupancy_015", priority = 153)
    public void click3M_Button_Occupancy() {
        SiteAnalytics_Occupancy data = new SiteAnalytics_Occupancy(driver);
        try {
            Thread.sleep(2000);
            data.clickonOccupancy_3Moption();
            System.out.println("Click on Occupancy 3Month in Site Analytics  ");
            extentReports.createTest("Click on Occupancy 3Month in Site Analytics").log(Status.PASS,
                    "Successfully Click on Occupancy 3Month in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on Occupancy 3Month in Site Analytics").log(Status.FAIL,
                    "Failed to Click on Occupancy 3Month in Site Analytics. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void tearDown_SiteAnalytics_Occupancy() {
        try {
            Thread.sleep(3000);
            super.setLogoutRequired(true);
            extentReports.createTest("Logout SiteAnalytics Occupancy From the application").log(Status.PASS,
                    "Successfully logout from the application");
        } catch (Exception e) {
            extentReports.createTest("Logout SiteAnalytics Occupancy from the application").log(Status.FAIL,
                    "Failed to logout from the application");
        }
    }
}
