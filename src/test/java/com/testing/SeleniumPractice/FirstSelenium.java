package com.testing.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	public static WebDriver driver;

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
			System.out.println("Please pass valid browser name");
			break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser("firefox");
		driver.get("http://demo.nopcommerce.com/");
		String cuURL = driver.getCurrentUrl();
		System.out.println(cuURL);

		System.out.println(driver.getTitle());

		// driver.findElement(null)

		System.out.println(driver.getPageSource());

		String curWindowID = driver.getWindowHandle();
		System.out.println(curWindowID);

		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());

		driver.manage().window().maximize();
//		driver.navigate();
//		
//		driver.switchTo();

		System.out.println(driver.toString());

		// driver.close();

		// driver.quit();

	}

}
