package com.seli.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectSignUpClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("vishnu2101996@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Vishnu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Vasudevan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Fzrider02");
		Thread.sleep(1000);
		WebElement select1 = driver.findElement(By.xpath("//select[@id='days']"));
		Select s1 = new Select(select1);
		s1.selectByValue("2");
		Thread.sleep(1000);
		WebElement select2 = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2 = new Select(select2);
		s2.selectByValue("10");
		Thread.sleep(1000);
		WebElement select3 = driver.findElement(By.xpath("//select[@id='years']"));
		Select s3 = new Select(select3);
		s3.selectByValue("1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Greens Technologies");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Greens Technologies,No.149");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("1st Floor,Porur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chennai");
		Thread.sleep(1000);
		WebElement select4 = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s4 = new Select(select4);
		s4.selectByValue("10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
		Thread.sleep(1000);
		WebElement select5 = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s5 = new Select(select5);
		s5.selectByValue("21");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9500161720");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

	}

}
