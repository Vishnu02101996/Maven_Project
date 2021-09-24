package com.seli.org;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws Throwable {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the max price of T-shirt:");
		int max = s.nextInt();
		System.out.println("Enter the min price of T-shirt:");
		int min = s.nextInt();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/men-tshirts/c/830216014");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> listofPrices = driver.findElements(
				By.xpath("//span[@class='orginal-price']//parent::div//preceding-sibling::span[@class='price  ']"));
		int index = 0;

		Iterator<WebElement> ite = listofPrices.iterator();

		while (ite.hasNext()) {
			String prices = ite.next().getText().replace("Rs. ", "").replace(",", "");
			int price = Integer.parseInt(prices);
			if (price < max) {

				if (price > min) {
					WebElement element = listofPrices.get(index);
			
					element.click();
					Thread.sleep(1000);
				}
			}
			index++;

		}
		s.close();

	}

}
