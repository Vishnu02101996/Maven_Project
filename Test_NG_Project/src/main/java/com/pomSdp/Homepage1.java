package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {

	public WebDriver driver;

	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
	private WebElement dresses;

	public Homepage1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEveningDress() {
		return eveningDress;
	}

	@FindBy(xpath = "//li[@class='sfHover']//a[@title='Evening Dresses'][normalize-space()='Evening Dresses']")
	private WebElement eveningDress;
}
