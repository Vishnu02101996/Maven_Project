package com.seli.org;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectSignInClass extends BaseClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Sellinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		WebElement signClick = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));

		clickOnElement(signClick);

		WebElement textvalue = driver.findElement(By.xpath("//h3[contains(text(),'Already registered?')]"));

		System.out.println(getValues(textvalue));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		inputValues(email, "vishnu2101996@gmail.com");

		Thread.sleep(1000);
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));

		inputValues(password, "Fzrider02");

		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));

		clickOnElement(submitBtn);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		WebElement dresses = driver.findElement(By.cssSelector(
//				"body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
		/*
		 * Actions a = new Actions(driver); a.moveToElement(dresses).perform();
		 * Thread.sleep(2000); WebElement dresses2 = driver.findElement( By.
		 * xpath("//li[@class='sfHover']//a[@title='Evening Dresses'][normalize-space()='Evening Dresses']"
		 * )); dresses2.click(); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,500)"); Thread.sleep(1000); WebElement
		 * product = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		 * a.moveToElement(product).perform(); Thread.sleep(1000); WebElement quickView
		 * = driver.findElement(By.xpath("//span[normalize-space()='Quick view']"));
		 * quickView.click(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS); driver.switchTo().frame(0); for (int i = 0; i < 14; i++) {
		 * driver.findElement(By.
		 * xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click
		 * (); } WebElement dropDown =
		 * driver.findElement(By.xpath("//select[@id='group_1']")); Select s = new
		 * Select(dropDown); s.selectByValue("2");
		 * driver.findElement(By.xpath("//a[@id='color_24']")).click();
		 * driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
		 * Thread.sleep(9000); TakesScreenshot scrShot0 = (TakesScreenshot) driver; File
		 * srcfile0 = scrShot0.getScreenshotAs(OutputType.FILE); File dest0 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot0.png");
		 * FileUtils.copyFile(srcfile0, dest0); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"
		 * )).click(); Thread.sleep(3000); js.executeScript("window.scrollBy(0,400)");
		 * TakesScreenshot scrShot = (TakesScreenshot) driver; File srcfile =
		 * scrShot.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot.png"); FileUtils.copyFile(srcfile,
		 * dest); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath(
		 * "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"))
		 * .click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//input[@id='cgv']")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]"
		 * )) .click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement( By.xpath(
		 * "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"
		 * )) .click(); Thread.sleep(3000); js.executeScript("window.scrollBy(0,400)");
		 * TakesScreenshot scrShot1 = (TakesScreenshot) driver; File srcfile1 =
		 * scrShot1.getScreenshotAs(OutputType.FILE); File dest1 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot1.png");
		 * FileUtils.copyFile(srcfile1, dest1); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"))
		 * .click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * js.executeScript("window.scrollBy(0,400)"); TakesScreenshot scrShot2 =
		 * (TakesScreenshot) driver; File srcfile2 =
		 * scrShot2.getScreenshotAs(OutputType.FILE); File dest2 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot2.png");
		 * FileUtils.copyFile(srcfile2, dest2); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement( By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]"
		 * )) .click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * WebElement product2 = driver.findElement(By.xpath(
		 * "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"
		 * )); a.moveToElement(product2).perform();
		 * driver.findElement(By.xpath("//span[normalize-space()='Quick view']")).click(
		 * ); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.switchTo().frame(0); for (int i = 0; i < 14; i++) {
		 * driver.findElement(By.
		 * xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click
		 * (); } WebElement dropDown2 =
		 * driver.findElement(By.xpath("//select[@id='group_1']")); Select s1 = new
		 * Select(dropDown2); s1.selectByValue("2");
		 * driver.findElement(By.xpath("//a[@id='color_14']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
		 * Thread.sleep(8000); TakesScreenshot scrShot3 = (TakesScreenshot) driver; File
		 * srcfile3 = scrShot3.getScreenshotAs(OutputType.FILE); File dest3 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot3.png");
		 * FileUtils.copyFile(srcfile3, dest3);
		 * driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * js.executeScript("window.scrollBy(0,400)"); TakesScreenshot scrShot4 =
		 * (TakesScreenshot) driver; File srcfile4 =
		 * scrShot4.getScreenshotAs(OutputType.FILE); File dest4 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot4.png");
		 * FileUtils.copyFile(srcfile4, dest4); Thread.sleep(2000);
		 * driver.findElement(By.
		 * xpath("//a[@class='button btn btn-default standard-checkout button-medium']")
		 * ).click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//input[@id='cgv']")).click();
		 * driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * js.executeScript("window.scrollBy(0,400)"); TakesScreenshot scrShot5 =
		 * (TakesScreenshot) driver; File srcfile5 =
		 * scrShot5.getScreenshotAs(OutputType.FILE); File dest5 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot5.png");
		 * FileUtils.copyFile(srcfile5, dest5); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']")
		 * ).click(); driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * js.executeScript("window.scrollBy(0,400)"); TakesScreenshot scrShot6 =
		 * (TakesScreenshot) driver; File srcfile6 =
		 * scrShot6.getScreenshotAs(OutputType.FILE); File dest6 = new
		 * File("C:\\Users\\WELCOME\\Desktop\\scrshot6.png");
		 * FileUtils.copyFile(srcfile6, dest6); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		 * driver.close();
		 */

	}

}
