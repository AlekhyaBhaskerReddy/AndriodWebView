package com.silvassaOfficer.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.SiteReports_Alerts;

public class SiteReports_Alerts_012 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "SiteReports_Alerts_012", priority = 120)
    public void click_SiteReports_AlertsTab() {
        SiteReports_Alerts data = new SiteReports_Alerts(driver);
        try {
            Thread.sleep(2000);
            data.click_AlertsTab();
            String cardData = data.getValue_SiteAlertsCount();
            System.out.println("Click on Alerts :  " + cardData);
            extentReports.createTest("Click on Alerts in Site Reports").log(Status.PASS,
                    "Successfully Click on Alerts in Site Reports : ");
        } catch (Exception e) {

            extentReports.createTest("Click on Alerts in Reports").log(Status.FAIL,
                    "Failed to Click on Alerts in Site Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Alerts_012", priority = 121)
    public void click_ShowEntries() {
        SiteReports_Alerts showEntries = new SiteReports_Alerts(driver);
        try {
            Thread.sleep(3000);
            showEntries.click_ShowEntriesDropdwnoption();
            Thread.sleep(1000);
            showEntries.select_25EntriesButton();
            System.out.println("Select Show Entries succeessfully");
            extentReports.createTest("Site Alerts select the Display List count").log(Status.PASS,
                    "Successfully selected");
        } catch (Exception e) {
            System.err.println("Failed to select entries: " + e.getMessage());
            extentReports.createTest("Site Alerts select the Display List count").log(Status.FAIL,
                    "Failed to select the count. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void tearDown_SiteReportAlerts() {
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