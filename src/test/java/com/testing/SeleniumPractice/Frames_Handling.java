package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();

		WebElement frame_element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(frame_element);

		WebElement drad = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drad, drop).build().perform();

		driver.switchTo().defaultContent();
		WebElement ele_draggable = driver.findElement(By.xpath("//a[text()='Draggable']"));
		ele_draggable.click();
		
		
		

	}

}
