package com.testCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.GlobalFunctions.GenericFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class TC_001 extends GenericFunctions {

	@Test(priority = 0)
	public void tC_user_Registor() {
		try {
		test = report.startTest("tC_user_Registor");
		launchBrowser(map.get("browsername"));
		logStatus("Launch browser", true);
		getScreenShot("1");
		launchApplication(map.get("url"));
		logStatus("Launch Application", true);
		clickElement("//a[text()='Register']", "Registor");
		logStatus("Click on Registor button", true);
		clickElement("//input[@id='gender-male']", "Gender button");
		test.log(LogStatus.PASS, "click gender button");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("4")));
		test.addScreenCapture(getScreenShot("4"));
		setData("//input[@id='FirstName']", map.get("firstName"));
		test.log(LogStatus.PASS, "Enter first name");
		getScreenShot("5");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("5")));
		selectByVisibleText("//select[@name='DateOfBirthDay']", map.get("day"));
		test.log(LogStatus.PASS, "enter dob");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("6")));
		setData("//input[@id='FirstName']", "Mohan");
		//report.flush();
		}catch (Exception e) {
			logStatus(e.toString(), false);
		}
	}

	@Test(priority = 1)
	public void tC_user_Login() {
		test = report.startTest("tC_user_Login");
		launchBrowser(map.get("browsername"));
		test.log(LogStatus.PASS, "Launch browser");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("1")));
		getScreenShot("1");
		launchApplication(map.get("url"));
		test.log(LogStatus.PASS, "Launch application");
		getScreenShot("2");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("2")));
		clickElement("//a[text()='Register']", "Registor");
		test.log(LogStatus.PASS, "Click registor button");
		getScreenShot("3");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("3")));
		clickElement("//input[@id='gender-male']", "Gender button");
		test.log(LogStatus.PASS, "click gender button");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("4")));
		test.addScreenCapture(getScreenShot("4"));
		setData("//input[@id='FirstName']", map.get("firstName"));
		test.log(LogStatus.PASS, "Enter first name");
		getScreenShot("5");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("5")));
		selectByVisibleText("//select[@name='DateOfBirthDay']", map.get("day"));
		test.log(LogStatus.PASS, "enter dob");
		test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("6")));
		setData("//input[@id='FirstName']", "Mohan");
		report.flush();
	}

}
