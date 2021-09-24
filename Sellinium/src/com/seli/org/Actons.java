package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement doubleClik = driver.findElement(By.id("doubleClickBtn"));
		Actions a = new Actions(driver);
		a.doubleClick(doubleClik).perform();
		WebElement text1 = driver.findElement(By.id("doubleClickMessage"));
		String s1 = text1.getText();
		System.out.println(s1);
		WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		a.click(singleClick).perform();
		WebElement text2 = driver.findElement(By.id("dynamicClickMessage"));
		String s2 = text2.getText();
		System.out.println(s2);
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rightClick).perform();
		WebElement text3 = driver.findElement(By.id("rightClickMessage"));
		String s3 = text3.getText();
		System.out.println(s3);

	}

}
