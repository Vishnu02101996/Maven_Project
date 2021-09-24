package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkOut;

	public Cartpage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

}
