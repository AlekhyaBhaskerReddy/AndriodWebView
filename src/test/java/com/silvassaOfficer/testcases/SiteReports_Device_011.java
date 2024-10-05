package com.silvassaOfficer.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.SiteReports_DeviceStatus;

public class SiteReports_Device_011 extends Basetest {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "SiteReports_Device_011", priority = 115)
    public void click_SiteReports_DeviceStatus() {
        SiteReports_DeviceStatus data = new SiteReports_DeviceStatus(driver);
        try {
            Thread.sleep(2000);
            data.click_DeviceStatus();
            String cardData = data.getValue_SiteDevicePercent();
            System.out.println("Click on Device Status :  " + cardData);
            extentReports.createTest("Click on Device Status in Site Reports").log(Status.PASS,
                    "Successfully Click on Device Status in Site Reports : ");
        } catch (Exception e) {

            extentReports.createTest("Click on Device Status in Reports").log(Status.FAIL,
                    "Failed to Click on Device Status in Site Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Device_011", priority = 116)
    public void click_ShowEntries() {
        SiteReports_DeviceStatus showEntries = new SiteReports_DeviceStatus(driver);
        try {
            Thread.sleep(3000);
            showEntries.click_ShowEntriesDropdwnoption();
            Thread.sleep(1000);
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
    public void continueProcess_SiteDeviceStatus() {
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
