package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.POSReports_Revenue;
import com.silvassaOfficer.pageobject.POSReports_Trans;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class POSReports_Trans_008 extends Basetest {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "POSReports_Trans_008", priority = 70)
    public void clickon_POSTransactions() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(3000);
            data.clickon_POSTransactions();
            Thread.sleep(3000);
            System.out.println("Clicked on POS Transactions Tab");
            extentReports.createTest("POS Transactions tab in POS Reports Page ").log(Status.PASS,
                    "Successfully Open Pos Transactions page");
        } catch (Exception e) {
            extentReports.createTest("POS Transactions tab in POS Reports Page ").log(Status.FAIL,
                    "Failed to open the Pos Transactions page. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 71)
    public void clickOn_POSDropDownList() {
        POSReports_Revenue data = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.clickon_POSList();
            System.out.println("Clicked on POSList dropdown");
            Thread.sleep(2000);
            data.clickon_POSDevice();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

            data.scrollUP_Thepage();
            Thread.sleep(2000);
            System.out.println("Select POS from the dropdown list & Select POS ");
            extentReports.createTest("In POS reports transaction tab  & Select the POS Serial Number").log(Status.PASS,
                    "Successfully selecting POS Serial Number:");
        } catch (Exception e) {
            extentReports.createTest("In POS reports transaction tab & Select the POS Serial Number").log(Status.FAIL,
                    "Failed to select the POS serail Number. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 72)
    public void click1D_Button() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(2000);
            data.clickon_1Doption();
            System.out.println("Click on One Day in POS Transactions:  ");
            extentReports.createTest("Click on One Day in POS Transactions").log(Status.PASS,
                    "Successfully Click on One Day in POS Transactions : ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Day in POS Transactions: " + e.getMessage());
            System.err.println("Failed to Click on One Day in POS Transactions : " + e.getMessage());
            extentReports.createTest("Click on One Day in POS Transactions").log(Status.FAIL,
                    "Failed Click on One Day in POS Transactions. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 73)
    public void click1W_Button() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(2000);
            data.clickon_1Woption();
            System.out.println("Click on One Week in POS Transactions : ");
            extentReports.createTest("Click on One Week in POS Transactions").log(Status.PASS,
                    "Successfully Click on One Week in POS Transactions :");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Week in POS Transactions: " + e.getMessage());
            System.err.println("Failed to Click on One Week in POS Transactions: " + e.getMessage());
            extentReports.createTest("Click on One Week in POS Transactions").log(Status.FAIL,
                    "Failed to Click on One Week in POS Transactions. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 74)
    public void click1M_Button() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(2000);
            data.clickon_1Moption();

            System.out.println("Click on One Month in POS Transactions ");
            extentReports.createTest("Click on One Month in POS Transactions").log(Status.PASS,
                    "Successfully Click on One Month in POS Transactions ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Month in POS Transactions: " + e.getMessage());
            System.err.println("Failed to Click on One Month in POS Transactions: " + e.getMessage());
            extentReports.createTest("Click on One Month in POS Transactions").log(Status.FAIL,
                    "Failed to Click on One Month in POS Transactions. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 75)
    public void click_TransType() {
        POSReports_Trans data = new POSReports_Trans(driver);
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

    @Test(groups = "POSReports_Trans_008", priority = 76)
    public void select_EntryTransaction() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(2000);
            data.clickon_EntryTransaction();
            System.out.println("Click on Entry Transaction Type");
            extentReports.createTest("POS Reports transaction tab transaction type ").log(Status.PASS,
                    "Successfully selected transaction type: ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Entry Type in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on Entry Type in POS Reports: " + e.getMessage());
            extentReports.createTest("POS Reports transaction type ").log(Status.FAIL,
                    "Failed to select the transaction type. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 77)
    public void select_VehicleType() {
        POSReports_Trans data = new POSReports_Trans(driver);
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

    @Test(groups = "POSReports_Trans_008", priority = 78)
    public void select_TWO_VehicleType() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(3000);
            data.select_TWO_VehicleType();
            System.out.println("Select on Two Wheeler vehicle Type");
            extentReports.createTest("POS Reports transaction tab vehicle type ").log(Status.PASS,
                    "Successfully selecting vehicle type  :");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select on Two Wheeler vehicle Type: " + e.getMessage());
            System.err.println("Failed to Select on Two Wheeler vehicle Type in POS Reports: " + e.getMessage());
            extentReports.createTest("POS Reports transaction tab Vehicle type as Two wheeler").log(Status.FAIL,
                    "Failed to select the vehicle type. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 79)
    public void clickon_SubmitButton() {
        POSReports_Trans data = new POSReports_Trans(driver);
        try {
            Thread.sleep(3000);
            data.clickon_SubmitBtn();
            String cardData = data.getValue();
            System.out.println("Click on submit button , Transactions Count : " + cardData);
            extentReports.createTest("In POS reports in transaction tab click the submit button").log(Status.PASS,
                    "Successfully clicking the submit button in Transaction count :" + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on submit button: " + e.getMessage());
            System.err.println("Failed to Click on submit button in POS Reports: " + e.getMessage());
            extentReports.createTest("In POS reports in transaction tab click the submit button").log(Status.FAIL,
                    "Failed to click the submit button in Revenue tab. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Trans_008", priority = 80)
    public void select_ExitTransaction() {
        POSReports_Trans data = new POSReports_Trans(driver);
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

    @Test(groups = "POSReports_Trans_008", priority = 81)
    public void againClickon_SubmitButton() {
        clickon_SubmitButton();
    }

    @AfterClass
    public void continueProcess_PosTransactions() {
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
