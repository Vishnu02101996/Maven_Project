package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.bajajfinserv.in/fixed-deposit-calculators");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		// investment amount Rs.200000, Tenure 48 months
		System.out.println("FD Investment amount=Rs.200000,Period=48 months");
		WebElement amnt = driver.findElement(By.xpath("//*[@id=\"v1_salarySlider\"]/div[5]"));
		a.dragAndDropBy(amnt, -140, 0).build().perform();
		Thread.sleep(2000);

		WebElement tenure = driver.findElement(By.xpath("//*[@id=\"EMISlider\"]/div[5]"));
		a.dragAndDropBy(tenure, 200, 0).build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement intr1 = driver.findElement(By.xpath("//em[@id='InterestFD']"));
		String s1 = intr1.getText();
		System.out.println("Cumulative interest for non senior citizen investing offline: " + s1);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"professiontype\"]/div[2]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement intr2 = driver.findElement(By.xpath("//em[@id='InterestFD']"));
		String s2 = intr2.getText();
		System.out.println("Cumulative interest for non senior citizen investing online: " + s2);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"professiontype\"]/div[3]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,425)");
		Thread.sleep(2000);
		WebElement intr3 = driver.findElement(By.xpath("//em[@id='InterestFD']"));
		String s3 = intr3.getText();
		System.out.println("Cumulative interest for senior citizen investing offline/online: " + s3);
		driver.close();

	}

}
