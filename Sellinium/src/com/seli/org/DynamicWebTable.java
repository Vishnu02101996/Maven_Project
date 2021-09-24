package com.seli.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	static int indexofTotalCase, indexofTotalRecovered, indexofTotalDeath, indexofActiveCase;
	static String country = "India";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// get all table headers
		List<WebElement> allHeaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

		// iterate headers
		for (int i = 0; i < allHeaders.size(); i++) {
			String text1 = allHeaders.get(i).getText();
			String text2 = text1.replaceAll("\n", " ");
			// System.out.println(text2);
			if (text2.equalsIgnoreCase("Total Cases")) {
				indexofTotalCase = i;

			} else if (text2.equalsIgnoreCase("Total Recovered")) {
				indexofTotalRecovered = i;

			} else if (text2.equalsIgnoreCase("Total Deaths")) {
				indexofTotalDeath = i;
			} else if (text2.equalsIgnoreCase("Active Cases")) {
				indexofActiveCase = i;
			}

		}
		// move to table body
		List<WebElement> allRows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr[@role='row']"));
		// iterate row
		for (int i = 0; i < allRows.size(); i++) {
			// get column
			List<WebElement> allData = allRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allData.size(); j++) {

				if (allData.get(j).getText().equalsIgnoreCase(country)) {
					System.out.println("Total Cases in India:" + allData.get(indexofTotalCase).getText());
					System.out.println("Total Recovered in India:" + allData.get(indexofTotalRecovered).getText());
					System.out.println("Total Deaths in India:" + allData.get(indexofTotalDeath).getText());
					System.out.println("Active Cases in India:" + allData.get(indexofActiveCase).getText());
					System.exit(0);

				}

			}

		}

	}

}
