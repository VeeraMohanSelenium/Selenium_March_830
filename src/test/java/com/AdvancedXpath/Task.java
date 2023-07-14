package com.AdvancedXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> empID = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[2]"));
		List<WebElement> degi = driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[5]"));

		for (int i = 0; i < degi.size(); i++) {

			String text = degi.get(i).getText();
			if (text.equals("Analyst")) {
				String emp = empID.get(i).getText();
				System.out.println(emp + " - " + text);
			}

		}

	}

}
