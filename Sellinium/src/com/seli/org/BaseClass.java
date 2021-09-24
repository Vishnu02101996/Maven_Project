package com.seli.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	
	//webelement
	
	//1. Click
	//webelement 
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	
	//2.sendkeys -->webelement , String
	
	public static void inputValues(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	
	//3.getText --> Webelement
	
	public static String getValues(WebElement element) {
		
		String text = element.getText();
		
		return text;
	}
	
	
	//4.select	--> Webelement    //String
	
	//selectbyvalue --> String		
	//selectbyindex --> int
	//selectbyVisiabletext	--> String
	
	public static void selectBy(WebElement element,String type,int index,String values) {
		
		
		if (type.equalsIgnoreCase("value")) {
			
			Select s=new Select(element);
			s.selectByValue(values);
			
		}else if (type.equalsIgnoreCase("index")) {
			Select s=new Select(element);
			s.selectByIndex(index);
		}else if (type.equalsIgnoreCase("visible")) {
			Select s=new Select(element);
			s.selectByVisibleText(values);
		}else {
			System.out.println("Invalid Type");
		}
	
	}
	
	// 5. Clear -----> Webelement
	public static void clearValues(WebElement element) {
		element.clear();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
