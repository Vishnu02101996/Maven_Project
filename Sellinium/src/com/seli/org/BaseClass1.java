package com.seli.org;

import java.io.File; 
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {

	static WebDriver driver;

	// BrowserConfig

	public static void browserConfig(String type) {

		if (type.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\WELCOME\\eclipse-workspace\\Miniproject\\Driver1\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty(null, null);

			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("Edge")) {
			System.setProperty(null, null);

			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

	}

	// getURL ---> String
	public static void getURL(String url) {

		driver.get(url);

	}

	// ScreenShot --> String

	public static void screenshot(String path) throws IOException {

		TakesScreenshot shot = (TakesScreenshot) driver;

		File src = shot.getScreenshotAs(OutputType.FILE);

		File dest = new File(path);

		FileUtils.copyFile(src, dest);

	}
	// Close

	public static void close() {
		driver.close();

	}

	// Quit

	public static void quit() {
		driver.quit();

	}

	// Navigate to---> String
	public static void navigateUrl(String url) {
		driver.navigate().to(url);

	}

	// Navigate back
	public static void previousPage() {
		driver.navigate().back();

	}

	// Navigate forward
	public static void nextPage() {
		driver.navigate().forward();

	}

	// Navigate Refresh
	public static void RefreshPage() {
		driver.navigate().refresh();

	}

	// Get Title
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}

	// Get Url

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	// Get Options

	public static void allOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}
	}

	// Get First Selected Option
	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}

	// Get All Selected Options [only Multiple dropdown]
	public static void allSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}

	}

	// actions
	public static void actions(WebElement element1,WebElement element2, String type) {
		if (type.equalsIgnoreCase("click")) {
			Actions a = new Actions(driver);
			a.click(element1).perform();

		} else if (type.equalsIgnoreCase("rightclick")) {
			Actions a = new Actions(driver);
			a.contextClick(element1).perform();
		} else if (type.equalsIgnoreCase("moveto")) {
			Actions a = new Actions(driver);
			a.moveToElement(element1).perform();
		} else if (type.equalsIgnoreCase("dragdrop")) {
			Actions a = new Actions(driver);
			a.dragAndDrop(element1, element2).perform();
		}

	}
	
	
	
	

	// webelement

	// 1. Click
	// webelement

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// 2.sendkeys -->webelement , String

	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	// 3.getText --> Webelement

	public static String getValues(WebElement element) {

		String text = element.getText();

		return text;
	}

	// 4. select --> Webelement //String

	// selectbyvalue --> String
	// selectbyindex --> int
	// selectbyVisiabletext --> String

	public static void selectBy(WebElement element, String type, int index, String values) {

		if (type.equalsIgnoreCase("value")) {

			Select s = new Select(element);
			s.selectByValue(values);

		} else if (type.equalsIgnoreCase("index")) {
			Select s = new Select(element);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible")) {
			Select s = new Select(element);
			s.selectByVisibleText(values);
		} else {
			System.out.println("Invalid Type");
		}

	}

	// 5. Clear -----> Webelement
	public static void clearValues(WebElement element) {
		element.clear();

	}

	// 6. Is Displayed ----> Webelement
	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	// 7. Is Enabled ---->

	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	// 8. Is Selected ---->

	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	// 9. Get Attribute---->

	public static String getAttributeValue(WebElement element, String attributename) {
		String attributeValue = element.getAttribute(attributename);
		return attributeValue;

	}

	// 10. Get Tagname ---->

	public static String getTagName(WebElement element) {

		String tagName = element.getTagName();
		return tagName;
	}

	// 11/ Get CSS value ---->

	public static void cssValue(WebElement element, String type) {

		if (type.equalsIgnoreCase("font-size")) {
			String fontSize = element.getCssValue(type);
			System.out.println(fontSize);

		} else if (type.equalsIgnoreCase("color")) {

			String colour = element.getCssValue(type);
			System.out.println(colour);

		} else {
			System.out.println("invalid type");
		}
	}

}
