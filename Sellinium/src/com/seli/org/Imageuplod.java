package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageuplod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\WELCOME\\Pictures\\Screenshots");

	}

}
