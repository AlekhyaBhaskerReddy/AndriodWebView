package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.AuditPOSDevice;
import com.silvassaOfficer.pageobject.Audit_Reservations;
import com.silvassaOfficer.pageobject.DashboardSites;

public class Audit_PosDevice_017 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setup();
        super.setLogoutRequired(true);
    }

    @Test(groups = "Audit_PosDevice_017", priority = 180)
    public void click_SiteReports_DeviceStatus() {
        AuditPOSDevice data = new AuditPOSDevice(driver);
        try {
            Thread.sleep(2000);
            data.click_Audit_PosDevice();
            System.out.println("Click on POS Device in Audit Trail  ");
            extentReports.createTest("Click on POS Device in Audit Trail").log(Status.PASS,
                    "Successfully Click on POS Device in Audit Trail");
        } catch (Exception e) {

            extentReports.createTest("Click on POS Device in Audit Trail").log(Status.FAIL,
                    "Failed to Click on POS Device in Audit Trail. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 181)
    public void click1D_Button_AuditPOS() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(2000);
            data.clickonAuditReserve_1Doption();
            System.out.println("Click on One Day in Site Reports  ");
            extentReports.createTest("Click on One Day in Audit Reservations").log(Status.PASS,
                    "Successfully Click on One Day in Audit Reservations ");
        } catch (Exception e) {

            extentReports.createTest("Click on One Day in Audit Reservations").log(Status.FAIL,
                    "Failed Click on One Day in Audit Reservations. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 182)
    public void click1W_Button_AuditPOS() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(2000);
            data.clickonAuditReserve_1Woption();
            System.out.println("Click on One Week in Audit Reservations ");
            extentReports.createTest("Click on One Week in Audit Reservations").log(Status.PASS,
                    "Successfully Click on One Week in Audit Reservations ");
        } catch (Exception e) {
            extentReports.createTest("Click on One Week in Audit Reservations").log(Status.FAIL,
                    "Failed to Click on One Week in Audit Reservations. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 183)
    public void click1M_Button_AuditPOS() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(2000);
            data.clickonAuditReserve_1Moption();
            System.out.println("Click on One Month in Site Reports  ");
            extentReports.createTest("Click on One Month in Audit Reservations").log(Status.PASS,
                    "Successfully Click on One Month in Site Reports ");
        } catch (Exception e) {

            extentReports.createTest("Click on One Month in Audit Reservations").log(Status.FAIL,
                    "Failed to Click on One Month in Audit Reservations. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_PosDevice_017", priority = 184)
    public void clickOn_StatusType_ToSelect_Entry() {
        AuditPOSDevice data = new AuditPOSDevice(driver);
        try {
            Thread.sleep(5000);
            data.clickonStatusType_ToSelectEntry();
            System.out.println("Click on Status Type");
            extentReports.createTest("Click on Status Type in Audit POS device Reports").log(Status.PASS,
                    "Successfully Click on Status Type in Audit POS Device Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on Status Type in Audit POS device Reports: " + e.getMessage());
            System.err.println("Failed to Click on Status Type in Audit POS Device Reports: " + e.getMessage());
            extentReports.createTest("Click on Status Type in Audit POS Device Reports").log(Status.FAIL,
                    "Failed to Click on Status Type in Audit POS device Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_PosDevice_017", priority = 185)
    public void select_EntryType() {
        AuditPOSDevice data = new AuditPOSDevice(driver);
        try {
            Thread.sleep(5000);
            data.select_EntryOption();
            System.out.println("Select EntryOption Tickets");
            extentReports.createTest("Select Entry Tickets").log(Status.PASS,
                    "Successfully select entry type status tickets");
        } catch (Exception e) {

            extentReports.createTest("Select EntryOption Tickets").log(Status.FAIL,
                    "Failed to select entry tickets. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_PosDevice_017", priority = 186)
    public void clickOn_StatusType_ToSelect_Exit() {
        clickOn_StatusType_ToSelect_Entry();
    }

    @Test(groups = "Audit_PosDevice_017", priority = 187)
    public void select_ExitType() {
        AuditPOSDevice data = new AuditPOSDevice(driver);
        try {
            Thread.sleep(5000);
            data.select_ExitOption();
            System.out.println("Select Exit Option Tickets");
            extentReports.createTest("Select Exit Tickets").log(Status.PASS,
                    "Successfully select Exit type status tickets");
        } catch (Exception e) {

            extentReports.createTest("Select Exit option Tickets").log(Status.FAIL,
                    "Failed to select Exit tickets. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_PosDevice_017", priority = 188)
    public void clickOn_StatusType_ToSelect_Manintenance() {
        clickOn_StatusType_ToSelect_Entry();
    }

    @Test(groups = "Audit_PosDevice_017", priority = 189)
    public void select_MaintenanceType() {
        AuditPOSDevice data = new AuditPOSDevice(driver);
        try {
            Thread.sleep(5000);
            data.select_MaintenanceOption();
            System.out.println("Select Maintenance Option Tickets");
            extentReports.createTest("Select Maintenance Tickets").log(Status.PASS,
                    "Successfully select Maintenance type status tickets");
        } catch (Exception e) {

            extentReports.createTest("Select Maintenance option Tickets").log(Status.FAIL,
                    "Failed to select Maintenance tickets. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_PosDevice_017", priority = 190)
    public void scroll_Thepage() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(2000);
            data.scroll_Thepage();
            System.out.println("Scroll the page");
            extentReports.createTest("Scroll the page").log(Status.PASS,
                    " Successfully Scroll the page");
        } catch (Exception e) {
            System.err.println("Failed to Scroll the page: " + e.getMessage());
            extentReports.createTest("Scroll the page").log(Status.FAIL,
                    " Failed toScroll the page.Exception :" + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown_AuditTrail() {
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
