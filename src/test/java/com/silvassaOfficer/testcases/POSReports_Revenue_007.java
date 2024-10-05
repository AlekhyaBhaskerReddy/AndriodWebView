package com.silvassaOfficer.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.POSReports_Revenue;
import com.silvassaOfficer.pageobject.ReservationReports1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class POSReports_Revenue_007 extends TC_LoginTest_001 {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "ReserveReports_006", priority = 50)
    public void clickon_Menu() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            Thread.sleep(7000);
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

    @Test(groups = "POSReports_007", priority = 51)
    public void clickon_POSReports_Page() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(3000);
            data.selectPOSReports();
            System.out.println("Clicked on POS Reports");
            extentReports.createTest("POS Reports in Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on POS Reports In Analytics page");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on POS Reports in Reports & Analytics: " + e.getMessage());
            System.err.println("Failed to Click on POS Reports in Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on POS Reports in Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on POS Reports in Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_007", priority = 52)
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

    @Test(groups = "POSReports_007", priority = 53)
    public void clickOn_POSDropDownList() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_POSList();
            System.out.println("Clicked on POSList dropdown");
            Thread.sleep(2000);
            data.clickon_POSDevice();
            System.out.println("Select POS from the dropdown list & Select POS");
            extentReports.createTest("Clicked on POSList dropdown ").log(Status.PASS,
                    " Successfully Clicked on POSList & Select POS dropdown POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to Click on POS list dropdown & Select POS in POS: " + e.getMessage());
            System.err.println(
                    "Failed to Click on POS list dropdown & Select POS in POS : " + e.getMessage());
            extentReports.createTest("Click on POS list dropdown & Select POS").log(Status.FAIL,
                    "Failed to Click on POS list dropdown & Select POS in POS Reports: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_007", priority = 54)
    public void click1D_Button() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.scrollUP_Thepage();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(3000);
            data.clickon_1Doption();
            System.out.println("Click on One Day in POS Reports:  ");
            extentReports.createTest("Click on One Day in POS Reports").log(Status.PASS,
                    "Successfully Click on One Day in POS Reports : ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Day in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Day in POS Reports : " + e.getMessage());
            extentReports.createTest("Click on One Day in POS Reports").log(Status.FAIL,
                    "Failed Click on One Day in POS Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_007", priority = 55)
    public void click1W_Button() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_1Woption();
            System.out.println("Click on One Week in POS Reports : ");
            extentReports.createTest("Click on One Week in POS Reports").log(Status.PASS,
                    "Successfully Click on One Week in POS Reports :");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Week in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Week in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on One Week in POS Reports").log(Status.FAIL,
                    "Failed to Click on One Week in POS Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_007", priority = 56)
    public void click1M_Button() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_1Moption();
            System.out.println("Click on One Month in POS Reports ");
            extentReports.createTest("Click on One Month in POS Reports").log(Status.PASS,
                    "Successfully Click on One Month in POS Reports ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Month in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Month in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on One Month in POS Reports").log(Status.FAIL,
                    "Failed to Click on One Month in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 57)
    public void click_TransType() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_TransactionType();
            System.out.println("Click on Transaction Type");
            extentReports.createTest("Click on Transaction Type in POS Reports").log(Status.PASS,
                    "Successfully Click on Transaction Type in POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Transaction Type in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on Transaction Type in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on Transaction Type in POS Reports").log(Status.FAIL,
                    "Failed to Click on Transaction Type in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 58)
    public void select_EntryTransaction() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_EntryTransaction();
            System.out.println("Click on Entry Transaction Type");
            extentReports.createTest("Click on Entry Type ").log(Status.PASS,
                    "Successfully Click on Entry Type in POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Entry Type in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on Entry Type in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on Entry Type").log(Status.FAIL,
                    "Failed to Click on Entry Type in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 59)
    public void select_VehicleType() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(3000);
            data.clickon_VehicleType();
            System.out.println("Click on Vehicle Type");
            extentReports.createTest("Click on Vehicle Type ").log(Status.PASS,
                    "Successfully Click on Vehicle Type in POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Vehicle Type in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on Vehicle Type in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on Vehicle Type").log(Status.FAIL,
                    "Failed to Click on Vehicle Type in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 60)
    public void select_TWO_VehicleType() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(3000);
            data.select_TWO_VehicleType();
            System.out.println("Select on Two Wheeler vehicle Type");
            extentReports.createTest("Select on Two Wheeler vehicle Type ").log(Status.PASS,
                    "Successfully Select on Two Wheeler vehicle Type in POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select on Two Wheeler vehicle Type: " + e.getMessage());
            System.err.println("Failed to Select on Two Wheeler vehicle Type in POS Reports: " + e.getMessage());
            extentReports.createTest("Select on Two Wheeler vehicle Type").log(Status.FAIL,
                    "Failed to Select on Two Wheeler vehicle Type in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 61)
    public void clickon_SubmitButton() {
        try {
            POSReports_Revenue data = new POSReports_Revenue(driver);
            Thread.sleep(3000);
            data.clickon_SubmitBtn();
            String cardData = data.getValue();
            System.out.println("Click on submit button - Month Revenue: " + cardData);

            extentReports.createTest("In POS reports click the submit button").log(Status.PASS,
                    "Successfully clicked the submit button in Revenue Tab - Month Revenue: " + cardData);
        } catch (Exception e) {
            System.err.println("Failed to click on submit button in POS Reports: " + e.getMessage());
            e.printStackTrace();
            extentReports.createTest("In POS reports click the submit button").log(Status.FAIL,
                    "Failed to click the submit button in Revenue tab. Exception: " + e.getMessage());
            Assert.fail("Failed to click on submit button: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_007", priority = 62)
    public void select_ExitTransaction() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            data.clickon_TransactionType();
            Thread.sleep(2000);
            data.clickon_ExitTransaction();
            System.out.println("Click on Exit Transaction Type");
            extentReports.createTest("Click on Exit Type ").log(Status.PASS,
                    "Successfully Click on Exit Type in POS Reports");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Exit Type in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on Exit Type in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on Exit Type").log(Status.FAIL,
                    "Failed to Click on Exit Type in POS Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_007", priority = 63)
    public void againClickon_SubmitButton() {
        clickon_SubmitButton();
    }

    @AfterClass
    public void continueProcess_PosRevenue() {
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
