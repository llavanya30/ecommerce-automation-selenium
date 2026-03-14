package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static ExtentReports getInstance() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter(
                "reports/TestReport.html");
            reporter.config().setReportName("E-Commerce Automation Report");
            reporter.config().setDocumentTitle("Test Results");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Tester", "Lavanya");
            extent.setSystemInfo("Environment", "QA");
        }
        return extent;
    }
}