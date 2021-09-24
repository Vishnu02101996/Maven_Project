package com.pomSdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress {
	public WebDriver driver;
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement product;

	public Eveningdress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

	public WebElement getColorSel() {
		return colorSel;
	}

	public WebElement getAddCartBtn() {
		return addCartBtn;
	}

	@FindBy(xpath = "//span[normalize-space()='Quick view']")
	private WebElement quickView;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement quantity;

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement dropDown;

	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement colorSel;

	@FindBy(xpath = "//p[@id='add_to_cart']")
	private WebElement addCartBtn;

}
