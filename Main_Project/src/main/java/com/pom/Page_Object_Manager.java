package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {
	public WebDriver driver;
	private Signin_Page signinP;
	public Signin_Page getInstanceSignin() {
		signinP=new Signin_Page(driver);
		return signinP;
	}
	public Search_Hotel_Page getInstanceSearch() {
		searchP=new Search_Hotel_Page(driver);
		return searchP;
	}
	public Select_Hotel_Page getInstanceSelect() {
		selectP=new Select_Hotel_Page(driver);
		return selectP;
	}
	public Book_Hotel_Page getInstanceBook() {
		bookP=new Book_Hotel_Page(driver);
		return bookP;
	}
	public Booked_Itinerary_Page getInstanceIti() {
		itiP=new Booked_Itinerary_Page(driver);
		return itiP;
	}
	public Booking_Confirm_Page getInstanceConfirm() {
		confirmP=new Booking_Confirm_Page(driver);
		return confirmP;
	}
	private Search_Hotel_Page searchP;
	private Select_Hotel_Page selectP;
	private Book_Hotel_Page bookP;
	private Booked_Itinerary_Page itiP;
	private Booking_Confirm_Page confirmP;
	
	

}
