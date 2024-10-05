package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.POSAttender;
import com.silvassaOfficer.pageobject.POSReports_Revenue;

public class POSReports_Attender_009 extends Basetest {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "POSReports_Attender_009", priority = 91)
    public void clickon_POSTransactions() {
        POSAttender data = new POSAttender(driver);
        try {
            Thread.sleep(3000);
            data.clickon_POSAttender();
            Thread.sleep(3000);
            System.out.println("Clicked on POS Attender Tab");
            extentReports.createTest("POS Attender tab in POS Reports Page ").log(Status.PASS,
                    "Successfully Open Pos Attender page");
        } catch (Exception e) {
            extentReports.createTest("POS Attender tab in POS Reports Page ").log(Status.FAIL,
                    "Failed to open the Pos Attender page. Exception: " + e.getCause());
        }
    }

    @Test(groups = "POSReports_Attender_009", priority = 92)
    public void click1D_Button() {
        POSAttender data = new POSAttender(driver);
        POSReports_Revenue data1 = new POSReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data1.scrollUP_Thepage();
            Thread.sleep(2000);
            data.clickon_Attender1Woption();
            String cardData = data.getValue_Attender();
            System.out.println("Click on One Day in POS Reports Attender tab:  " + cardData);
            extentReports.createTest("Click on One Day in POS Reports Attender tab").log(Status.PASS,
                    "Successfully Click on One Day in POS Reports : " + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Day in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Day in POS Reports : " + e.getMessage());
            extentReports.createTest("Click on One Day in POS Reports in Attender tab").log(Status.FAIL,
                    "Failed Click on One Day in POS Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_Attender_009", priority = 93)
    public void click1W_Button() {
        POSAttender data = new POSAttender(driver);
        try {
            Thread.sleep(2000);
            data.clickon_Attender1Doption();
            String cardData = data.getValue_Attender();
            System.out.println("Click on One Week in POS Reports : " + cardData);
            extentReports.createTest("Click on One Week in POS Reports").log(Status.PASS,
                    "Successfully Click on One Week in POS Reports Attender tab:" + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Week in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Week in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on One Week in POS Reports").log(Status.FAIL,
                    "Failed to Click on One Week in POS Reports Attender tab. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "POSReports_Attender_009", priority = 94)
    public void click1M_Button() {
        POSAttender data = new POSAttender(driver);
        try {
            Thread.sleep(2000);
            data.clickon_Attender1Moption();
            String cardData = data.getValue_Attender();
            System.out.println("Click on One Month in POS Reports :" + cardData);
            extentReports.createTest("Click on One Month in POS Reports").log(Status.PASS,
                    "Successfully Click on One Month in POS Reports Attender tab:" + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on One Month in POS Reports: " + e.getMessage());
            System.err.println("Failed to Click on One Month in POS Reports: " + e.getMessage());
            extentReports.createTest("Click on One Month in POS Reports").log(Status.FAIL,
                    "Failed to Click on One Month in POS Reports Attender tab. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void tearDown_PosAttender() {
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
