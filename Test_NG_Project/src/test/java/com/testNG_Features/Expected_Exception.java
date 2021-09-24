package com.testNG_Features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Expected_Exception {
	public static WebDriver driver;

	@Test(expectedExceptions = NullPointerException.class)
	private void getUrl() {
		driver.get("https://www.google.com/");
	}

}
