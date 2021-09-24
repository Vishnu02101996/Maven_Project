package com.seli.org;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		browserConfig("chrome");

		Thread.sleep(2000);

		getURL("https://en-gb.facebook.com/");

		System.out.println(pageTitle());

		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.linkText("Create New Account"));

		clickOnElement(create);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement firstName = driver.findElement(By.name("firstname"));

		inputValues(firstName, "Vishnu");

		WebElement lastName = driver.findElement(By.name("lastname"));

		inputValues(lastName, "Vasudevan");

		WebElement emailId = driver.findElement(By.name("reg_email__"));

		inputValues(emailId, "vishnu2101996@gmail.com");

		WebElement reEnter = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		inputValues(reEnter, "vishnu2101996@gmail.com");

		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));

		inputValues(password, "Fzrider@02");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		selectBy(day, "value", 0, "11");

		allOptions(day);

		firstSelectedOption(day);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		selectBy(month, "visible", 0, "Feb");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

		selectBy(year, "index", 25, null);

		WebElement gender = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]"));

		actions(gender, null, "click");

		clearValues(lastName);

		WebElement submitBtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));

		System.out.println(getValues(submitBtn));

		System.out.println(getAttributeValue(firstName, "name"));

		System.out.println(getTagName(submitBtn));

		cssValue(lastName, "font-size");

		cssValue(submitBtn, "color");

		screenshot("C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\screenshot\\img.png");
	}

}
