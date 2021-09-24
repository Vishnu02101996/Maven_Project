package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dragdropdemo extends BaseClass1 {

	public static void main(String[] args) {
		browserConfig("chrome");
		getURL("https://letcode.in/dropable");
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		actions(src, dest, "dragdrop");

	}

}
