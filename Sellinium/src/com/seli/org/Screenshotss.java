package com.seli.org;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotss {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File srcfile = scrShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\WELCOME\\Desktop\\snap1.png");
		FileUtils.copyFile(srcfile, dest);

	}

}
