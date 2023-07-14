package com.Execution;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.GlobalFunctions.GenericFunctions;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass {
	public static WebDriver driver = null;
	public static ExtentReports report;
	public static com.relevantcodes.extentreports.ExtentTest test;
	public Map<String, String> map = new HashMap<>();

	@BeforeSuite
	public void beforesuit() {
		report = new ExtentReports("Results\\SeleniumReport.html");

	}

	@BeforeMethod
	public void beforeMethod(ITestResult result) {
		map.clear();
		String testCaseName = result.getMethod().getMethodName();
		map = GenericFunctions.excelDataRead(testCaseName);

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@AfterSuite
	public void afterSuite() {
		report.flush();
	}

}
