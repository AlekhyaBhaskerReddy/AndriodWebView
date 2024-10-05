package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.DashboardOccupancy;

public class TC_Dashboard_Occupancy_002 extends Basetest {

	@BeforeClass
	public void setUp() {
		super.setUp();
		super.setLogoutRequired(false);
	}

	@Test(groups = "TC_Dashboard_Occupancy_002", priority = 16)
	public void clickon_AvgOccupancy() {
		try {
			DashboardOccupancy data = new DashboardOccupancy(driver);
			Thread.sleep(3000);
			data.clickon_AvgOccupancy();
			System.out.println("Clicked on Average Occupancy Tab In Dashboard");
			extentReports.createTest("Click on Average Occupancy Tab").log(Status.PASS,
					" Successfully Clicked on Average Occupancy Tab In Dashboard");
		} catch (Exception e) {
			Assert.assertTrue(false, "Failed to Click on Average Occupancy Tab In Dashboard: " + e.getMessage());
			System.err.println("Failed to Click on Average Occupancy Tab In Dashboard: " + e.getMessage());
			extentReports.createTest("Average Occupancy Tab In Dashboard").log(Status.FAIL,
					"Failed to Click on Average Occupancy Tab In Dashboard: " + e.getMessage());
		}
	}

	@Test(groups = "TC_Dashboard_Occupancy_002", priority = 17)
	public void get_AvgOccupancyData() {
		extentTest = extentReports.createTest("Get Average Occupancy Data");
		DashboardOccupancy data = new DashboardOccupancy(driver);
		try {
			Thread.sleep(2000);
			data.getOccupancy();
			String cardData = data.getOccupancy();
			System.out.println("Initail Occupancy data : " + cardData);

			Thread.sleep(5000);
			// data.scroll_Thepage();
			// System.out.println("Scrolling up");

			extentReports.createTest("Get Average Occupancy Data").log(Status.PASS,
					"Successfully Initail Occupancy data :" + cardData);
		} catch (Exception e) {
			Assert.assertTrue(false, "Failed to get Initail Occupancy data: " + e.getMessage());
			System.err.println("Failed to get Initail Occupancy data : " + e.getMessage());
			extentReports.createTest("Initail Occupancy data").log(Status.FAIL,
					"Failed Initail Occupancy data. Exception: " + e.getMessage());
		}
	}

	// @Test(groups = "TC_Dashboard_Occupancy_002", priority = 19)
	// public void click1D_Button() {
	// DashboardOccupancy data = new DashboardOccupancy(driver);
	// try {
	// Thread.sleep(2000);
	// data.clickonAvgOccu_1Doption();

	// System.out.println("Click on One Day Occupancy");
	// extentReports.createTest("Day Occupancy is Displaying ").log(Status.PASS,
	// "Successfully Click on One Day Occupancy");
	// } catch (Exception e) {

	// extentReports.createTest("Day Occupancy is not displaying").log(Status.FAIL,
	// "Failed to Click on One Day Occupancy Exception: " + e.getMessage());
	// System.err.println("Failed to Click on One Day Occupancy : " +
	// e.getMessage());
	// }
	// }

	// @Test(groups = "TC_Dashboard_Occupancy_002", priority = 20)
	// public void click1W_Button() {
	// DashboardOccupancy data = new DashboardOccupancy(driver);
	// try {
	// Thread.sleep(2000);
	// data.clickonAvgOccu_1Woption();
	// System.out.println("Click on One Week Occupancy ");
	// extentReports.createTest("Week Occupancy is Displaying ").log(Status.PASS,
	// "Successfully Click on One Week Occupancy ");
	// } catch (Exception e) {

	// extentReports.createTest("Click on One Week Occupancy").log(Status.FAIL,
	// "Failed to Click on One Week Occupancy. Exception: " + e.getMessage());
	// System.err.println("Failed to Click on One Week Occupancy: " +
	// e.getMessage());
	// }
	// }

	// @Test(groups = "TC_Dashboard_Occupancy_002", priority = 21)
	// public void click1M_Button() {
	// DashboardOccupancy data = new DashboardOccupancy(driver);
	// DashboardSites data1 = new DashboardSites(driver);
	// try {
	// Thread.sleep(2000);
	// data.clickonAvgOccu_1Moption();
	// System.out.println("Click on One Month Occupancy ");
	// Thread.sleep(2000);
	// data1.scrollUP_Thepage();
	// extentReports.createTest("Dashboard Month Occupancy").log(Status.PASS,
	// "Successfully Click on One Month Occupancy");
	// } catch (Exception e) {

	// extentReports.createTest("Dashboard Month Occupancy").log(Status.FAIL,
	// "Failed to Click on One Month Occupancy. Exception: " + e.getCause());
	// System.err.println("Failed to Click on One Month Occupancy : " +
	// e.getMessage());
	// }
	// }
	@AfterClass
	public void continueProcess_DashboardOccupancy() {
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
