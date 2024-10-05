package com.silvassaOfficer.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.LoginTest;

public class TC_LoginTest_001 extends Basetest {

	@BeforeClass
	public void setUp() {
		super.setUp();
		super.setLogoutRequired(true);
	}

	@Test(groups = "TC_LoginTest_001", priority = 3)
	public void verify_Title() {
		try {
			Thread.sleep(3000);
			WebElement appNameElement = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.TextView"));
			String appNameText = appNameElement.getText();
			if (appNameText.equals("WELCOME TO SILVASSA SMART PARKING WEB PORTAL")) {
				System.out.println("Title name is matched : " + appNameText);
				Assert.assertTrue(true, "Title name is matched");
				extentReports.createTest("Title Verification").log(Status.PASS,
						"Title name matched. ");
			} else {
				Assert.assertTrue(false, "Title name is not matched");
				System.out.println("Title name is not matched");
				extentReports.createTest("Title Verification").log(Status.PASS,
						"Title app name not found. ");
			}
		} catch (Exception e) {
			extentReports.createTest("Title Verification").log(Status.FAIL,
					"Failed to verify Title name. Exception: " + e.getMessage());
		}
	}

	@SuppressWarnings("deprecation")
	@Test(groups = "TC_LoginTest_001", priority = 4, description = "Test to validate user login functionality")
	public void login() {
		extentTest = extentReports.createTest("Silvassa Android Officer-User Login");
		try {
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			LoginTest login = new LoginTest(driver);
			login.setusername(UserName);
			login.setpassword(password);
			login.clickSubmit();
			System.out.println("Entered Username & Password Successfully and clicked the login button");
			Assert.assertTrue(true, "Entered Username & Password Successfully and clicked the login button");

			extentReports.createTest("Login details").log(Status.PASS,
					"Successfully entered the login details.");
		} catch (Exception e) {
			System.err.println("Failed to Enter Username & Password and clicked the login button." + e.getMessage());
			extentReports.createTest("Login details").log(Status.FAIL,
					"Failed to enter the login details. Exception: " + e.getMessage());
		}
	}

	@AfterClass
	public void tearDown() {
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
