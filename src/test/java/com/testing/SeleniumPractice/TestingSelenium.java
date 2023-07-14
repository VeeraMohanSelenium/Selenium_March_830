package com.testing.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");

	}

}
