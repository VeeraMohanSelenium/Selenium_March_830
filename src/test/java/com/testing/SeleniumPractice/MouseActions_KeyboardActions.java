package com.testing.SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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

}
