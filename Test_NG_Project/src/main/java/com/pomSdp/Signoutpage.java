package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signoutpage {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signOut;
	public Signoutpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSignOut() {
		return signOut;
	}
}
