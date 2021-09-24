package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of frame available in this webpage is " +size);
		driver.switchTo().frame("firstFr");
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys("Vishnu");
		driver.findElement(By.name("lname")).sendKeys("kanth");
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("vishnu2101996@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@routerlink='/courses']")).click();
		

	}

}
