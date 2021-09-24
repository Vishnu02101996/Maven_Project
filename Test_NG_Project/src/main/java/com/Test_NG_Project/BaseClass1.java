package com.Test_NG_Project;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
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

	public static WebDriver driver;
	public static String value;

	public static WebDriver browserLaunch(String type) {

		if (type.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\WELCOME\\eclipse-workspace\\Test_NG_Project\\Driver\\chromedriver.exe");
//			System.setProperty("webdriver.chrome.driver",
//					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

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

		return driver;

	}

	public static void getURL(String url) {

		driver.get(url);

	}

	public static void waitSec(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	public static void screenshot(String path) throws IOException {

		TakesScreenshot shot = (TakesScreenshot) driver;

		File src = shot.getScreenshotAs(OutputType.FILE);

		File dest = new File(path);

		FileUtils.copyFile(src, dest);

	}

	public static void close() {
		driver.close();

	}

	public static void quit() {
		driver.quit();

	}

	public static void navigateUrl(String url) {
		driver.navigate().to(url);

	}

	public static void previousPage() {
		driver.navigate().back();

	}

	public static void nextPage() {
		driver.navigate().forward();

	}

	public static void RefreshPage() {
		driver.navigate().refresh();

	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public static void allOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}
	}

	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}

	public static void allSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement optList : options) {
			System.out.println(optList.getText());
		}

	}

	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}

	public static void actions(WebElement element1, WebElement element2, String type) {
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

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValues(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static String getValues(WebElement element) {

		String text = element.getText();

		return text;
	}

	public static void selectBy(WebElement element, String type, String values) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(values);
		} else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(values);
		}

	}

	public static void frame(String type, String values, WebElement element) {
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(values);
			driver.switchTo().frame(index);

		} else if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(values);
		} else if (type.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(element);
		}

	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void alert(String type, String value) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("ok")) {
			a.accept();
		} else if (type.equalsIgnoreCase("cancel")) {
			a.dismiss();
		} else if (type.equalsIgnoreCase("gettext")) {
			a.getText();
		} else if (type.equalsIgnoreCase("input")) {
			a.sendKeys(value);
		}
	}

	public static void clearValues(WebElement element) {
		element.clear();

	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;

	}

	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;

	}

	public static String getAttributeValue(WebElement element, String attributename) {
		String attributeValue = element.getAttribute(attributename);
		return attributeValue;

	}

	public static String getTagName(WebElement element) {

		String tagName = element.getTagName();
		return tagName;
	}

	public static String read_Particular_Data(String path, int row_index, int cell_index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType Type = cell.getCellType();
		if (Type.equals(CellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (Type.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int cellValue = (int) numericCellValue;
			value = Integer.toString(cellValue);

		}
		w.close();
		return value;

	}

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
