package com.silvassaOfficer.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.FeedBackComplaint;
import com.silvassaOfficer.pageobject.ReservationReports1;
import com.silvassaOfficer.pageobject.SiteReports_DeviceStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FeedbackComplaint_025 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "FeedbackComplaint_025", priority = 271)
    public void clickon_Menu_FeedbackComplaint() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            data.waitForPageToLoad();
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(2000);
            feedback.select_FeedBackComplaint();
            System.out.println("Select FeedBack Complaint page");

            extentReports.createTest("Select FeedBack Complaint page").log(Status.PASS,
                    " Successfully Select FeedBack Complaint page");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to Select FeedBack Complaint page: " + e.getMessage());
            System.err.println("Failed to Select FeedBack Complaint page: " + e.getMessage());
            extentReports.createTest("Select FeedBack Complaint page").log(Status.FAIL,
                    "Failed to Select FeedBack Complaint page:  " + e.getMessage());
        }
    }

    @Test(groups = "Audit_Reserve_016", priority = 273)
    public void clickOn_SitesDropDownList() {
        try {
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(2000);
            feedback.clickon_SitesList();
            feedback.clickon_SitesList();
            System.out.println("Clicked on SitesList dropdown");
            List<WebElement> siteElements = feedback.getSiteElements();
            for (WebElement siteElement : siteElements) {
                System.out.println(siteElement.getText());
            }
            Thread.sleep(2000);
            feedback.clickon_Site();
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
            System.out.println("Select Site from the dropdown list & Select Site");
            extentReports.createTest("Clicked on SitesList dropdown in FeedBack/Complaint").log(Status.PASS,
                    " Successfully Clicked on siteslist & Select Site dropdown FeedBack/Complaint");
        } catch (Exception e) {

            extentReports.createTest("Click on sites list dropdown & Select Site FeedBack/Complaint").log(
                    Status.FAIL,
                    "Failed to Click on sites list dropdown & Select Site FeedBack/Complaint: " + e.getMessage());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 274)
    public void click1D_Button() {
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            feedback.select_1Day_FeedBackComplaint();

            System.out.println("Click on One Day ");
            extentReports.createTest("Click on One Day ").log(Status.PASS,
                    "Click on 1D Successfully");
        } catch (Exception e) {

            System.err.println("Failed to click on One Day : " + e.getMessage());
            extentReports.createTest("Click on One Day ").log(Status.FAIL,
                    "Failed to click on 1D in Feedback/Complaint page. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 275)
    public void click1W_Button() {
        try {
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(2000);
            feedback.select_1Week_FeedBackComplaint();

            System.out.println("Click on One Week");
            extentReports.createTest("Click on One Week ").log(Status.PASS,
                    "Successfully click on One Week in feedback/complaint page");
        } catch (Exception e) {
            System.err.println("Failed to click on One Week : " + e.getMessage());
            extentReports.createTest("Click on One Week").log(Status.FAIL,
                    "Failed click on One Week in feedback/complaint page. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 276)
    public void click1M_Button() {
        try {
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(5000);
            feedback.select_1Month_FeedBackComplaint();

            System.out.println("Click on One Month");
            extentReports.createTest("Click on One Month ").log(Status.PASS,
                    "Successfully click on One Month in feedback/complaint page");
        } catch (Exception e) {
            System.err.println("Failed to click on One Month : " + e.getMessage());
            extentReports.createTest("Click on One Month").log(Status.FAIL,
                    "Failed click on One Month in feedback/complaint page. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 277)
    public void click_ShowEntries() {
        try {
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(3000);
            feedback.select_ShowEntries();
            Thread.sleep(1000);
            SiteReports_DeviceStatus showEntries = new SiteReports_DeviceStatus(driver);
            showEntries.select_25EntriesButton();
            System.out.println("Select Show Entries");
            extentReports.createTest("Site Device Status select the Display List count").log(Status.PASS,
                    "Successfully selected");
        } catch (Exception e) {
            System.err.println("Failed to select entries: " + e.getMessage());
            extentReports.createTest("Site Device Status select the Display List count").log(Status.FAIL,
                    "Failed to select the count. Exception: " + e.getCause());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 278)
    public void click_ComplaintTab() {
        try {
            FeedBackComplaint feedback = new FeedBackComplaint(driver);
            Thread.sleep(5000);
            feedback.select_Complaint();

            System.out.println("Click on Complaint");
            extentReports.createTest("Click on Complaint ").log(Status.PASS,
                    "Successfully click on Complaint in feedback/complaint page");
        } catch (Exception e) {
            System.err.println("Failed to click on Complaint : " + e.getMessage());
            extentReports.createTest("Click on Complaint").log(Status.FAIL,
                    "Failed click on Complaint in feedback/complaint page. Exception: " + e.getMessage());
        }
    }

    @Test(groups = "FeedbackComplaint_025", priority = 279)
    public void clickon_Complaint_Calender() {
        click1D_Button();
        click1W_Button();
        click1M_Button();
    }

    // @AfterClass
    // public void tearDown_FromFeedbackComplaint() {
    // try {
    // Thread.sleep(5000);
    // super.setLogoutRequired(true);
    // extentReports.createTest("Logout From the application").log(Status.PASS,
    // "Successfully logout from the application");
    // } catch (Exception e) {
    // extentReports.createTest("Logout from the application").log(Status.FAIL,
    // "Failed to logout from the application");
    // }
    // }

    // @AfterClass
    // public void tearDown_FromFeedbackComplaint() {
    //     try {
    //         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //         // Wait for the logout button to be visible
    //         WebElement usernameButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
    //                 By.xpath(
    //                         "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[2]/android.widget.Button")));
    //         usernameButton.click();

    //         // Wait for the logout option to be visible and clickable
    //         WebElement logoutOption = wait.until(ExpectedConditions.elementToBeClickable(
    //                 By.xpath("//android.view.View[@content-desc=' Logout']")));
    //         logoutOption.click();

    //         System.out.println("Successfully logged out from the application.");
    //         extentReports.createTest("Logout From the application").log(Status.PASS,
    //                 "Successfully logout from the application");

    //         super.setLogoutRequired(true);
    //     } catch (Exception e) {
    //         System.err.println("Failed to logout from the application: " + e.getMessage());
    //         extentReports.createTest("Logout from the application").log(Status.FAIL,
    //                 "Failed to logout from the application. Exception: " + e.getMessage());
    //         Assert.fail("Failed to logout from the application: " + e.getMessage());
    //     }
    // }

}
