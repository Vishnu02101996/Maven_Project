package com.seli.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("hi");
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		

	}

}
