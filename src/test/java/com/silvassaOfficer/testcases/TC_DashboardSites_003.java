package com.silvassaOfficer.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardSites;

public class TC_DashboardSites_003 extends Basetest {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(false);
    }

    @Test(groups = "TC_DashboardSites_003", priority = 22)
    public void clickon_ParkingSites() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(3000);
            data.clickon_ParkingSites();
            System.out.println("Clicked on Parking Sites Tab In Dashboard");
            extentReports.createTest("Parking Sites Tab In Dashboard").log(Status.PASS,
                    " Successfully Clicked on Parking Sites Tab In Dashboard");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on Parking Sites Tab In Dashboard: " + e.getMessage());
            System.err.println("Failed to Click on Parking Sites Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Parking Sites Tab In Dashboard").log(Status.FAIL,
                    "Failed to Click on Parking Sites Tab In Dashboard: " + e.getMessage());
        }
    }

    @Test(groups = "TC_DashboardSites_003", priority = 23)
    public void get_ParkingSitesData() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(3000);
            String cardData = data.getParkingSites();
            System.out.println("Initail Parking Sites data : " + cardData);
            extentReports.createTest("Operating Sites Percentage").log(Status.PASS,
                    "Successfully displaying the operating_sites percent")
                    .log(Status.INFO,
                            "Successfully displaying the operating_sites percent : " + cardData);
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Click on operation sites Tab In Dashboard: " + e.getMessage());
            System.err.println("Failed to Click on pareking sites Tab In Dashboard: " + e.getMessage());
            extentReports.createTest("Operating Sites Percentage").log(Status.FAIL,
                    "Failed to displaying the operating_sites percent.Exception" + e.getCause());
        }
    }

    @Test(groups = "TC_DashboardSites_003", priority = 24)
    public void parkingSites_Scroll() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(3000);
            data.scroll_Thepage();
            System.out.println("Scrolling up");
            extentReports.createTest("Scroll up").log(Status.PASS,
                    "Scroll up operation is performed successfully!");
        } catch (Exception e) {
            extentReports.createTest("Scroll up").log(Status.FAIL,
                    "Failed to scroll up. Exception: " + e.getMessage());
            System.out.println("Failed to scroll up. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "TC_DashboardSites_003", priority = 25)
    public void print_AllSiteNames() {
        try {
            Thread.sleep(3000);
            String baseXPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.GridView/android.view.View[%d]/android.view.View[1]";

            for (int i = 1; i <= 9; i++) {
                String currentXPath = String.format(baseXPath, i);

                WebElement element = driver.findElement(By.xpath(currentXPath));

                System.out.println("Site Name " + i + ": " + element.getText());
                extentReports.createTest("All Site Names in ParkingSites Tab").log(Status.PASS,
                        "Successfully displaying All Site Names in ParkingSites Tab")
                        .log(Status.INFO,
                                "Successfully displaying the operating_sites names : " + element.getText());
            }

        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to print all Site Names in ParkingSites Tab: " + e.getMessage());
            System.err.println("Failed to print all Site Names in ParkingSites Tab: " + e.getMessage());
            extentReports.createTest("Operating Sites Names").log(Status.FAIL,
                    "Failed to print all Site Names in ParkingSites Tab.Exception" + e.getCause());
        }
    }

    @Test(groups = "TC_DashboardSites_003", priority = 26)
    public void parkingSites_ScrollUp() {
        DashboardSites data = new DashboardSites(driver);
        try {
            Thread.sleep(3000);
            data.scrollUP_Thepage();
            System.out.println("Scrolling up");
            extentReports.createTest("Scroll up").log(Status.PASS,
                    "Scroll up operation is performed successfully!");
        } catch (Exception e) {
            extentReports.createTest("Scroll up").log(Status.FAIL,
                    "Failed to scroll up. Exception: " + e.getMessage());
            System.out.println("Failed to scroll up. Exception: " + e.getMessage());
        }
    }

    @AfterClass
    public void continueProcess_DashboardSites() {
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
