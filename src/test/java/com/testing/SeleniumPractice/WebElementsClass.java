package com.testing.SeleniumPractice;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		WebElement element = driver.findElement(By.id("FirstName"));

		// perform click operation
		element.click();
		element.sendKeys("Selenium");
		Thread.sleep(3000);
		element.clear();
		element.sendKeys("Testing");

		Thread.sleep(3000);

		String val = element.getAttribute("data-val-required");
		System.out.println(val);
		// element.clear();

		Point data = element.getLocation();
		System.out.println(data);

		org.openqa.selenium.Dimension di = element.getSize();

		System.out.println(di);

		String tagname = element.getTagName();
		System.out.println(tagname);

		boolean status = element.isDisplayed();
		System.out.println(status);

		status = element.isEnabled();
		System.out.println(status);
		element.isSelected();
		

		String text = driver.findElement(By.id("check-availability-button")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[2]/input"));

	}

}
