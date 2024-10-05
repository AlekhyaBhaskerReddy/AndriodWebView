package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardRevenue;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class ReserveReports_006 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "ReserveReports_006", priority = 32)
    public void clickon_Menu() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);

            Thread.sleep(5000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            Thread.sleep(2000);
            data.selectReportsAndAnalytics();
            System.out.println("Clicked on Reports & Analytics");
            extentReports.createTest("Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on Menu In Dashboard");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Reports & Analytics: " + e.getMessage());
            System.err.println("Failed to Click on Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 33)
    public void clickon_ReservationReports_Page() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(3000);
            data.selectReservationReports();
            System.out.println("Clicked on Reservation Reports");
            extentReports.createTest("Reservation Reports in Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on Reservation Reports In Analytics page");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on Reservation Reports in Reports & Analytics: " + e.getMessage());
            System.err.println("Failed to Click on Reservation Reports in Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on Reservation Reports in Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on Reservation Reports in Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 34)
    public void clickOn_SitesDropDownList() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(2000);
            data.clickon_SitesList();
            System.out.println("Clicked on SitesList dropdown");
            Thread.sleep(2000);
            data.clickon_Site();
            System.out.println("Select Site from the dropdown list & Select Site");
            extentReports.createTest("Clicked on SitesList dropdown ").log(Status.PASS,
                    " Successfully Clicked on siteslist & Select Site dropdown Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on sites list dropdown & Select Site in Reservation Reports: " + e.getMessage());
            System.err.println(
                    "Failed to Click on sites list dropdown & Select Site in Reservation Reports : " + e.getMessage());
            extentReports.createTest("Click on sites list dropdown & Select Site Reservation Reports").log(Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site Reservation Reports: " + e.getMessage());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 35)
    public void click1D_Button() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_1Doption();
            System.out.println("Click on One Day in Reservation Reports ");
            extentReports.createTest("Click on One Day in Reservation Reports").log(Status.PASS,
                    "Successfully Click on One Day in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Day in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Day in Reservation Reports : " + e.getMessage());
            extentReports.createTest("Click on One Day in Reservation Reports").log(Status.FAIL,
                    "Failed Click on One Day in Reservation Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 36)
    public void click1W_Button() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_1Woption();
            System.out.println("Click on One Week in Reservation Reports");
            extentReports.createTest("Click on One Week in Reservation Reports").log(Status.PASS,
                    "Successfully Click on One Week in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Week in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Week in Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on One Week in Reservation Reports").log(Status.FAIL,
                    "Failed to Click on One Week in Reservation Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 37)
    public void click1M_Button() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_1Moption();
            System.out.println("Click on One Month in Reservation Reports");
            extentReports.createTest("Click on One Month in Reservation Reports").log(Status.PASS,
                    "Successfully Click on One Month in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Month in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Month in Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on One Month in Reservation Reports").log(Status.FAIL,
                    "Failed to Click on One Month in Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 38)
    public void click_TransType() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_TransactionType();
            System.out.println("Click on Transaction Type");
            extentReports.createTest("Click on Transaction Type in Reservation Reports").log(Status.PASS,
                    "Successfully Click on Transaction Type in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Transaction Type in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on Transaction Type in Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on Transaction Type in Reservation Reports").log(Status.FAIL,
                    "Failed to Click on Transaction Type in Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 39)
    public void select_Reservations() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_Reservations();
            System.out.println("Click on Reservation Transaction Type");
            extentReports.createTest("Click on Reservation Type in Reservation Reports").log(Status.PASS,
                    "Successfully Click on Reservation Type in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Reservation Type in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on Reservation Type in Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on Reservation Type in Reservation Reports").log(Status.FAIL,
                    "Failed to Click on Reservation Type in Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 40)
    public void againSelect_TransactionType() {
        click_TransType();
    }

    @Test(groups = "ReserveReports_006", priority = 41)
    public void select_Passes() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.clickon_Passes();
            System.out.println("Click on Passes Transaction Type");
            extentReports.createTest("Click on Passes Type in Reservation Reports").log(Status.PASS,
                    "Successfully Click on Passes Type in Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Passes Type in Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on Passes Type in Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on Passes Type in Reservation Reports").log(Status.FAIL,
                    "Failed to Click on Passes Type in Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "ReserveReports_006", priority = 42)
    public void click_ShowEntries() {
        ReservationReports1 showEntries1 = new ReservationReports1(driver);
        try {
            DashboardRevenue showEntries = new DashboardRevenue(driver);
            Thread.sleep(3000);
            showEntries1.click_ShowEntriesDropdwnoption();
            System.out.println("Click on Show Entries");
            Thread.sleep(1000);
            showEntries.select_25EntriesButton();
            System.out.println("Select Show Entries");
            extentReports.createTest("Reservation Reports select the Display List count").log(Status.PASS,
                    "Successfully selected");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to select entries: " + e.getMessage());
            System.err.println("Failed to select entries: " + e.getMessage());
            extentReports.createTest("Reservation Reports select the Display List count").log(Status.FAIL,
                    "Failed to select the count. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void tearDown_FromReservationReports() {
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