package com.testing.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("email"));

		ele.sendKeys("Selenium");
		// driver.findElement(By.name("pass")).sendKeys("Testing");
		// driver.findElement(By.className("inputtext _55r1 _6luy
		// _9npi")).sendKeys("Data");
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		System.out.println(elements.size());
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("total links is : " + link.size());

		for (int i = 0; i < link.size(); i++) {

			String val = link.get(i).getText();
			System.out.println(val);

		}
		// driver.findElement(By.linkText("Forgotten password?")).click();

		// driver.findElement(By.partialLinkText("Forgotten")).click();

		driver.findElement(By.id("u_0_0_Mt")).click();

	}

}
