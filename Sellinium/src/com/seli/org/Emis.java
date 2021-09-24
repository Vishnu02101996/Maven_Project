package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emis {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://groww.in/calculators/simple-interest-calculator/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement amount = driver.findElement(By.xpath("(//input[@id='inputPrincipal']"));
		amount.click();
		//amount.clear();
		//Thread.sleep(2000);
		//amount.sendKeys("150000");

	}

}
