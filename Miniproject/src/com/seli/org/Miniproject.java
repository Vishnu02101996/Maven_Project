package com.seli.org;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Miniproject extends BaseClass1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Miniproject\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);

		WebElement signClick = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));

		clickOnElement(signClick);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));

		inputValues(email, "vishnu2101996@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));

		inputValues(password, "Fzrider02");

		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));

		clickOnElement(submitBtn);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement dresses = driver.findElement(By.cssSelector(
				"body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));

		Actions a = new Actions(driver);
		a.moveToElement(dresses).perform();

		WebElement dresses2 = driver.findElement(
				By.xpath("//li[@class='sfHover']//a[@title='Evening Dresses'][normalize-space()='Evening Dresses']"));
		clickOnElement(dresses2);

		js.executeScript("window.scrollBy(0,500)");

		WebElement product = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		a.moveToElement(product).perform();

		WebElement quickView = driver.findElement(By.xpath("//span[normalize-space()='Quick view']"));
		clickOnElement(quickView);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		for (int i = 0; i < 14; i++) {
			WebElement quantity = driver
					.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
			clickOnElement(quantity);
		}
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='group_1']"));
		selectBy(dropDown, "value", 0, "2");
		WebElement colorSel = driver.findElement(By.xpath("//a[@id='color_24']"));
		clickOnElement(colorSel);
		WebElement addCartBtn = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		clickOnElement(addCartBtn);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot shot = (TakesScreenshot) driver;

		File src = shot.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\WELCOME\\Desktop\\scrshot0.png");

		FileUtils.copyFile(src, dest);
		
		
		//screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot0.png");
		Thread.sleep(2000);
		WebElement checkOut = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		clickOnElement(checkOut);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot.png");
		Thread.sleep(2000);
		WebElement checkOut1 = driver
				.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]"));
		clickOnElement(checkOut1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkOut2 = driver
				.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
		clickOnElement(checkOut2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='cgv']"));
		clickOnElement(checkBox);
		Thread.sleep(2000);
		WebElement checkOut3 = driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]"));
		clickOnElement(checkOut3);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement paymentMode = driver.findElement(
				By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"));
		clickOnElement(paymentMode);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot1.png");
		Thread.sleep(2000);
		WebElement confirmOrder = driver
				.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]"));
		clickOnElement(confirmOrder);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot2.png");
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
		clickOnElement(logo);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement tshirt = driver.findElement(
				By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]"));
		clickOnElement(tshirt);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement product2 = driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']"));
		a.moveToElement(product2).perform();
		WebElement quickView2 = driver.findElement(By.xpath("//span[normalize-space()='Quick view']"));
		clickOnElement(quickView2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		for (int i = 0; i < 14; i++) {
			driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
		}
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='group_1']"));
		selectBy(dropDown2, "value", 0, "2");

		WebElement color2 = driver.findElement(By.xpath("//a[@id='color_14']"));
		clickOnElement(color2);
		Thread.sleep(2000);
		WebElement addCart2 = driver.findElement(By.xpath("//p[@id='add_to_cart']"));
		clickOnElement(addCart2);
		Thread.sleep(8000);
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot3.png");
		WebElement checkOut4 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(checkOut4);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot4.png");
		Thread.sleep(2000);
		WebElement checkOut5 = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		clickOnElement(checkOut5);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkOut6 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		clickOnElement(checkOut6);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='cgv']"));
		clickOnElement(checkBox2);
		WebElement checkOut7 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOnElement(checkOut7);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement paymentMode2 = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		clickOnElement(paymentMode2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot5.png");
		Thread.sleep(2000);
		WebElement orderConfirm2 = driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));
		clickOnElement(orderConfirm2);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,400)");
		screenshot("C:\\Users\\WELCOME\\Desktop\\scrshot6.png");
		Thread.sleep(2000);
		WebElement logOut = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(logOut);
		close();

	}

}
