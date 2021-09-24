package com.Test_NG_Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pom.Page_Object_Manager;
import com.read_Property_File.File_Reader_Manager;

public class Test_ng_demo extends BaseClass1 {
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	@BeforeClass
	private void getUrl() throws Throwable {
		getURL(File_Reader_Manager.getInstance().getInstanceCR().getUrl());
		sleep(2000);
	}
	@BeforeMethod
	private void login() throws Throwable {
		inputValues(pom.getInstancehPage().getUsername(), File_Reader_Manager.getInstance().getInstanceCR().userName());
		inputValues(pom.getInstancehPage().getPassword(), File_Reader_Manager.getInstance().getInstanceCR().passWord());
		clickOnElement(pom.getInstancehPage().getLoginBtn());
		sleep(4000);
	}
	@Test
	private void searchMobiles() throws InterruptedException, Throwable {
		inputValues(pom.getInstancepPage().getSearchbar(),
				File_Reader_Manager.getInstance().getInstanceCR().mobileSearch());
		sleep(2000);
		clickOnElement(pom.getInstancepPage().getSearch());
		sleep(4000);
		screenshot(File_Reader_Manager.getInstance().getInstanceCR().screenShotMobile());
	}
	@Test
	private void searchLaptops() throws InterruptedException, Throwable {
		inputValues(pom.getInstancepPage().getSearchbar(),
				File_Reader_Manager.getInstance().getInstanceCR().laptopSearch());
		sleep(2000);
		clickOnElement(pom.getInstancepPage().getSearch());
		sleep(4000);
		screenshot(File_Reader_Manager.getInstance().getInstanceCR().screenShotLaptop());
	}
	@AfterMethod
	private void logout() throws InterruptedException {
		actions(pom.getInstancepPage().getProfileMousehover(), null, "moveto");
		clickOnElement(pom.getInstancepPage().getLogOut());
		sleep(4000);
	}
	@AfterClass
	private void closeBrowser() {
		close();
	}

}
