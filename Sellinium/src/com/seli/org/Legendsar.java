package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Legendsar {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		WebElement drop1 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s1 = new Select(drop1);
		Thread.sleep(2000);
		s1.selectByValue("9");
		WebElement drop2 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s2 = new Select(drop2);
		Thread.sleep(2000);
		s2.selectByVisibleText("1996");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, October 2nd, 1996']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
		Thread.sleep(2000);
		
		

	}

}
