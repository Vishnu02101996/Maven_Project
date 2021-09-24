package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	private Home_Page hPage;

	public Home_Page getInstancehPage() {
		hPage = new Home_Page(driver);
		return hPage;

	}

	public Product_Page getInstancepPage() {
		pPage = new Product_Page(driver);
		return pPage;
	}

	private Product_Page pPage;
}
