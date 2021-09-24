package com.seli.org;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandl {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/watches");
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();

		Set<String> handall = driver.getWindowHandles();
		for (String s1 : handall) {
			driver.switchTo().window(s1);

		}

		driver.findElement(By.xpath("(//span[text()='RetailNet'])[2]")).click();

	}

}
