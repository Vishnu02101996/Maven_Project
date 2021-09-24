package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresspage {
	public WebDriver driver;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	private WebElement checkOut2;
	public Addresspage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckOut2() {
		return checkOut2;
	}
}
