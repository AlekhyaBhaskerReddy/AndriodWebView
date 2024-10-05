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
import com.silvassaOfficer.pageobject.SiteReports_Revenue;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class SiteReports_Revenue_010 extends TC_LoginTest_001 {
    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "ReserveReports_006", priority = 101)
    public void clickon_Menu() {
        ReservationReports1 data = new ReservationReports1(driver);
        try {
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

    @Test(groups = "SiteReports_Revenue_010", priority = 102)
    public void clickon_SiteReports_Page() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(3000);
            data.selectSiteReports();
            System.out.println("Clicked on Site Reports");
            extentReports.createTest("Site Reports in Reports & Analytics").log(Status.PASS,
                    " Successfully Clicked on Site Reports In Analytics page");
        } catch (Exception e) {

            System.err.println("Failed to Click on Site Reports in Reports & Analytics: " + e.getMessage());
            extentReports.createTest("Click on Site Reports in Reports & Analytics").log(Status.FAIL,
                    "Failed to Click on Site Reports in Reports & Analytics: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 103)
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
                    " Successfully Clicked on siteslist & Select Site dropdown Site Reports");
        } catch (Exception e) {

            extentReports.createTest("Click on sites list dropdown & Select Site Site Reports").log(Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site Site Reports: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 104)
    public void click1D_Button() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_1Doption();
            String cardData = data.getValue_SiteRevenue();
            System.out.println("Click on One Day in Site Reports:  " + cardData);
            extentReports.createTest("Click on One Day in Site Reports").log(Status.PASS,
                    "Successfully Click on One Day in Site Reports : " + cardData);
        } catch (Exception e) {

            extentReports.createTest("Click on One Day in Site Reports").log(Status.FAIL,
                    "Failed Click on One Day in Site Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 105)
    public void click1W_Button() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_1Woption();
            String cardData = data.getValue_SiteRevenue();
            System.out.println("Click on One Week in Site Reports : " + cardData);
            extentReports.createTest("Click on One Week in Site Reports").log(Status.PASS,
                    "Successfully Click on One Week in POS Reports :" + cardData);
        } catch (Exception e) {
            extentReports.createTest("Click on One Week in Site Reports").log(Status.FAIL,
                    "Failed to Click on One Week in Site Reports. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 106)
    public void click1M_Button() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_1Moption();
            String cardData = data.getValue_SiteRevenue();
            System.out.println("Click on One Month in Site Reports : " + cardData);
            extentReports.createTest("Click on One Month in Site Reports").log(Status.PASS,
                    "Successfully Click on One Month in Site Reports : " + cardData);
        } catch (Exception e) {

            extentReports.createTest("Click on One Month in Site Reports").log(Status.FAIL,
                    "Failed to Click on One Month in Site Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 107)
    public void click_SiteReports_ViewDetails() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_ViewDetails();
            System.out.println("Click on view details in Site Reports  ");
            extentReports.createTest("Click on view details in Site Reports").log(Status.PASS,
                    "Successfully Click on view details in Site Reports ");
        } catch (Exception e) {

            extentReports.createTest("Click on view details in Site Reports").log(Status.FAIL,
                    "Failed to Click on view details in Site Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 108)
    public void click_SiteReports_ViewDetails_Csv() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_ViewDetails_Csv();
            System.out.println("Click on view details csv in Site Reports  ");
            extentReports.createTest("Click on view details csv in Site Reports").log(Status.PASS,
                    "Successfully Click on view details csv in Site Reports ");
        } catch (Exception e) {

            extentReports.createTest("Click on view details csv in Site Reports").log(Status.FAIL,
                    "Failed to Click on view details csv in Site Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 109)
    public void click_SiteReports_ViewDetails_Pdf() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_ViewDetails_Pdf();
            System.out.println("Click on view details Pdf in Site Reports  ");
            extentReports.createTest("Click on view details pdf in Site Reports").log(Status.PASS,
                    "Successfully Click on view details pdf in Site Reports ");
        } catch (Exception e) {

            extentReports.createTest("Click on view details pdf in Site Reports").log(Status.FAIL,
                    "Failed to Click on view details pdf in Site Reports. Exception: " + e.getCause());
        }
    }

    @Test(groups = "SiteReports_Revenue_010", priority = 110)
    public void click_SiteReports_ViewDetails_Close() {
        SiteReports_Revenue data = new SiteReports_Revenue(driver);
        try {
            Thread.sleep(2000);
            data.selectSiteReports_ViewDetails_CloseBtn();
            System.out.println("Click on view details Close in Site Reports  ");
            extentReports.createTest("Click on view details Close in Site Reports").log(Status.PASS,
                    "Successfully Click on view details Close in Site Reports ");
        } catch (Exception e) {

            extentReports.createTest("Click on view details Close in Site Reports").log(Status.FAIL,
                    "Failed to Click on view details Close in Site Reports. Exception: " + e.getCause());
        }
    }

    @AfterClass
    public void continueProcess_SiteRevenue() {
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
