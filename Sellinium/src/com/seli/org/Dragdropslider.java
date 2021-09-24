package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropslider {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		Actions a = new Actions(driver);
		WebElement amount = driver.findElement(By.cssSelector("#loanamountslider>span"));
		WebElement intRate = driver.findElement(By.cssSelector("#loaninterestslider>span"));
		WebElement tenure = driver.findElement(By.cssSelector("#loantermslider>span"));
		a.dragAndDropBy(amount, -130, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(intRate, -126, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(tenure, -322, 0).build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,450)");
		WebElement total = driver.findElement(By.cssSelector("#emiamount>p>span"));
		String s = total.getText();
		System.out.println(s);
		

	}

}
