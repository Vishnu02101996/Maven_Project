package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentConfirmPage {
	public WebDriver driver;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	private WebElement confirmOrder;
	public PaymentConfirmPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
}
