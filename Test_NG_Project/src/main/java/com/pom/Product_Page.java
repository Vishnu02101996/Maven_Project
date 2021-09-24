package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchbar;
	public Product_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchbar() {
		return searchbar;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getProfileMousehover() {
		return profileMousehover;
	}
	public WebElement getLogOut() {
		return logOut;
	}
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")
	private WebElement search;
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]")
	private WebElement profileMousehover;
	@FindBy(xpath="//a[@href='#']")
	private WebElement logOut;
}
