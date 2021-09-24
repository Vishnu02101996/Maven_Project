package com.seli.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoautomation {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WELCOME\\eclipse-workspace\\Seliniumm\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement nameFirst = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		nameFirst.sendKeys("Vishnu");
		WebElement nameLast = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		nameLast.sendKeys("Kanth");
		WebElement addRess = driver.findElement(By.xpath("//textarea[@rows='3']"));
		addRess.sendKeys("NO.3,MASILAMANI STREET,D.R.R.NAGAR,AVADI,CHENNAI");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("vishnu2101996@gmail.com");
		WebElement mobNo = driver.findElement(By.xpath("//input[@type='tel']"));
		mobNo.sendKeys("8825481560");
		WebElement genDer = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		genDer.click();
		WebElement hobby1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobby1.click();
		WebElement hobby2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobby2.click();
		WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
		language.click();
		WebElement lang1 = driver.findElement(By.xpath("//a[text()='English']"));
		lang1.click();
		WebElement lang2 = driver.findElement(By.xpath("//a[text()='French']"));
		lang2.click();
		WebElement lang3 = driver.findElement(By.xpath("//a[text()='Japanese']"));
		lang3.click();
		WebElement singleDrop = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(singleDrop);
		s.selectByIndex(34);
		WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s1 = new Select(countries);
		s1.selectByValue("India");
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s2 = new Select(country);
		s2.selectByVisibleText("India");
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select s3 = new Select(year);
		s3.selectByValue("1996");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4 = new Select(month);
		s4.selectByValue("October");
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select s5 = new Select(day);
		s5.selectByValue("2");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Srivasa@18");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Srivasa@18");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Refresh']")).click();
	

	}

}
