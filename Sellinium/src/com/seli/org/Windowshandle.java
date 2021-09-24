package com.seli.org;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		String handle1 = driver.getWindowHandle();
		Set<String> handle2 = driver.getWindowHandles();
		for (String s : handle2) {
			driver.switchTo().window(s);
		}

		WebElement text1 = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(text1.getText());
		driver.switchTo().window(handle1).getCurrentUrl();
		WebElement text2 = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		System.out.println(text2.getText());

	}

}
