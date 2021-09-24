package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public WebDriver driver;
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	public Search_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomCount() {
		return roomCount;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultsCount() {
		return adultsCount;
	}
	public WebElement getChildCount() {
		return childCount;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomCount;
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsCount;
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childCount;
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement searchBtn;
}
