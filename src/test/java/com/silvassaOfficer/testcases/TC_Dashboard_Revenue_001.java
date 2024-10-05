package com.silvassaOfficer.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardRevenue;
import com.silvassaOfficer.pageobject.DashboardSites;

public class TC_Dashboard_Revenue_001 extends TC_LoginTest_001 {
	@BeforeClass
	public void setUp() {
		super.setUp();
		super.setLogoutRequired(false); // Explicitly set it to false if no logout is required
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 5)
	public void click1D_Button() {
		try {
			Thread.sleep(5000);
			DashboardRevenue revenue = new DashboardRevenue(driver);
			revenue.clickon_1Doption(driver);

			System.out.println("Click One Day Revenue ui data ");
			extentReports.createTest("One Day Revenue is clicked ").log(Status.PASS,
					"Click on 1D Successfully");
		} catch (Exception e) {

			System.err.println("Failed to click on One Day Revenue : " + e.getMessage());
			extentReports.createTest("Click on One Day Revenu ").log(Status.FAIL,
					"Failed to click on 1D in dashboard. Exception: " + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 6)
	public void get1D_Revenue() {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			DashboardRevenue revenue = new DashboardRevenue(driver);
			String cardData = revenue.getValue();
			System.out.println("One Day Revenue ui data  is " + cardData);
			extentReports.createTest("Day Revenu is Displaying ").log(Status.PASS,
					"Amount is displaying Successfully");
		} catch (Exception e) {

			System.err.println("Failed to get One Day Revenue ui data : " + e.getMessage());
			extentReports.createTest("Day Revenu is Displaying ").log(Status.FAIL,
					"Failed Amount is not Displaying. Exception: " + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 7)
	public void click1W_Button() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(5000);
			data.clickon_1Woption(driver);
			String cardData = data.getValue();
			System.out.println("One Week Revenue ui data  is " + cardData);
			extentReports.createTest("Week Revenu is Displaying ").log(Status.PASS,
					"Amount is displaying Successfully" + cardData);
		} catch (Exception e) {
			System.err.println("Failed to get One Week Revenue ui data : " + e.getMessage());
			extentReports.createTest("Week Revenue is not displaying").log(Status.FAIL,
					"Failed Amount is not Displaying. Exception: " + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 8)
	public void click1M_Button() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(5000);
			data.clickon_1Moption(driver);
			String cardData = data.getValue();
			System.out.println("One Month Revenue ui data  is " + cardData);
			extentReports.createTest("Dashboard Month Revenue").log(Status.PASS,
					"Successfully display Dashboard month revenue" + cardData);
		} catch (Exception e) {
			System.err.println("Failed to get One Month Revenue ui data : " + e.getMessage());
			extentReports.createTest("Dashboard Month Revenue").log(Status.FAIL,
					"Failed to display Dashboard month revenue. Exception: " + e.getCause());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 9)
	public void getSummaryDashoard_Cards() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(3000);
			List<String> cardNames = data.getSummaryCardNames();

			System.out.println("Summary Card Names:");
			for (String cardName : cardNames) {
				System.out.println(cardName);
				extentReports.createTest("Total Tabs").log(Status.PASS,
						"Available tabs in Dashboard").log(Status.INFO, "Summary Card Name: " + cardName);
			}
		} catch (Exception e) {
			Assert.assertTrue(false, "Failed to get Summary Card Names: " + e.getMessage());
			System.err.println("Failed to get Summary Card Names: " + e.getMessage());
			extentReports.createTest("Total Tabs").log(Status.FAIL,
					"Available tabs in Dashboard")
					.log(Status.INFO, "Failed to get Summary Card Name.Exception: " + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 10)
	public void click_ShowEntries() {
		DashboardRevenue showEntries = new DashboardRevenue(driver);
		try {
			Thread.sleep(3000);
			showEntries.click_ShowEntriesDropdwnoption();
			Thread.sleep(1000);
			showEntries.select_25EntriesButton();
			System.out.println("Select Show Entries succeessfully");
			extentReports.createTest("Dashboard select the Display List count").log(Status.PASS,
					"Successfully selected");
		} catch (Exception e) {
			System.err.println("Failed to select entries: " + e.getMessage());
			extentReports.createTest("Dashboard select the Display List count").log(Status.FAIL,
					"Failed to select the count. Exception: " + e.getCause());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 11)
	public void scroll_Thepage() {
		try {
			DashboardRevenue data = new DashboardRevenue(driver);
			Thread.sleep(2000);
			data.scroll_Thepage(driver);
			System.out.println("Scroll the page");
			extentReports.createTest("Scroll the page").log(Status.PASS,
					" Successfully Scroll the page");
		} catch (Exception e) {
			System.err.println("Failed to Scroll the page: " + e.getMessage());
			extentReports.createTest("Scroll the page").log(Status.FAIL,
					" Failed toScroll the page.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 12)
	public void clickStart_EndDate() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(1000);
			data.clickon_StartEndDateoOtion();
			Thread.sleep(1000);
			data.clickon_BackwardOption(driver);
			System.out.println("Click on Start & End Date");
			extentReports.createTest("Click on Start & End Date").log(Status.PASS,
					" Successfully Click on Start & End Date");
		} catch (Exception e) {
			System.err.println("Failed to Click on Start & End Date: " + e.getMessage());

			extentReports.createTest("Click on Start & End Date").log(Status.FAIL,
					" Failed to Click on Start & End Date.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 13)
	public void click_BackWard_ToSelect_StartDate() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(1000);
			data.clickon_BackwardOption(driver);
			Thread.sleep(1000);
			data.clickon_BackwardOption(driver);
			System.out.println("Click on backward month");

			extentReports.createTest("Click on backward month in DateRange").log(Status.PASS,
					" Successfully Click on backward month in daterange");
		} catch (Exception e) {
			System.err.println("Failed to Click on backward button to select StartDate: " + e.getMessage());

			extentReports.createTest("Click on backward month in DateRange").log(Status.FAIL,
					" Failed to Click on backward month in DateRange.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 14)
	public void clickStart_Date() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(1000);
			data.clickon_StartDate();
			Thread.sleep(1000);
			System.out.println("Select Start Date");

			extentReports.createTest("Select Start Date in DateRange").log(Status.PASS,
					" Successfully Select Start Date in daterange");
		} catch (Exception e) {
			System.err.println("Failed to Select Start Date: " + e.getMessage());

			extentReports.createTest("Select Start Date in DateRange").log(Status.FAIL,
					" Failed to Select Start Date in DateRange.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 15)
	public void click_ForWard_ToSelect_EndDate() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			Thread.sleep(1000);
			data.clickon_ForwardOption();
			System.out.println("Click forward button");
			data.scroll_Thepage(driver);
			extentReports.createTest("Click Forward Button in DateRange").log(Status.PASS,
					" Successfully Click on forward Button");
		} catch (Exception e) {
			System.err.println("Failed Click Forward Button in DateRange: " + e.getMessage());

			extentReports.createTest("Click Forward Button in DateRange").log(Status.FAIL,
					" Failed to Click Forward Button in DateRange.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 16)
	public void select_EndDate_ApplyBtn() {
		DashboardRevenue data = new DashboardRevenue(driver);
		try {
			data.clickon_ForwardOption();
			Thread.sleep(1000);
			data.clickon_EndDate();
			System.out.println("Select End Date");
			extentReports.createTest("Select End Date in DateRange").log(Status.PASS,
					" Successfully Click on dates Apply Button");
		} catch (Exception e) {
			System.err.println("Failed to Select on End Date: " + e.getMessage());
			extentReports.createTest("Select End Date in DateRange").log(Status.FAIL,
					" Failed to select End Date.Exception :" + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Revenue_001", priority = 17)
	public void click_ApplyBtn() {
		DashboardRevenue data = new DashboardRevenue(driver);
		DashboardSites data1 = new DashboardSites(driver);
		try {
			Thread.sleep(5000);
			data.clickon_ApplyButton();
			data1.scrollUP_Thepage();
			System.out.println("Click on dates Apply Button");
			extentReports.createTest("Apply Button in Start&End Date").log(Status.PASS,
					" Successfully Click on dates Apply Button");
		} catch (Exception e) {
			System.err.println("Failed to Click on dates Apply Button: " + e.getMessage());
			extentReports.createTest("Apply Button in Start&End Date").log(Status.FAIL,
					"Failed to Clicked on apply buuton in daterange:" + e.getMessage());
		}
	}

	@AfterClass
	public void continueProcess_DashboardRevenue() {
		try {
			super.setLogoutRequired(false); // Ensure logout is still set to false
			Thread.sleep(3000); // Ensure this delay is needed; otherwise, avoid using sleep
			extentReports.createTest("Do not Logout from the application").log(Status.PASS,
					"Successfully the application doesn't logout");
		} catch (Exception e) {
			extentReports.createTest("Logout from the application").log(Status.FAIL,
					"Logout from the application failed. Exception: " + e.getMessage());
		}
	}
}