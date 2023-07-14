package com.testing.SeleniumPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		WebElement frame_ele = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame_ele);
		String mainWindowID = driver.getWindowHandle();
		System.out.println("Main window id : " + mainWindowID);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("855536622");

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//span[@class='lightbluecolor'])[5]/a")).click();
		System.out.println(driver.getTitle());

		// window switching method
		switchWindow(2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindowID);
		System.out.println(driver.getTitle());
		driver.close();

	}

	public static void switchWindow(int windowNum) {
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		int num = 1;
		for (String wind : windows) {
			System.out.println("Windows :" + wind);

			if (num == windowNum) {
				driver.switchTo().window(wind);
				System.out.println("Window id is : " + wind);
				break;
			}
			num++;
		}

	}

}
