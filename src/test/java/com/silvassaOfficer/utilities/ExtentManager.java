package com.silvassaOfficer.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// public class ExtentManager {
//     private static ExtentReports extentReports;

//     public static ExtentReports getInstance() {
//         if (extentReports == null) {
//             ExtentSparkReporter spark = new ExtentSparkReporter("output/Silvassa-Report_April_25.html");
//             extentReports = new ExtentReports();
//             extentReports.attachReporter(spark);

//         }

//         return extentReports;
//     }
// }

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentSparkReporter spark;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            spark = new ExtentSparkReporter("test-output/MyExtentReport.html");
            extent.attachReporter(spark);
            setSystemInfo();
        }
        return extent;
    }

    private static void setSystemInfo() {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("extent.properties")) {
            properties.load(fileInputStream);
            extent.setSystemInfo("Automation Engineer", properties.getProperty("Automation"));
            extent.setSystemInfo("OS", properties.getProperty("OS"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
