package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logoutBtn;
	public Booked_Itinerary_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

}
