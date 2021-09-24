package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingpage {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='cgv']")
	private WebElement checkBox;
	public Shippingpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getCheckOut3() {
		return checkOut3;
	}
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]")
	private WebElement checkOut3;
	
}
