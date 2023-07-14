package com.GlobalFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.Execution.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class GenericFunctions extends BaseClass {

	public static void launchBrowser(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("Launch chrome browser");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("Launch firefox browser");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Launch edge browser");
			break;

		default:
			System.out.println("Please enter the valid browsername");
			break;
		}
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(java.time.Duration.ofs);

	}

	public static void launchApplication(String URL) {
		driver.get(URL);
		System.out.println("Launching application : " + URL);
	}

	public static void clickElement(String xpath, String elementName) {

		driver.findElement(By.xpath(xpath)).click();
		System.out.println("Able to click the element : " + elementName);
	}

	public static void setData(String xpath, String value) {

		WebElement ele = driver.findElement(By.xpath(xpath));
		ele.click();
		// ele.clear();
		ele.sendKeys(value);
		System.out.println("User is able to enter the data");
	}

	public static void selectByVisibleText(String xpath, String value) {

		Select sc = new Select(driver.findElement(By.xpath(xpath)));
		sc.selectByVisibleText(value);

	}

	public static Map<String, String> excelDataRead(String testCaseName) {
		Map<String, String> map = new HashMap<>();
		try {

			File file = new File("TestData\\Selenium_TestData.xlsx");
			FileInputStream fis = new FileInputStream(file);

			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheet("testData");
			int rCount = sheet.getLastRowNum();

			for (int i = 0; i <= rCount; i++) {
				String testcase = sheet.getRow(i).getCell(0).getStringCellValue();
				if (testcase.equals(testCaseName)) {
					int cCount = sheet.getRow(i).getLastCellNum();
					for (int j = 1; j < cCount; j++) {
						String data = sheet.getRow(i).getCell(j).getStringCellValue();
						String[] value = data.split("=");
						map.put(value[0], value[1]);
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	public static String getScreenShot(String fileName) {

		TakesScreenshot takescreen = (TakesScreenshot) driver;
		File sourceFile = takescreen.getScreenshotAs(OutputType.FILE);
		String path = "D:\\MyWorkspace\\Selenium_Training_8_30\\screenshots\\" + fileName + ".PNG";
		File destFile = new File(path);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return path;
	}
	
	public static void logStatus(String mess,boolean status) {
		if(status) {
			test.log(LogStatus.PASS, mess);
			test.log(LogStatus.PASS, test.addScreenCapture(getScreenShot("1")));
		}else {
			test.log(LogStatus.FAIL, mess);
			test.log(LogStatus.FAIL, test.addScreenCapture(getScreenShot("1")));
		}
		
		
	}
}
