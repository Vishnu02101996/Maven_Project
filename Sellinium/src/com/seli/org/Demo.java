package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//a[@title='Close']"));
		close.click();
		WebElement message = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		message.sendKeys("good night");
		WebElement show = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
		show.click();
		WebElement sum1 = driver.findElement(By.xpath("//input[@id='sum1']"));
		sum1.sendKeys("10");
		WebElement sum2 = driver.findElement(By.xpath("//input[@id='sum2']"));
		sum2.sendKeys("15");
		WebElement sum = driver.findElement(By.xpath("//button[@onclick='return total()']"));
		sum.click();

	}

}
