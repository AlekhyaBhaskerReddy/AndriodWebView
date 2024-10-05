package com.silvassaOfficer.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class LaunchApp extends Basetest {
    public static WebElement We;

    @Test(groups = "LaunchApp", priority = 1)
    public void officer_App() {
        try {
            Thread.sleep(3000);
            WebElement appNameElement = driver.findElement(By.id("app_name"));
            String appNameText = appNameElement.getText();
            if (appNameText.equals("SILVASSA OFFICER")) {
                System.out.println("App name is matched : " + appNameText);
                Assert.assertTrue(true, "App name is matched");
                extentReports.createTest("SILVASSA OFFICER Verification").log(Status.PASS,
                        "App name matched : " + appNameText);

            } else {
                Assert.assertTrue(false, "App name is not matched");
                System.out.println("App name is not matched");
                extentReports.createTest("SILVASSA OFFICER Verification").log(Status.PASS,
                        "SILVASSA OFFICER app name not found. ");
            }
        } catch (Exception e) {
            extentReports.createTest("SILVASSA OFFICER Verification").log(Status.FAIL,
                    "Failed to verify SILVASSA OFFICER app name. Exception: " + e.getMessage());
            Assert.assertTrue(false, "App name is not matched");
            System.out.println("App name is not matched : " + e.getMessage());
        }
    }

    @Test(groups = "LaunchApp", priority = 2)
    public void clickon_LoginButton() {
        try {
            Thread.sleep(3000);
            WebElement loginButton = driver.findElement(By.xpath(
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
            if (loginButton != null) {
                Thread.sleep(1000);
                loginButton.click();
                System.out.println("Login Button found and clicked.");
                extentReports.createTest("Login Button").log(Status.PASS,
                        " Successfully Login Button found and clicked");
            } else {
                System.out.println("Login Button not found. Terminating the execution.");
            }
        } catch (Exception e) {
            extentReports.createTest("Login Button").log(Status.FAIL,
                    "Failed to found login button . Exception: " + e.getMessage());
            Assert.assertTrue(false, "Login Button not found. Terminating the execution.");
        }
    }
}
