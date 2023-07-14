package com.testing.SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubb

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Selenium");
		driver.findElement(By.id("LastName")).sendKeys("Selenium");
		WebElement dob = driver.findElement(By.name("DateOfBirthDay"));

		Select sc = new Select(dob);

//		sc.selectByIndex(5);
//		Thread.sleep(3000);
//		sc.selectByValue("10");
//		Thread.sleep(3000);
//		sc.selectByVisibleText("25");

		WebElement dom = driver.findElement(By.name("DateOfBirthMonth"));
		sc = new Select(dom);

//		sc.selectByIndex(4);
//		Thread.sleep(3000);
//		sc.selectByValue("12");
//		Thread.sleep(3000);
		sc.selectByVisibleText("May");

		WebElement value = sc.getFirstSelectedOption();
		System.out.println(value.getText());

		List<WebElement> ele = sc.getAllSelectedOptions();
		WebElement d = ele.get(0);
		System.out.println(d.getText());

		List<WebElement> options = sc.getOptions();
		for (WebElement e : options) {
			System.out.println(e.getText());
		}

		// sc.deselectAll();

		//sc.deselectByIndex(5);
		sc.deselectByValue(null);
		sc.deselectByVisibleText(null);

	}

}
