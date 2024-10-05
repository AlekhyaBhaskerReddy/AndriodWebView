package com.silvassaOfficer.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.silvassaOfficer.pageobject.Alarms_DeviceAlerts;
import com.silvassaOfficer.pageobject.ReservationReports1;

public class Alarms_Notifications_022 extends TC_LoginTest_001 {

    @BeforeClass
    public void setUp() {
        super.setUp();
        super.setLogoutRequired(true);
    }

    @Test(groups = "Alarms_Notifications_022", priority = 225)
    public void clickon_Menu_Alarms_DeviceAlerts() {
        try {
            ReservationReports1 data = new ReservationReports1(driver);
            Thread.sleep(3000);
            data.clickon_Menu();
            System.out.println("Clicked on Menu In Dashboard");
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_AlarmsNotifications();
            System.out.println("Clicked on Alarms&Notifications");

            extentReports.createTest("Alarms&Notifications").log(Status.PASS,
                    " Successfully clicked on Alarms&Notifications");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Alarms&Notifications: " + e.getMessage());
            System.err.println("Failed to click on Alarms&Notifications: " + e.getMessage());
            extentReports.createTest("Alarms&Notifications").log(Status.FAIL,
                    "Failed to click on Alarms&Notifications:  " + e.getMessage());
        }
    }

    @Test(groups = "Alarms_Notifications_022", priority = 226)
    public void clickon_Alarms_ManualAlerts() {
        try {
            Thread.sleep(3000);
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_ManualAlerts();
            System.out.println("Clicked on Manual Alerts");

            extentReports.createTest("Alarms&Notifications - Manual Alerts").log(Status.PASS,
                    " Successfully clicked on Manual Alerts in Alarms&Notifications ");
        } catch (Exception e) {
            Assert.assertTrue(false, "Failed to click on Manual Alerts in Alarms&Notifications: " + e.getMessage());
            System.err.println("Failed to click on Manual Alerts in Alarms&Notifications: " + e.getMessage());
            extentReports.createTest("Alarms&Notifications - Manual Alerts").log(Status.FAIL,
                    "Failed to click on Manual Alerts inAlarms&Notifications:  " + e.getMessage());
        }
    }

    @Test(groups = "Alarms_Notifications_022", priority = 227)
    public void clickon_Alarms_VehicleOTAlerts() {
        try {
            Thread.sleep(3000);
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_VehicleOTAlerts();
            System.out.println("Clicked on Vehicle Overtime Alerts");

            extentReports.createTest("Alarms&Notifications - Vehicle Overtime Alerts").log(Status.PASS,
                    " Successfully clicked on Vehicle Overtime Alerts in Alarms&Notifications ");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to click on Vehicle Overtime Alerts in Alarms&Notifications: " + e.getMessage());
            System.err.println("Failed to click on Vehicle Overtime Alerts in Alarms&Notifications: " + e.getMessage());
            extentReports.createTest("Alarms&Notifications - Vehicle Overtime Alerts").log(Status.FAIL,
                    "Failed to click on Vehicle Overtime Alerts inAlarms&Notifications:  " + e.getMessage());
        }
    }

    @Test(groups = "Alarms_Notifications_022", priority = 227)
    public void clickon_Alarms_VehicleOTAlerts_SelectVehicleType() {
        try {
            Thread.sleep(3000);
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_VehicleOTAlerts_SelectFourWheeler();
            System.out.println("Select Four Wheeler vehicle type");
            alerts.select_VehicleOTAlerts_SelectTwoWheeler();
            System.out.println("Select Two Wheeler vehicle type");

            extentReports.createTest("Vehicle Overtime Alerts select vehicletype").log(Status.PASS,
                    " Successfully click on vehicle types in Vehicle Overtime Alerts ");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to click on vehicle types in Vehicle Overtime Alerts: " + e.getMessage());
            System.err.println("Failed to click on vehicle types in Vehicle Overtime Alerts: " + e.getMessage());
            extentReports.createTest("Vehicle Overtime Alerts select vehicle type").log(Status.FAIL,
                    "Failed to click on vehicle types in Vehicle Overtime Alerts:  " + e.getMessage());
        }
    }

    @Test(groups = "Alarms_Notifications_022", priority = 228)
    public void clickon_Alarms_TransactionAlert() {
        try {
            Thread.sleep(3000);
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_TransactionAlerts();
            System.out.println("Click on Transaction Alert");

            extentReports.createTest("Click on Transaction Alert").log(Status.PASS,
                    " Successfully click on Transaction Alerts ");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to click on Transaction Alerts: " + e.getMessage());
            System.err.println("Failed to click on Transaction Alerts: " + e.getMessage());
            extentReports.createTest("Click on Transaction Alerts ").log(Status.FAIL,
                    "Failed to click onTransaction Alerts:  " + e.getMessage());
        }
    }

    @Test(groups = "Alarms_Notifications_022", priority = 229)
    public void clickon_Alarms_PosAlert() {
        try {
            Thread.sleep(3000);
            Alarms_DeviceAlerts alerts = new Alarms_DeviceAlerts(driver);
            Thread.sleep(2000);
            alerts.select_PosAlerts();
            System.out.println("Select Pos Alert");

            extentReports.createTest("Click on Pos Alerts ").log(Status.PASS,
                    " Successfully click on Pos Alerts ");
        } catch (Exception e) {
            Assert.assertTrue(false,
                    "Failed to click on Pos Alerts: " + e.getMessage());
            System.err.println("Failed to click on Pos Alerts: " + e.getMessage());
            extentReports.createTest("Click on Pos Alerts select ").log(Status.FAIL,
                    "Failed to click on Pos Alerts:  " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown_FromAlarmsNotifications() {
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
