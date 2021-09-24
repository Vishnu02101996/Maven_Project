package com.seli.org;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("vishaalseenu1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Srivasa@02");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Realme buds 2");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("realme Buds 2 Wired Headset")).click();
		Thread.sleep(2000);
		Set<String> w = driver.getWindowHandles();
		
		for (String string : w) {
			driver.switchTo().window(string);
			}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='E3folB']")).click();
		driver.findElement(By.xpath("(//span[@class='_2dQV-8'])[11]")).click();
		driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
		driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//span[text()='UPI']")).click();
		driver.findElement(By.xpath("//div[text()='Your UPI ID']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vishnu2101996@oksbi");
		driver.findElement(By.xpath("//div[text()='Verify']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
