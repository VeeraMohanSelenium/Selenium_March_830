package com.testngPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am beforeMethod method");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test
	public void testMethod() {
		System.out.println("I am testMethod method");
		driver.get("https://demo.nopcommerce.com/");
		WebElement text_computers = driver.findElement(By.xpath("//a[starts-with(text(),'Computers')]"));

		Actions ac = new Actions(driver);
		ac.moveToElement(text_computers).build().perform();

		WebElement link_desktops = driver.findElement(By.xpath("//a[starts-with(text(),'Desktops')]"));
		// ac.contextClick(link_desktops).build().perform();
		ac.click(link_desktops).build().perform();

//		ac.contextClick().build().perform();
//		WebElement link_books = driver.findElement(By.xpath("//a[starts-with(text(),'Books')]"));
//		ac.contextClick(link_books).build().perform();

		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();

		WebElement ele = driver.findElement(By.xpath("(//ul[@class='option-list'])[3]/li[1]/input"));
		ac.doubleClick(ele).build().perform();
	}

	@Test
	public void testMethod1() {
		System.out.println("I am testMethod1 method");
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();

		WebElement frame_element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame_element);

		WebElement drad = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		// Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drad, drop).build().perform();

		driver.switchTo().defaultContent();
		WebElement ele_draggable = driver.findElement(By.xpath("//a[text()='Draggable']"));
		ele_draggable.click();
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("I am aftermethod method");
		driver.close();
	}

}
