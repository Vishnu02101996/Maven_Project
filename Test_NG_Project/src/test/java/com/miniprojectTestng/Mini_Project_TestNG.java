package com.miniprojectTestng;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Test_NG_Project.BaseClass1;
import com.helper.File_Reader_Manager;
import com.pomSdp.Page_Object_Manager;

public class Mini_Project_TestNG extends BaseClass1 {
	
	public static WebDriver driver = browserLaunch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Test
	private void url_Signin() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getURL(url);
		sleep(2000);
		clickOnElement(pom.getInstanceHp().getSignin_Btn());
		sleep(2000);
	}
	@Test
	private void user_Login() throws Throwable {
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
		inputValues(pom.getInstanceSp().getUsername(), username);
		String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		inputValues(pom.getInstanceSp().getPassword(), password);
		clickOnElement(pom.getInstanceSp().getSignin_Btn());
		waitSec(20);
	}
	@Test
	private void dressType() {
		actions(pom.getHp1().getDresses(), null, "moveto");
		clickOnElement(pom.getHp1().getEveningDress());
	}
	@Test
	private void addtoCart() throws Throwable {
		actions(pom.getEp().getProduct(), null, "moveto");
		clickOnElement(pom.getEp().getQuickView());
		waitSec(20);
		frame("index", "0", null);
		for (int i = 0; i < 14; i++) {
			clickOnElement(pom.getEp().getQuantity());
		}
		String size = read_Particular_Data("C:\\Users\\WELCOME\\Desktop\\selenium\\TestCasesForMiniProject.xlsx", 21, 5);
		selectBy(pom.getEp().getDropDown(), "value", size);
		clickOnElement(pom.getEp().getColorSel());
		clickOnElement(pom.getEp().getAddCartBtn());
		waitSec(20);
		String scrShot1 = File_Reader_Manager.getInstance().getInstanceCR().screenshot1();
		screenshot(scrShot1);
		sleep(2000);
	}
	@Test
	private void checkOut() throws Throwable {
		clickOnElement(pom.getCp().getCheckOut());
		sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		String scrShot2 = File_Reader_Manager.getInstance().getInstanceCR().screenshot2();
		screenshot(scrShot2);
		sleep(3000);
		clickOnElement(pom.getSp().getCheckOut1());
		waitSec(20);
		clickOnElement(pom.getAp().getCheckOut2());
		waitSec(20);
	}
	@Test
	private void shipping() throws InterruptedException {
		clickOnElement(pom.getShip().getCheckBox());
		sleep(2000);
		clickOnElement(pom.getShip().getCheckOut3());
		waitSec(20);

	}
	@Test
	private void payment_Orderconform() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickOnElement(pom.getPm().getPaymentMode());
		sleep(3000);
		js.executeScript("window.scrollBy(0,400)");
		String scrShot3 = File_Reader_Manager.getInstance().getInstanceCR().screenshot3();
		screenshot(scrShot3);
		sleep(2000);
		clickOnElement(pom.getPc().getConfirmOrder());
		waitSec(20);
		js.executeScript("window.scrollBy(0,400)");
		String scrShot4 = File_Reader_Manager.getInstance().getInstanceCR().screenshot4();
		screenshot(scrShot4);
		sleep(3000);

	}
	@Test
	private void signOut() {
		clickOnElement(pom.getLogout().getSignOut());
		close();
	}
	
	
}
