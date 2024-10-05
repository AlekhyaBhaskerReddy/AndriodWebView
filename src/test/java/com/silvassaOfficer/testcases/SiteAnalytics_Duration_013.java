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
import com.silvassaOfficer.pageobject.SiteAnalytics_AvgDuration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SiteAnalytics_Duration_013 extends TC_LoginTest_001 {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "ReserveReports_006", priority = 131)
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

    @Test(groups = "SiteAnalytics_Duration_013", priority = 132)
    public void clickon_SiteAnalytics_Page() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(3000);
            data.selectSiteAnalytics();
            System.out.println("Clicked on Site Analytics");
            extentReports.createTest("Site Analytics in Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on Site Analytics In Analytics page");
        } catch (Exception e) {

            System.err.println("Failed to Click on Site Analytics in Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on Site Analytics in Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on Site Analytics in Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 133)
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
                    " Successfully Clicked on siteslist & Select Site dropdown Site Analytics");
        } catch (Exception e) {

            extentReports.createTest("Click on sites list dropdown & Select Site Site Analytics").log(Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site in Site Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 134)
    public void click1D_Button_Duration() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(5000);
            data.clickonAnalytics_1Doption();
            System.out.println("Click on duration One Day in Site Analytics  ");
            extentReports.createTest("Click on duration One Day in Site Analytics").log(Status.PASS,
                    "Successfully Click on duration One Day in Site Analytics  ");
        } catch (Exception e) {

            extentReports.createTest("click on Duration One Day in Site Analytics").log(Status.FAIL,
                    "Failed Click on duration One Day in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 135)
    public void click1W_Button_Duration() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(5000);
            data.clickonAnalytics_1Woption();
            System.out.println("Click on One Week in Site Analytics ");
            extentReports.createTest("Click on duration One Week in Site Analytics").log(Status.PASS,
                    "Successfully Click on duration One Week in Site Analytics ");
        } catch (Exception e) {
            extentReports.createTest("Click on duration One Week in Site Analytics").log(Status.FAIL,
                    "Failed to Click on duration One Week in Site Analytics. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 136)
    public void click1M_Button_Duration() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(2000);
            data.clickonAnalytics_1Moption();
            System.out.println("Click on One Month in Site Analytics  ");
            extentReports.createTest("Click on duration One Month in Site Analytics").log(Status.PASS,
                    "Successfully Click on duration One Month in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on duration One Month in Site Analytics").log(Status.FAIL,
                    "Failed to Click on duration One Month in Site Analytics. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 137)
    public void click_Analytics_4Wheeler() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(2000);
            data.clickon_FourWheeler();
            System.out.println("Click 4W in duration in Site Analytics  ");
            extentReports.createTest("Click on 4W in duration in Site Analytics").log(Status.PASS,
                    "Successfully Click on 4W in duration in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click on 4W in duration in Site Analytics").log(Status.FAIL,
                    "Failed to Click on 4W in duration in Site Analytics. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteAnalytics_Duration_013", priority = 138)
    public void click_Analytics_2Wheeler() {
        SiteAnalytics_AvgDuration data = new SiteAnalytics_AvgDuration(driver);
        try {
            Thread.sleep(2000);
            data.clickon_TwoWheeler();
            System.out.println("Click on 2W in duration in Site Analytics  ");
            extentReports.createTest("Click 2W in duration in Site Analytics").log(Status.PASS,
                    "Successfully Click 2W in duration in Site Analytics ");
        } catch (Exception e) {

            extentReports.createTest("Click 2W in duration in Site Analytics").log(Status.FAIL,
                    "Failed to Click 2W in duration in Site Analytics. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void continueProcess_SiteAnalyticsDuration() {
        try {
            Thread.sleep(3000);
            super.setLogoutRequired(false);
            extentReports.createTest("Donot Logout SiteAnalytics Duration From the application ").log(Status.PASS,
                    "Successfully the application dont logout");
        } catch (Exception e) {
            extentReports.createTest("Logout SiteAnalytics Duration from the application").log(Status.FAIL,
                    "Logout from the application");
        }
    }
}
