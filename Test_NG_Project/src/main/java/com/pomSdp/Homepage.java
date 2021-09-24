package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver; //----> null

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin_Btn;

	

	public Homepage(WebDriver driver2) { 
		this.driver=driver2; // null to chrome;
		PageFactory.initElements(driver, this);
	}



	public WebElement getSignin_Btn() {
		return signin_Btn; 
	}

	

}
