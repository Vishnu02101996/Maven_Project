package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	

	public WebDriver driver;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginBtn;
	
}
