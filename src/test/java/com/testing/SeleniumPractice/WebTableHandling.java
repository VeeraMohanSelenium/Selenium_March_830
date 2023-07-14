package com.testing.SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling {

	@Test
	public void webtablehandling() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testingmasters.weebly.com/webtables.html");

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr/th"));

		System.out.println("List size is : " + list.size());

		for (WebElement ele : list) {
			System.out.println(ele.getText());

		}

		List<WebElement> listbody = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td"));

		System.out.println("List size is : " + listbody.size());

		for (WebElement ele : listbody) {
			System.out.println(ele.getText());

		}

	}

}
