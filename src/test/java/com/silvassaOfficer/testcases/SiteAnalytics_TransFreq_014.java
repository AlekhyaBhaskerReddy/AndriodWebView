package com.silvassaOfficer.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.SiteAnalytics_TransFreq;

public class SiteAnalytics_TransFreq_014 extends Basetest {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "SiteAnalytics_TransFreq_014", priority = 140)
    public void click_Analytics_TransactionFreqTab() {
        SiteAnalytics_TransFreq data = new SiteAnalytics_TransFreq(driver);
        try {
            Thread.sleep(2000);
            data.click_Analytics_TransFreq();
            System.out.println("Click on Transaction Frequency in Site Analytics ");
            extentReports.createTest("Click on Transaction Frequency in Site Analytics").log(Status.PASS,
                    "Successfully Click on Transaction Frequency in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on Transaction Frequency in Site Analytics").log(Status.FAIL,
                    "Failed to Click onTransaction Frequency in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_TransFreq_014", priority = 141)
    public void click1W_Button_Freq() {
        SiteAnalytics_TransFreq data = new SiteAnalytics_TransFreq(driver);
        try {
            Thread.sleep(2000);
            data.clickonTransFreq_1Woption();
            System.out.println("Click on Transaction Frequency One Week in Site Analytics  ");
            extentReports.createTest("Click on Transaction Frequency One Week in Site Analytics").log(Status.PASS,
                    "Successfully Click on Transaction Frequency One Week in Site Analytics  ");
        } catch (Exception e) {

            extentReports.createTest("click on Transaction Frequency One Week in Site Analytics").log(Status.FAIL,
                    "Failed Click on Transaction Frequency One Week in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_TransFreq_014", priority = 142)
    public void click1M_Button_Freq() {
        SiteAnalytics_TransFreq data = new SiteAnalytics_TransFreq(driver);
        try {
            Thread.sleep(2000);
            data.clickonTransFreq_1Moption();
            System.out.println("Click on One Month in Site Analytics ");
            extentReports.createTest("Click on Transaction Frequency One Month in Site Analytics").log(Status.PASS,
                    "Successfully Click on Transaction Frequency One Month in Site Analytics ");
        } catch (Exception e) {
            extentReports.createTest("Click on Transaction Frequency One Month in Site Analytics").log(Status.FAIL,
                    "Failed to Click on Transaction Frequency One Month in Site Analytics. Exception: "
                            + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_TransFreq_014", priority = 143)
    public void click3M_Button_Freq() {
        SiteAnalytics_TransFreq data = new SiteAnalytics_TransFreq(driver);
        try {
            Thread.sleep(2000);
            data.clickonTransFreq_3Moption();
            System.out.println("Click on 3Month in Site Analytics  ");
            extentReports.createTest("Click on Transaction Frequency 3Month in Site Analytics").log(Status.PASS,
                    "Successfully Click on Transaction Frequency 3Month in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on Transaction Frequency 3Month in Site Analytics").log(Status.FAIL,
                    "Failed to Click on Transaction Frequency 3Month in Site Analytics. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void continueProcess_SiteAnalyticsTransFrequency() {
        try {
            Thread.sleep(3000);
            super.setLogoutRequired(false);
            extentReports.createTest("Donot Logout SiteAnalytics Trans From the application ").log(Status.PASS,
                    "Successfully the application dont logout");
        } catch (Exception e) {
            extentReports.createTest("Logout SiteAnalytics Trans from the application").log(Status.FAIL,
                    "Logout from the application");
        }
    }
}
