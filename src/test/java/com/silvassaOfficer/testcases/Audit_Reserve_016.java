package com.silvassaOfficer.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.Audit_Reservations;
import com.silvassaOfficer.pageobject.POSReports_Revenue;
import com.silvassaOfficer.pageobject.ReservationReports1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Audit_Reserve_016 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "Audit_Reserve_016", priority = 160)
    public void clickon_Menu() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
            Thread.sleep(5000);
            data.waitForPageToLoad();
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

    @Test(groups = "Audit_Reserve_016", priority = 161)
    public void clickon_AuditReservations_Page() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(3000);
            data.select_AuditTrailPage();
            System.out.println("Click on Audit Trail page");
            extentReports.createTest("Audit Trail in Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on Audit Trail In Analytics page");
        } catch (Exception e) {

            System.err.println("Failed to Click on Audit Trail in Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on Audit Trail in Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on Audit Trail in Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 162)
    public void clickOn_SitesDropDownList() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_SitesList();
            data.clickon_SitesList();
            System.out.println("Clicked on SitesList dropdown");
            List<WebElement> siteElements = data.getSiteElements();
            for (WebElement siteElement : siteElements) {
                System.out.println(siteElement.getText());
            }
            Thread.sleep(2000);
            data.clickon_Site();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
            System.out.println("Select Site from the dropdown list & Select Site");
            extentReports.createTest("Clicked on SitesList dropdown ").log(Status.PASS,
                    " Successfully Clicked on siteslist & Select Site dropdown Audit Trail");
        } catch (Exception e) {

            extentReports.createTest("Click on sites list dropdown & Select Site Audit Trail").log(Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site Audit Trail: " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 163)
    public void clickOn_TransType() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(5000);
            data.clickonTransType_ToSelectReservations();
            System.out.println("Click on Transaction Type");
            extentReports.createTest("Click on Transaction Type in Audit Reservation Reports").log(Status.PASS,
                    "Successfully Click on Transaction Type in Audit Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on Transaction Type in Audit Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on Transaction Type in Audit Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on Transaction Type in Audit Reservation Reports").log(Status.FAIL,
                    "Failed to Click on Transaction Type in Audit Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 164)
    public void select_Reservations() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(5000);
            data.select_ReservationsOption();
            System.out.println("Click on Reservation Transaction Type Audit");
            extentReports.createTest("Click on Reservation Type in Audit Reservation Reports").log(Status.PASS,
                    "Successfully Click on Reservation Type in Audit Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on Reservation Type in Audit Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Click on Reservation Type in Audit Reservation Reports: " + e.getMessage());
            extentReports.createTest("Click on Reservation Type in Audit Reservation Reports").log(Status.FAIL,
                    "Failed to Click on Reservation Type in Audit Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 165)
    public void click1D_Button_AuditReserve() {
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

    @Test(groups = "Audit_Reserve_016", priority = 166)
    public void click1W_Button_AuditReserve() {
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

    @Test(groups = "Audit_Reserve_016", priority = 167)
    public void click1M_Button_AuditReserve() {
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

    @Test(groups = "Audit_Reserve_016", priority = 168)
    public void clickOn_TransType_ToSelectPass() {
        clickOn_TransType();
    }

    @Test(groups = "Audit_Reserve_016", priority = 169)
    public void select_Passes() {
        Audit_Reservations data = new Audit_Reservations(driver);
        try {
            Thread.sleep(5000);
            data.select_PassesOption();
            System.out.println("Click on Passes Transaction Type Audit");
            extentReports.createTest("Select on Passes Type in Audit Reservation Reports").log(Status.PASS,
                    "Successfully Select on Passes Type in Audit Reservation Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Select on Passes Type in Audit Reservation Reports: " + e.getMessage());
            System.err.println("Failed to Select on Passes Type in Audit Reservation Reports: " + e.getMessage());
            extentReports.createTest("Select on Passes Type in Audit Reservation Reports").log(Status.FAIL,
                    "Failed to Select on Passes Type in Audit Reservation Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 170)
    public void click1D_Button_AuditPass() {
        click1D_Button_AuditReserve();
    }

    @Test(groups = "Audit_Reserve_016", priority = 170)
    public void click1W_Button_AuditPass() {
        click1W_Button_AuditReserve();
    }

    @Test(groups = "Audit_Reserve_016", priority = 172)
    public void click1M_Button_AuditPass() {
        click1M_Button_AuditReserve();
    }

    @AfterClass
    public void continueProcess_AuditReservations() {
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
