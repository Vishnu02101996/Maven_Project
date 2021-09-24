package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizee {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/resizable");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement dragger = driver.findElement(By.xpath("//*[@id=\"resizableBoxWithRestriction\"]/span"));
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);
		Actions resize = new Actions(driver);
		resize.dragAndDropBy(dragger, 300, 100).perform();
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		WebElement drag1 = driver.findElement(By.cssSelector("#resizable > span"));
		resize.dragAndDropBy(drag1, 600, 200).perform();
		System.out.println("done resizing");

	}

}
