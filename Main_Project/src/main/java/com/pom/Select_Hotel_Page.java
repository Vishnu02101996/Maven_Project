package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement selectHotel;
	public Select_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continueBtn;
}
