package com.seli.org;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicxpath1 {

	public static void main(String[] args) throws Throwable {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the max price of T-shirt:");
		int max = s.nextInt();
		System.out.println("Enter the min price of T-shirt:");
		int min = s.nextInt();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_f4a13175-e822-4853-a87e-98d2b5daad84_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> listofPrices = driver.findElements(
				By.xpath("//div[@class='_3I9_wc']//preceding-sibling::div[@class='_30jeq3']"));
		int index = 0;

		Iterator<WebElement> ite = listofPrices.iterator();

		while (ite.hasNext()) {
			String prices = ite.next().getText().replace("₹", "").replace(",", "");
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
